package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.layouts_and_rendering_in_oobium.Intro;

public class LayoutsAndRenderingInOobium extends Guide {

	public LayoutsAndRenderingInOobium() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the basic layout features of Oobium's Controllers and Views, including rendering and redirecting, using contentFor blocks, and working with partials.";
		chapters = new Chapter[] { };
	}

}
