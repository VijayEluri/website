package org.oobium.guides.models.guides;

import org.oobium.guides.models.Chapter;
import org.oobium.guides.models.Guide;
import org.oobium.guides.views.guides.realtime_swt_client.ClientModels;
import org.oobium.guides.views.guides.realtime_swt_client.ClientUI;
import org.oobium.guides.views.guides.realtime_swt_client.Intro;
import org.oobium.guides.views.guides.realtime_swt_client.ServerModels;

public class RealTimeSwtClient extends Guide {

	public RealTimeSwtClient() {
		super(new Intro());
		summary = "This guide shows you how to export your Oobium models to an SWT (or any other Java) client " +
				"and communicate with them in real time.";
		chapters = new Chapter[] {
				/*1*/ new Chapter(new ServerModels()),
				/*2*/ new Chapter(new ClientUI()),
				/*3*/ new Chapter(new ClientModels())
		};
	}

}
