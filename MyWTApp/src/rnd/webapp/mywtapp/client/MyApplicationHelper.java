package rnd.webapp.mywtapp.client;

import rnd.mywt.client.application.AbstractApplicationHelper;
import ad.client.module.ADModuleHelper;

public class MyApplicationHelper extends AbstractApplicationHelper {

	public MyApplicationHelper(String applicationName) {
		super(applicationName);
	}

	@Override
	public void initializeApplication() {
		addModuleHelper(new ADModuleHelper());
		// addModuleHelper(new AAModuleHelper());
		// addModuleHelper(new PMTModuleHelper());
		
		super.initializeApplication();
	}

}
