package org.oobium.www.controllers;

import java.util.Map;
import org.oobium.app.server.controller.Controller;
import org.oobium.http.HttpRequest;

public class ApplicationController extends Controller {

	public ApplicationController(HttpRequest request, Map<String, Object> routeParams) {
		super(request, routeParams);
	}

}