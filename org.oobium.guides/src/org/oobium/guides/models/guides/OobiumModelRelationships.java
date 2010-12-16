package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.oobium_model_relationships.Intro;

public class OobiumModelRelationships extends Guide {

	public OobiumModelRelationships() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers the database query interface provided by Oobium.";
		chapters = new Chapter[] { };
	}

}
