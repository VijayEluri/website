package org.oobium.www.models.guides;

import org.oobium.www.models.Chapter;
import org.oobium.www.models.Guide;
import org.oobium.www.models.Ticket;
import org.oobium.www.views.guides.oobium_query_interface.Intro;

public class OobiumRelations extends Guide {

	public OobiumRelations() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the database query interface provided by Oobium.";
		chapters = new Chapter[] { };
	}

}
