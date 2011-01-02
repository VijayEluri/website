package org.oobium.www.update_site;

import org.oobium.app.ModuleService;
import org.oobium.app.server.routing.Router;
import org.oobium.utils.Config;

public class Activator extends ModuleService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.addAssetRoutes();
	}

}