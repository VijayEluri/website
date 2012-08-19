package org.oobium.guides.models;

import org.oobium.app.views.View;

public class Section {

	public final String title;
	public final View view;
	
	public Section(String title, View view) {
		this.title = title;
		this.view = view;
	}
	
}
