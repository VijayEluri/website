package org.oobium.guides.models.guides;

import org.oobium.app.server.view.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.all_about_esp_files.Intro;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.ElementHierarchy;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.EmbeddingJava;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.EmbeddingOtherEspFiles;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.EspMarkup;
import org.oobium.guides.views.guides.all_about_esp_files.esp_markup.MultilineElements;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.Constructors;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.FileStructure;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.HtmlContent;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.ImportStatements;
import org.oobium.guides.views.guides.all_about_esp_files.what_is_an_esp_file.WhatIsAnEspFile;

public class AllAboutEspFiles extends Guide {

	public AllAboutEspFiles() {
		super(new Intro());
		summary = "This guide is to teach you all there is to know about creating and debugging ESP files in OObium.";
		chapters = new Chapter[] {
			/*1*/ new Chapter(new WhatIsAnEspFile()),
			
			/*2*/ new Chapter(new FileStructure(), new View[] {
									new ImportStatements(),
									new Constructors(),
									new HtmlContent()
								}),
			
			/*3*/ new Chapter(new EspMarkup(), new View[] {
									new ElementHierarchy(),
									new MultilineElements(),
									new EmbeddingJava(),
									new EmbeddingOtherEspFiles()
								}),

		};
	}

}
