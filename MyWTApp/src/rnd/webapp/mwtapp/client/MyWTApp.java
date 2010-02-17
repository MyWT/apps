package rnd.webapp.mwtapp.client;

import rnd.webapp.mwt.client.MWTHelper;
import rnd.webapp.mwt.client.gwtext.mvc.GWTExtMVCHandler;
import rnd.webapp.mwt.client.mvc.MVCHandlerFactory;
import rnd.webapp.mwt.client.mvc.page.Page;

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
