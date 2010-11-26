package org.oobium.www.models.guides;

import org.oobium.www.models.Chapter;
import org.oobium.www.models.Guide;
import org.oobium.www.models.Ticket;
import org.oobium.www.views.guides.oobium_routing_from_the_outside_in.Intro;

public class OobiumRoutingFromTheOutsideIn extends Guide {

	public OobiumRoutingFromTheOutsideIn() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the user-facing features of Oobium routing. If you want to understand how to use routing in your own Oobium applications, start here.";
		chapters = new Chapter[] { };
	}

}
