package org.oobium.www;

import static org.oobium.app.server.controller.Action.show;
import static org.oobium.app.server.controller.Action.showAll;

import org.oobium.app.AppService;
import org.oobium.app.server.routing.Router;
import org.oobium.utils.Config;
import org.oobium.utils.Config.Mode;
import org.oobium.www.controllers.GuideController;
import org.oobium.www.views._layouts.Styles;

public class Activator extends AppService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.addAssetRoutes(this);
		router.addRoute(Styles.class);
		
		if(config.getMode() == Mode.DEV) {
			router.add("guide").asRoute("/guides", GuideController.class, showAll);
			router.add("guide").asRoute("/guides/{guide:[\\w_]+}", GuideController.class, show);
		} else {
			router.setHome(GuideController.class, showAll);
			router.add("guide").asRoute("{guide:[\\w_]+}", GuideController.class, show);
		}
	}

}