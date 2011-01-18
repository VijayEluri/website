package org.oobium.guides.models.guides;

import org.oobium.app.server.view.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.oobium_routing.Intro;
import org.oobium.guides.views.guides.oobium_routing.adding_basic_authentication.AddingBasicAuthentication;
import org.oobium.guides.views.guides.oobium_routing.defining_home.DefiningHome;
import org.oobium.guides.views.guides.oobium_routing.free_form_routing.FreeFormRouting;
import org.oobium.guides.views.guides.oobium_routing.free_form_routing.RoutingDirectToTheController;
import org.oobium.guides.views.guides.oobium_routing.free_form_routing.RoutingViewsAndAssets;
import org.oobium.guides.views.guides.oobium_routing.named_routes.ExplicitlyNamedRoutes;
import org.oobium.guides.views.guides.oobium_routing.named_routes.ImplicitlyNamedRoutes;
import org.oobium.guides.views.guides.oobium_routing.named_routes.NamedRoutes;
import org.oobium.guides.views.guides.oobium_routing.publishing_routes.PublishingRoutes;
import org.oobium.guides.views.guides.oobium_routing.redirects.Redirects;
import org.oobium.guides.views.guides.oobium_routing.removing_routes.RemovingRoutes;
import org.oobium.guides.views.guides.oobium_routing.restful_routing.CRUDVerbsAndActions;
import org.oobium.guides.views.guides.oobium_routing.restful_routing.NestedResources;
import org.oobium.guides.views.guides.oobium_routing.restful_routing.PartialRestfulRouting;
import org.oobium.guides.views.guides.oobium_routing.restful_routing.PathsAndURLs;
import org.oobium.guides.views.guides.oobium_routing.restful_routing.RestfulRouting;
import org.oobium.guides.views.guides.oobium_routing.restful_routing.RoutingASingleResource;
import org.oobium.guides.views.guides.oobium_routing.the_purpose_of_the_oobium_router.ConnectingURLsToCode;
import org.oobium.guides.views.guides.oobium_routing.the_purpose_of_the_oobium_router.GeneratingPathsAndURLsFromCode;
import org.oobium.guides.views.guides.oobium_routing.the_purpose_of_the_oobium_router.ThePurposeOfTheOobiumRouter;
import org.oobium.guides.views.guides.oobium_routing.variables_and_constants.VariablesAndConstants;

public class OobiumRouting extends Guide {

	public OobiumRouting() {
		super(new Intro());
		summary = "If you want to understand how to use routing in your own Oobium applications, start here.";
		chapters = new Chapter[] { 
			/*1*/ new Chapter(new ThePurposeOfTheOobiumRouter(), new View[] {
									new ConnectingURLsToCode(),
									new GeneratingPathsAndURLsFromCode()
								}),
								
			/*2*/ new Chapter(new RestfulRouting(), new View[] {
									new CRUDVerbsAndActions(),
									new PathsAndURLs(),
									new PartialRestfulRouting(),
									new RoutingASingleResource(),
									new NestedResources()
								}),
			
			/*3*/ new Chapter(new FreeFormRouting(), new View[] {
									new RoutingDirectToTheController(),
									new RoutingViewsAndAssets()
								}),
								
			/*4*/ new Chapter(new DefiningHome()),

			/*5*/ new Chapter(new VariablesAndConstants()),

			/*6*/ new Chapter(new NamedRoutes(), new View[] {
									new ExplicitlyNamedRoutes(),
									new ImplicitlyNamedRoutes()
								}),

			/*7*/ new Chapter(new Redirects()),
			
			/*8*/ new Chapter(new AddingBasicAuthentication()),

			/*9*/ new Chapter(new PublishingRoutes()),

			/*10*/new Chapter(new RemovingRoutes()),
		};
	}

}
