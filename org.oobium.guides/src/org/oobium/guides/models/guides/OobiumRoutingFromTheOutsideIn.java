package org.oobium.guides.models.guides;

import org.oobium.app.server.view.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.Intro;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.pseudo_restful_routing.PseudoRestfulRouting;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.restful_routing.CRUDVerbsAndActions;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.restful_routing.PartialRestfulRouting;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.restful_routing.PathsAndURLs;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.restful_routing.RestfulRouting;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.the_purpose_of_the_oobium_router.ConnectingURLsToCode;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.the_purpose_of_the_oobium_router.GeneratingPathsAndURLsFromCode;
import org.oobium.guides.views.guides.oobium_routing_from_the_outside_in.the_purpose_of_the_oobium_router.ThePurposeOfTheOobiumRouter;

public class OobiumRoutingFromTheOutsideIn extends Guide {

	public OobiumRoutingFromTheOutsideIn() {
		super(new Intro());
		summary = "This guide covers the user-facing features of Oobium routing. If you want to understand how to use routing in your own Oobium applications, start here.";
		chapters = new Chapter[] { 
			/*1*/ new Chapter(new ThePurposeOfTheOobiumRouter(), new View[] {
									new ConnectingURLsToCode(),
									new GeneratingPathsAndURLsFromCode()
								}),
								
			/*2*/ new Chapter(new RestfulRouting(), new View[] {
									new CRUDVerbsAndActions(),
									new PathsAndURLs(),
									new PartialRestfulRouting()
								}),
			
			/*3*/ new Chapter(new PseudoRestfulRouting()),
		};
	}

}
