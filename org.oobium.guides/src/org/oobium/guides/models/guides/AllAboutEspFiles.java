package org.oobium.guides.models.guides;

import org.oobium.app.server.view.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.all_about_esp_files.Intro;
import org.oobium.guides.views.guides.all_about_esp_files.debugging.Debugging;
import org.oobium.guides.views.guides.all_about_esp_files.element_hierarchy.ElementHierarchy;
import org.oobium.guides.views.guides.all_about_esp_files.element_structure.ElementStructure;
import org.oobium.guides.views.guides.all_about_esp_files.embedding_java.EmbeddingJava;
import org.oobium.guides.views.guides.all_about_esp_files.embeding_other_esp_files.EmbeddingOtherEspFiles;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.Constructors;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.FileStructure;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.HtmlContent;
import org.oobium.guides.views.guides.all_about_esp_files.file_structure.ImportStatements;
import org.oobium.guides.views.guides.all_about_esp_files.javascript.Javascript;
import org.oobium.guides.views.guides.all_about_esp_files.mailer_templates.MailerTemplates;
import org.oobium.guides.views.guides.all_about_esp_files.style_sheets.StyleSheets;
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
			
			/*3*/ new Chapter(new ElementStructure()),
			
			/*4*/ new Chapter(new ElementHierarchy()),
			
			/*5*/ new Chapter(new EmbeddingJava()),
			
			/*6*/ new Chapter(new EmbeddingOtherEspFiles()),
			
			/*7*/ new Chapter(new StyleSheets()),

			/*8*/ new Chapter(new Javascript()),

			/*9*/ new Chapter(new MailerTemplates()),

			/*10*/new Chapter(new Debugging())

		};
	}

}
