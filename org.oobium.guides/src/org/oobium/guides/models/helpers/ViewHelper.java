package org.oobium.guides.models.helpers;

import java.lang.reflect.Field;

import org.oobium.app.views.View;

public class ViewHelper {

	public static String getTitle(View view) {
		try {
			Field field = view.getClass().getField("title");
			return (String) field.get(view);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return "<title>";
	}
	
}
