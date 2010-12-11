package org.oobium.guides.models.guides;

import org.oobium.app.server.view.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.getting_started.adding_a_second_model.AddingARouteForComments;
import org.oobium.guides.views.guides.getting_started.adding_a_second_model.AddingASecondModel;
import org.oobium.guides.views.guides.getting_started.adding_a_second_model.AssociatingModels;
import org.oobium.guides.views.guides.getting_started.adding_a_second_model.CreatingAController;
import org.oobium.guides.views.guides.getting_started.adding_a_second_model.CreatingAModel;
import org.oobium.guides.views.guides.getting_started.background.Background;
import org.oobium.guides.views.guides.getting_started.background.OobiumAndOSGi;
import org.oobium.guides.views.guides.getting_started.background.OobiumAndRails;
import org.oobium.guides.views.guides.getting_started.background.OobiumAndXml;
import org.oobium.guides.views.guides.getting_started.building_a_multimodel_form.BuildingAMultimodelForm;
import org.oobium.guides.views.guides.getting_started.creating_a_new_web_application.CreatingANewWebApplication;
import org.oobium.guides.views.guides.getting_started.creating_a_new_web_application.CreatingTheApplication;
import org.oobium.guides.views.guides.getting_started.creating_a_new_web_application.SetTheHomePage_App;
import org.oobium.guides.views.guides.getting_started.creating_a_new_web_application.StartTheServer_App;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.AddingALink;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.AddingSomeValidation;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.CreatingAResource;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.CreatingNewPosts;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.CustomizingTheLayout;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.DestroyingAPost;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.EditingPosts;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.ListingAllPosts;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.RunningAMigration;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.ShowingAnIndividualPost;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.TheModel;
import org.oobium.guides.views.guides.getting_started.creating_a_resource.WorkingWithPostsInTheBrowser;
import org.oobium.guides.views.guides.getting_started.deleting_comments.DeletingAssociatedObjects;
import org.oobium.guides.views.guides.getting_started.deleting_comments.DeletingComments;
import org.oobium.guides.views.guides.getting_started.guide_assumptions.GuideAssumptions;
import org.oobium.guides.views.guides.getting_started.installing_oobium.InstallViaSource;
import org.oobium.guides.views.guides.getting_started.installing_oobium.InstallViaUpdateSite;
import org.oobium.guides.views.guides.getting_started.installing_oobium.InstallingOobium;
import org.oobium.guides.views.guides.getting_started.license.License;
import org.oobium.guides.views.guides.getting_started.refactoring.PartialCollections;
import org.oobium.guides.views.guides.getting_started.refactoring.PartialForms;
import org.oobium.guides.views.guides.getting_started.refactoring.Refactoring;
import org.oobium.guides.views.guides.getting_started.security.Security;
import org.oobium.guides.views.guides.getting_started.what_is_oobium.MVCArchitecture;
import org.oobium.guides.views.guides.getting_started.what_is_oobium.REST;
import org.oobium.guides.views.guides.getting_started.what_is_oobium.WhatIsOobium;
import org.oobium.guides.views.guides.getting_started_with_oobium.GettingStartedIntro;

public class GettingStarted extends Guide {

	public GettingStarted() {
		super(new GettingStartedIntro());
		summary = "This guide is to help you get up and running with Oobium. It will show you how all of the pieces work together.";
		chapters = new Chapter[] {
			/*1*/ new Chapter(new GuideAssumptions()),
			
			/*2*/ new Chapter(new License()),

			/*3*/ new Chapter(new Background(), new View[] {
									new OobiumAndRails(),
									new OobiumAndOSGi(),
									new OobiumAndXml()
								}),
								
			/*4*/ new Chapter(new WhatIsOobium(), new View[] { 
									new MVCArchitecture(), 
									new REST()
								}),

			/*5*/ new Chapter(new InstallingOobium(), new View[] {
									new InstallViaUpdateSite(),
									new InstallViaSource()
								}),

			/*6*/ new Chapter(new CreatingANewWebApplication(), new View[] {
									new CreatingTheApplication(),
									new StartTheServer_App(), 
									new SetTheHomePage_App()
								}),
								
			/*7*/ new Chapter(new CreatingAResource(), new View[] {
									new TheModel(),
									new AddingSomeValidation(),
									new RunningAMigration(),
									new AddingALink(),
									new WorkingWithPostsInTheBrowser(),
									new ListingAllPosts(),
									new CustomizingTheLayout(),
									new CreatingNewPosts(),
									new ShowingAnIndividualPost(),
									new EditingPosts(),
									new DestroyingAPost()
								}),
								
			/*8*/ new Chapter(new AddingASecondModel(), new View[] {
									new CreatingAModel(),
									new AssociatingModels(),
									new AddingARouteForComments(),
									new CreatingAController()
								}),
								
			/*9*/ new Chapter(new Refactoring(), new View[] {
									new PartialCollections(),
									new PartialForms()
								}),
			
			/*10*/new Chapter(new DeletingComments(), new View[] {
									new DeletingAssociatedObjects()
								}),
			
			/*11*/new Chapter(new Security()),
			
			/*12*/new Chapter(new BuildingAMultimodelForm())
		};
	}
	
}
