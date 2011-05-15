package org.oobium.guides.models.guides;

import org.oobium.app.views.View;
import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.models.Ticket;
import org.oobium.guides.views.guides.oobium_query_interface.Intro;
import org.oobium.guides.views.guides.oobium_query_interface.conditions.ArrayConditions;
import org.oobium.guides.views.guides.oobium_query_interface.conditions.Conditions;
import org.oobium.guides.views.guides.oobium_query_interface.conditions.PureStringConditions;
import org.oobium.guides.views.guides.oobium_query_interface.counting_and_existence.CountingAndExistence;
import org.oobium.guides.views.guides.oobium_query_interface.eager_loading.EagerLoading;
import org.oobium.guides.views.guides.oobium_query_interface.getting_a_database_connection.GettingADatabaseConnection;
import org.oobium.guides.views.guides.oobium_query_interface.pure_sql_files.PureSqlFiles;
import org.oobium.guides.views.guides.oobium_query_interface.retrieving_models.Pagination;
import org.oobium.guides.views.guides.oobium_query_interface.retrieving_models.RetrievingASingleModel;
import org.oobium.guides.views.guides.oobium_query_interface.retrieving_models.RetrievingModels;
import org.oobium.guides.views.guides.oobium_query_interface.retrieving_models.RetrievingMultipleModels;

public class OobiumQueryInterface extends Guide {

	public OobiumQueryInterface() {
		super(new Intro());
		ticket = new Ticket();
		summary = "This guide covers all the model relations provided by Oobium.";
		chapters = new Chapter[] {
			/*1*/ new Chapter(new RetrievingModels(), new View[] {
									new RetrievingASingleModel(),
									new RetrievingMultipleModels(),
									new Pagination()
								}),

			/*2*/ new Chapter(new Conditions(), new View[] {
									new PureStringConditions(),
									new ArrayConditions()
								}),

			/*3*/ new Chapter(new EagerLoading()),
			
			/*4*/ new Chapter(new CountingAndExistence()),
			
			/*5*/ new Chapter(new PureSqlFiles()),
			
			/*6*/ new Chapter(new GettingADatabaseConnection()),
		};
	}

}
