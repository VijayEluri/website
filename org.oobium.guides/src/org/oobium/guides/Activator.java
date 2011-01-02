package org.oobium.guides;

import static org.oobium.app.server.controller.Action.show;
import static org.oobium.app.server.controller.Action.showAll;

import org.oobium.app.AppService;
import org.oobium.app.server.routing.Router;
import org.oobium.guides.controllers.GuideController;
import org.oobium.guides.views._layouts.Styles;
import org.oobium.utils.Config;
import org.oobium.utils.Config.Mode;

public class Activator extends AppService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.addAssetRoutes();
		router.addAsset(Styles.class);
		
		if(config.getMode() == Mode.DEV) {
			router.addRoute("/guides", GuideController.class, showAll);
			router.add("showGuide").asRoute("/guides/{guide:[\\w_]+}", GuideController.class, show);
		} else {
			router.setHome(GuideController.class, showAll);
			router.addRoute("/{guide:[\\w_]+}", GuideController.class, show);
		}
	}

}