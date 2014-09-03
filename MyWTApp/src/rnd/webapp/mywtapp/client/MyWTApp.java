package rnd.webapp.mywtapp.client;

import rnd.mywt.client.MyWTHelper;
import rnd.webapp.mygwt.client.ARBRemoteServiceProvider;
import rnd.webapp.mygwtext.client.mvc.GWTExtMVCBeanFactory;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MyWTApp implements EntryPoint {

	public void onModuleLoad() {

		// MVCHandlerFactory.setMVCHandler(new GWTMVCHandler());
		MyWTHelper.setMVCFactory(new GWTExtMVCBeanFactory());
		MyWTHelper.setARB(new ARBRemoteServiceProvider());
		
		MyWTHelper.setApplicationHelper(new MyApplicationHelper("myapp"));
		MyWTHelper.getApplicationHelper().initializeApplication();

		MyWTHelper.setHomePage(MyWTHelper.getMVCFactory().createHomePage());
		
		RootPanel.get().add((Widget) MyWTHelper.getHomePage().getView().getViewObject());
		System.out.println("Loaded");
	}
}
