package org.oobium.guides;

import static org.oobium.app.server.controller.Action.show;
import static org.oobium.app.server.controller.Action.showAll;

import org.oobium.app.AppService;
import org.oobium.app.server.routing.Router;
import org.oobium.guides.controllers.GuideController;
import org.oobium.guides.views._layouts.Styles;
import org.oobium.utils.Config;

public class Activator extends AppService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.addAssetRoutes();
		router.addAsset(Styles.class);
		
		router.setHome(GuideController.class, showAll);
		
		router.addRoute("/{guide:[\\w_]+}", GuideController.class, show);
		
		router.addRedirect("/getting_started_with_oobium", "/getting_started");
		router.addRedirect("/oobium_routing_from_the_outside_in", "/oobium_routing");
	}

}