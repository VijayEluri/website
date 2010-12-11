package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.all_about_esp_files.AllAboutEspFilesIntro;

public class AllAboutEspFiles extends Guide {

	public AllAboutEspFiles() {
		super(new AllAboutEspFilesIntro());
		ticket = new Ticket();
		summary = "This guide is to teach you all there is to know about creating and debugging ESP files in OObium.";
		chapters = new Chapter[] { };
	}

}
