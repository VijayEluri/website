package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.oobium_query_interface.Intro;

public class OobiumRelations extends Guide {

	public OobiumRelations() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the database query interface provided by Oobium.";
		chapters = new Chapter[] { };
	}

}
