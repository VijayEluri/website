package org.oobium.www.models.guides;

import org.oobium.www.models.Chapter;
import org.oobium.www.models.Guide;
import org.oobium.www.models.Ticket;
import org.oobium.www.views.guides.oobium_relations.Intro;

public class OobiumQueryInterface extends Guide {

	public OobiumQueryInterface() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers all the model relations provided by Oobium.";
		chapters = new Chapter[] { };
	}

}
