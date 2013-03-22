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

		// MVCHandlerFactory.setMVCHandler(new GWTMVCHandler());
		MyWTHelper.setMVCFactory(new GWTExtMVCHandler());

		MyWTHelper.setApplicationHelper(new MyApplicationHelper("myapp"));
		MyWTHelper.setApplicationName("myapp");
		MyWTHelper.setARB(new ARBRemoteServiceProvider());

		HomePage homePage = MyWTHelper.getMVCFactory().createHomePage();
		MyWTHelper.setHomePage(homePage);

		RootPanel.get().add((Widget) homePage.getView().getViewObject());

		System.out.println("Loaded");
	}
}
