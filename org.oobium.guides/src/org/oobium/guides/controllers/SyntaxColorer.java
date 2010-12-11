package org.oobium.guides.controllers;

import static org.oobium.utils.CharStreamUtils.findAll;
import static org.oobium.utils.CharStreamUtils.isNext;

public class SyntaxColorer {

	private static final char[] JAVA_START = "<code class=\"java\">".toCharArray();
	private static final char[] CODE_END = "</code>".toCharArray();

	private static final String JAVA_KEYWORD_REGEX = "\\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|false|final|finally|float|for|goto|if|implements|import|instanceof|int|interface|long|native|new|null|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|true|try|void|volatile|while)\\b";
	private static final String JAVA_KEYWORD_REPLACEMENT = "<span class=\"javaKeyword\"><b>$1</b></span>";

	
	private String src;
	
	public SyntaxColorer(String src) {
		this.src = src;
	}

	public String color() {
		char[] ca = src.toCharArray();
		int s1 = 0;
		while(s1 != -1) {
			if(isNext(ca, s1, JAVA_START)) {
				int s2 = findAll(ca, s1+1, CODE_END);
				if(s2 == -1) {
					break;
				} else {
					s1 += JAVA_START.length;
					String s = java(src.substring(s1, s2));
					src = src.substring(0, s1) + s + src.substring(s2, src.length());
					ca = src.toCharArray();
					s1 = s1 + s.length() + 1;
				}
			} else {
				s1++;
			}
		}
		return src;
	}
	
	private String java(String s) {
		StringBuilder sb = new StringBuilder(s.length() + 250);
		char[] ca = s.toCharArray();
		int start = 0, s1 = 0;
		while(s1 < ca.length) {
			if(ca[s1] == '"') {
				sb.append(new String(ca, start, s1-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
				int s2 = s1+1;
				while(s2 < ca.length) {
					if(ca[s2] == '"' && ca[s2-1] != '/') {
						s2++;
						break;
					}
					s2++;
				}
				sb.append("<span class=\"javaText\">");
				sb.append(ca, s1, s2-s1);
				sb.append("</span>");
				s1 = start = s2;
			} else if(isNext(ca, s1, '&','q','u','o','t',';')) {
				sb.append(new String(ca, start, s1-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
				int s2 = s1+6;
				while(s2 < ca.length) {
					if(isNext(ca, s2, '&','q','u','o','t',';')) {
						s2+=6;
						break;
					}
					s2++;
				}
				sb.append("<span class=\"javaText\">");
				sb.append(ca, s1, s2-s1);
				sb.append("</span>");
				s1 = start = s2;
			} else if(ca[s1] == '@') {
				sb.append(new String(ca, start, s1-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
				int s2 = s1+1;
				while(s2 < ca.length) {
					if(!Character.isJavaIdentifierPart(ca[s2])) {
						break;
					}
					s2++;
				}
				sb.append("<span class=\"javaAnnotation\">");
				sb.append(ca, s1, s2-s1);
				sb.append("</span>");
				s1 = start = s2;
			} else if(ca[s1] == '/' && s1+1 < ca.length && ca[s1+1] == '/') {
				sb.append(new String(ca, start, s1-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
				int s2 = s1+1;
				while(s2 < ca.length) {
					if(ca[s2] == '\n') {
						break;
					}
					s2++;
				}
				sb.append("<span class=\"javaComment\">");
				sb.append(ca, s1, s2-s1);
				sb.append("</span>");
				s1 = start = s2;
			} else if(ca[s1] == '/' && s1+1 < ca.length && ca[s1+1] == '*') {
				sb.append(new String(ca, start, s1-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
				int s2 = s1+1;
				while(s2 < ca.length) {
					if(ca[s2] == '/' && ca[s2-1] == '*') {
						s2++;
						break;
					}
					s2++;
				}
				if(s1+2 < ca.length && ca[s1+2] == '*') {
					sb.append("<span class=\"javaJavaDoc\">"); // javadoc comment
				} else {
					sb.append("<span class=\"javaComment\">"); // regular comment
				}
				sb.append(ca, s1, s2-s1);
				sb.append("</span>");
				s1 = start = s2;
			} else if(isNext(ca, s1, '<','s','p','a','n',' ')) {
				sb.append(new String(ca, start, s1-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
				int s2 = s1+6;
				while(s2 < ca.length) {
					if(isNext(ca, s2, '<','/','s','p','a','n','>')) {
						s2++;
						break;
					}
					s2++;
				}
				sb.append(ca, s1, s2-s1);
				s1 = start = s2;
			} else {
				s1++;
			}
		}
		if(start < ca.length) {
			sb.append(new String(ca, start, ca.length-start).replaceAll(JAVA_KEYWORD_REGEX, JAVA_KEYWORD_REPLACEMENT));
		}
		return sb.toString();
	}
	
}
