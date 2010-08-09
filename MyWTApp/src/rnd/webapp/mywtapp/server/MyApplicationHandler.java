package rnd.webapp.mywtapp.server;

import pmt.server.module.handler.PMTModuleHandler;
import rnd.mywt.server.application.AbstractApplicationHandler;
import aa.server.module.AAModuleHandler;


public class MyApplicationHandler extends AbstractApplicationHandler {

	@Override
	protected void initialiseApplication() {
		registerModule("AA", new AAModuleHandler());
		registerModule("PMT", new PMTModuleHandler());
	}

}
