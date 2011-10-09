package org.oobium.www;

import org.oobium.app.AppService;
import org.oobium.app.routing.Router;
import org.oobium.utils.Config;
import org.oobium.www.views._layouts.Styles;
import org.oobium.www.views.pages.Deploy;
import org.oobium.www.views.pages.FullInstall;
import org.oobium.www.views.pages.Home;
import org.oobium.www.views.pages.Install;
import org.oobium.www.views.pages.License;

public class Activator extends AppService {

	@Override
	public void addRoutes(Config config, Router router) {
		router.setHome(Home.class);
		router.addAssetRoutes();
		router.addAsset(Styles.class);
		router.add("deploy").asView(Deploy.class);
		router.add("install").asView(Install.class);
		router.add("fullInstall").asView("full_install", FullInstall.class);
		router.addView("license", License.class);

		router.addRedirect("/full_installation", "/full_install");
		
		router.addFiles("updates");
	}

}