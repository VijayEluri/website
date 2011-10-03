package org.oobium.guides.controllers.caches;

import org.oobium.app.controllers.ControllerCache;
import org.oobium.app.controllers.HttpController;
import org.oobium.guides.models.Guide;

public class GuideCache extends ControllerCache<Guide> {

	@Override
	protected String getKey(HttpController controller) {
		return createKey(controller.param("guide"));
	}

}