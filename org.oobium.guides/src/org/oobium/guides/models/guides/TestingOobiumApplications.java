package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.testing_oobium_applications.Intro;

public class TestingOobiumApplications extends Guide {

	public TestingOobiumApplications() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the basics of unit testing your Models, Controllers, and Views in Oobium. " +
					"It also makes mention of integration testing as well as introducing the tools Oobium testing " +
					"is built from - JUnit, Mockito, and JSoup.";
		chapters = new Chapter[0];
	}

}
