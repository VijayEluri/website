package org.oobium.www.common.views;

import static org.oobium.app.server.controller.Action.*;
import static org.oobium.utils.ArrayUtils.*;
import static org.oobium.utils.StringUtils.*;
import static org.oobium.utils.Utils.*;
import static org.oobium.utils.json.JsonUtils.*;

import org.oobium.app.server.controller.Controller;
import org.oobium.app.server.view.View;

@SuppressWarnings("unused")
public class Header extends View {

	@Override
	public void doRenderBody(StringBuilder __sb__) throws Exception {
		__sb__.append("<ul><li class=\"firstTab\"><a href=\"http://www.oobium.org\">Oobium.org</a></li><li class=\"tab\"><a href=\"http://guides.oobium.org/\">Guides</a></li><li class=\"tab\"><a href=\"http://www.oobium.org/install\">Install</a></li><li class=\"tab\"><a href=\"http://www.oobium.org/license\">License</a></li><li class=\"lastTab\"><a href=\"https://github.com/oobium\">GitHub</a></li></ul>");
	}

}