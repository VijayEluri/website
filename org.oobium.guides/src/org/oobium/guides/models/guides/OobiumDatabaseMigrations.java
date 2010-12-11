package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.oobium_database_migrations.Intro;

public class OobiumDatabaseMigrations extends Guide {

	public OobiumDatabaseMigrations() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers how you can use Oobium migrations to alter your database in a structured and organized manner.";
		chapters = new Chapter[] { };
	}

}
