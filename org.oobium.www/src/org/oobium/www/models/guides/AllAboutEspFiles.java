package org.oobium.www.models.guides;

import org.oobium.www.models.Chapter;
import org.oobium.www.models.Guide;
import org.oobium.www.models.Ticket;
import org.oobium.www.views.guides.all_about_esp_files.AllAboutEspFilesIntro;

public class AllAboutEspFiles extends Guide {

	public AllAboutEspFiles() {
		super(new AllAboutEspFilesIntro());
		ticket = new Ticket();
		summary = "This guide is to teach you all there is to know about creating and debugging ESP files in OObium.";
		chapters = new Chapter[] { };
	}

}
