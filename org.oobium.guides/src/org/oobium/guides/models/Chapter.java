package org.oobium.guides.models;

import static org.oobium.guides.models.helpers.ViewHelper.getTitle;

import org.oobium.app.views.View;
import org.oobium.utils.StringUtils;


public class Chapter {

	private static final String REGEX = "[\\?\\!,]";
	public String title;
	public View intro;
	public View[] sections;
	
	public Chapter(View view) {
		this(view, new View[0]);
	}
	
	public Chapter(View intro, View[] sections) {
		this.title = getTitle(intro);
		this.intro = intro;
		this.sections = sections;
	}
	
	public String getId() {
		return StringUtils.underscored(title).replaceAll(REGEX, "");
	}
	
	public String getId(View view) {
		return StringUtils.underscored(title + "-" + getTitle(view)).replaceAll(REGEX, "");
	}
	
	public String getPath() {
		return "#" + getId();
	}
	
	public String getPath(View view) {
		return "#" + getId(view);
	}
	
}
