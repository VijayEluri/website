package org.oobium.guides.models.guides;

import org.oobium.app.views.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.all_about_esp_files.Intro;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_java.EmbeddingJava;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_java.JavaElements;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_java.JavaParts;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_java.Strings;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_other_esp_files.EmbeddingOtherEspFiles;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_other_esp_files.Views;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.ElementHierarchy;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.EspElements;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.EspMarkup;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.HtmlHeadAndBody;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.MultilineElements;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.Constructors;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.FileStructure;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.HtmlContent;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.ImportStatements;
import org.oobium.guides.views.guides.all_about_esp_files.forms.Forms;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.EjsFiles;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.EmbeddingJavaInScripts;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.ExternalJavascriptFiles;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.InlineScripts;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.Javascript;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.ModelsInJavascript;
import org.oobium.guides.views.guides.all_about_esp_files.style_sheets.EmbeddingJavaInStyles;
import org.oobium.guides.views.guides.all_about_esp_files.style_sheets.EssFiles;
import org.oobium.guides.views.guides.all_about_esp_files.style_sheets.ExternalStyleSheets;
import org.oobium.guides.views.guides.all_about_esp_files.style_sheets.InlineStyles;
import org.oobium.guides.views.guides.all_about_esp_files.style_sheets.StyleSheets;
import org.oobium.guides.views.guides.all_about_esp_files.what_is_an_esp_file.WhatIsAnEspFile;

public class AllAboutEspFiles extends Guide {

	public AllAboutEspFiles() {
		super(new Intro());
		summary = "This guide is to teach you all there is to know about creating ESP files in OObium.";
		chapters = new Chapter[] {
			/*1*/ new Chapter(new WhatIsAnEspFile()),
			
			/*2*/ new Chapter(new FileStructure(), new View[] {
									new ImportStatements(),
									new Constructors(),
									new HtmlContent()
								}),
			
			/*3*/ new Chapter(new EspMarkup(), new View[] {
									new EspElements(),
									new ElementHierarchy(),
									new MultilineElements(),
									new HtmlHeadAndBody()
								}),

			/*4*/ new Chapter(new EmbeddingJava(), new View[] {
									new JavaElements(),
									new JavaParts(),
									new Strings()
								}),

			/*5*/ new Chapter(new EmbeddingOtherEspFiles(), new View[] {
									new Views()
								}),

			/*5*/ new Chapter(new StyleSheets(), new View[] {
									new ExternalStyleSheets(),
									new InlineStyles(),
									new EmbeddingJavaInStyles(),
									new EssFiles()
								}),

			/*6*/ new Chapter(new Javascript(), new View[] {
									new ExternalJavascriptFiles(),
									new ModelsInJavascript(),
									new InlineScripts(),
									new EmbeddingJavaInScripts(),
									new EjsFiles()
								}),

			/*7*/ new Chapter(new Forms())
		};
	}

}
