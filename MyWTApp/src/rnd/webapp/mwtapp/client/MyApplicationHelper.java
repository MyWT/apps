package rnd.webapp.mwtapp.client;

import pmt.client.module.helper.PMTModuleHelper;
import rnd.mywt.client.application.AbstractApplicationHelper;


public class MyApplicationHelper extends AbstractApplicationHelper {

	@Override
	public void initialiseApplication() {
//		addModuleHelper(new AAModuleHelper());
		addModuleHelper(new PMTModuleHelper());
	}

}
