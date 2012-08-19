package org.oobium.guides.models.guides;

import org.oobium.app.views.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.configuration.Intro;
import org.oobium.guides.views.guides.configuration.mailers.Mailers;
import org.oobium.guides.views.guides.configuration.mailers.Sending;
import org.oobium.guides.views.guides.configuration.persistence.Multiple;
import org.oobium.guides.views.guides.configuration.persistence.PersistServices;
import org.oobium.guides.views.guides.configuration.persistence.Persistence;
import org.oobium.guides.views.guides.configuration.server.MultipleApplications;
import org.oobium.guides.views.guides.configuration.server.Server;

public class Configuration extends Guide {

	public Configuration() {
		super(new Intro());
		summary = "This guide shows you how to configure your Oobium application.";
		chapters = new Chapter[] {
				/*1*/ new Chapter(new Server(), new View[] {
											new MultipleApplications()
				}),

				/*1*/ new Chapter(new Persistence(), new View[] {
											new PersistServices(),
											new Multiple()
				}),
				
				/*2*/ new Chapter(new Mailers(), new View[] {
											new Sending()
				})
		};
	}

}
