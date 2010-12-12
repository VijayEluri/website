package org.oobium.www;

import org.oobium.app.AppService;
import org.oobium.app.server.routing.Router;
import org.oobium.utils.Config;
import org.oobium.www.views._layouts.Styles;
import org.oobium.www.views.pages.Home;

public class Activator extends AppService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.setHome(Home.class);
		router.addAssetRoutes(this);
		router.addRoute(Styles.class);
	}

}