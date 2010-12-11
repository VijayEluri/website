package org.oobium.www;

import org.oobium.app.AppService;
import org.oobium.app.server.routing.Router;
import org.oobium.utils.Config;
import org.oobium.www.views._layouts.Styles;

public class Activator extends AppService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.addAssetRoutes(this);
		router.addRoute(Styles.class);
	}

}