package org.oobium.www.controllers;

import static org.oobium.www.models.Guide.guides;

import java.sql.SQLException;
import java.util.Map;

import org.oobium.http.HttpRequest;
import org.oobium.www.models.Guide;
import org.oobium.www.views.guides.ShowAllGuides;
import org.oobium.www.views.guides.ShowGuide;

public class GuideController extends ApplicationController {

	public GuideController(HttpRequest request, Map<String, Object> routeParams) {
		super(request, routeParams);
	}

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
