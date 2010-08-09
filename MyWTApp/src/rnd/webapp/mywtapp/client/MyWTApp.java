package rnd.webapp.mywtapp.client;

import rnd.mywt.client.MWTHelper;
import rnd.mywt.client.mvc.MVCHandlerFactory;
import rnd.mywt.client.mvc.page.Page;
import rnd.webapp.mygwtext.client.mvc.GWTExtMVCHandler;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class MyWTApp implements EntryPoint {

	public void onModuleLoad() {

		MVCHandlerFactory.setMVCHandler(new GWTExtMVCHandler());
//		MVCHandlerFactory.setMVCHandler(new GWTMVCHandler());

		MWTHelper.setApplicationHelper(new MyApplicationHelper());

		Page homePage = MVCHandlerFactory.getMVCHandler().createHomePage();

		RootPanel.get().add((Widget) homePage.getView().getViewObject());

		System.out.println("Loaded");
	}
}
