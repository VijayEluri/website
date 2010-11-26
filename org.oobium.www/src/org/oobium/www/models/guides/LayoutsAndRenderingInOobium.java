package org.oobium.www.models.guides;

import org.oobium.www.models.Chapter;
import org.oobium.www.models.Guide;
import org.oobium.www.models.Ticket;
import org.oobium.www.views.guides.layouts_and_rendering_in_oobium.Intro;

public class LayoutsAndRenderingInOobium extends Guide {

	public LayoutsAndRenderingInOobium() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the basic layout features of Oobium's Controllers and Views, including rendering and redirecting, using contentFor blocks, and working with partials.";
		chapters = new Chapter[] { };
	}

}
