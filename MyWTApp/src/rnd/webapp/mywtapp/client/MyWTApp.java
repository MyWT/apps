package rnd.webapp.mywtapp.client;

import rnd.mywt.client.MyWTHelper;
import rnd.mywt.client.mvc.page.HomePage;
import rnd.webapp.mygwt.client.ARBRemoteServiceProvider;
import rnd.webapp.mygwtext.client.mvc.GWTExtMVCHandler;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MyWTApp implements EntryPoint {

	public void onModuleLoad() {

		MyWTHelper.setMVCHandler(new GWTExtMVCHandler());
		// MVCHandlerFactory.setMVCHandler(new GWTMVCHandler());

		// MWTHelper.setApplicationHelper(new MyApplicationHelper());
		MyWTHelper.setApplicationName("myapp");
		MyWTHelper.setARB(new ARBRemoteServiceProvider());

		HomePage homePage = MyWTHelper.getMVCHandler().createHomePage();
		MyWTHelper.setHomePage(homePage);

		RootPanel.get().add((Widget) homePage.getView().getViewObject());

		System.out.println("Loaded");
	}
}
