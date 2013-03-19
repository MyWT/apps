package rnd.webapp.adapp.client;

import rnd.mywt.client.MyWTHelper;
import rnd.mywt.client.arb.ARBUtils;
import rnd.mywt.client.mvc.MVCHandlerFactory;
import rnd.mywt.client.mvc.page.Page;
import rnd.webapp.mygwtext.client.mvc.GWTExtMVCHandler;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class ADApp implements EntryPoint {

	public void onModuleLoad() {

		MVCHandlerFactory.setMVCHandler(new GWTExtMVCHandler());
		// MVCHandlerFactory.setMVCHandler(new GWTMVCHandler());

		// Page homePage = new GWTExtADHomePage();
		// RootPanel.get().add((Widget) homePage.getView().getViewObject());

		MyWTHelper.setApplicationHelper(new ADAppHelper());
		ARBUtils.setARB(ARBUtils.getARB());

		Page homePage = MVCHandlerFactory.getMVCHandler().createHomePage();
		RootPanel.get().add((Widget) homePage.getView().getViewObject());

		System.out.println("Loaded");
	}
}
