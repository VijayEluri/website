package org.oobium.www.models.guides;

import org.oobium.www.models.Chapter;
import org.oobium.www.models.Guide;
import org.oobium.www.models.Ticket;
import org.oobium.www.views.guides.oobium_database_migrations.Intro;

public class OobiumDatabaseMigrations extends Guide {

	public OobiumDatabaseMigrations() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers how you can use Oobium migrations to alter your database in a structured and organized manner.";
		chapters = new Chapter[] { };
	}

}
