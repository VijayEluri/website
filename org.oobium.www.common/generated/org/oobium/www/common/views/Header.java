package org.oobium.www.common.views;

import static org.oobium.utils.ArrayUtils.*;
import static org.oobium.utils.StringUtils.*;
import static org.oobium.utils.Utils.*;
import static org.oobium.utils.json.JsonUtils.*;

import org.oobium.app.controllers.HttpController;
import org.oobium.app.http.Action;
import org.oobium.app.views.View;

@SuppressWarnings("unused")
public class Header extends View {

	@Override
	protected void render(StringBuilder __head__, StringBuilder __body__) throws Exception {
		__body__.append("<ul><li class=\"firstTab\"><a href=\"http://www.oobium.org\">Oobium.org</a></li><li class=\"tab\"><a href=\"http://guides.oobium.org/\">Guides</a></li><li class=\"tab\"><a href=\"http://www.oobium.org/install\">Install</a></li><li class=\"tab\"><a href=\"http://www.oobium.org/deploy\">Deploy</a></li><li class=\"tab\"><a href=\"http://www.oobium.org/license\">License</a></li><li class=\"lastTab\"><a href=\"https://github.com/oobium\">GitHub</a></li></ul>");
	}

}