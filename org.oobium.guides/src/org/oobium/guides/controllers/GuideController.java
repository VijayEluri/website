package org.oobium.guides.controllers;

import static org.oobium.guides.models.Guide.guides;

import java.sql.SQLException;

import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.ShowAllGuides;
import org.oobium.guides.views.guides.ShowGuide;

public class GuideController extends ApplicationController {

	@Override
	public void show() throws SQLException {
		Guide guide = guides.get(param("guide"));
		if(guide != null) {
			render(new ShowGuide(guide));
			String src = response.getBody();
			src = new SyntaxColorer(src).color();
			response.setBody(src);
		}
	}
	
	@Override
	public void showAll() throws SQLException {
		render(new ShowAllGuides());
	}
	
}
