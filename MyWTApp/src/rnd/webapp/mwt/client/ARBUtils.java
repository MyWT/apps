package rnd.webapp.mwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ARBUtils {
	private static ARBAsync instance;

	public static ARBAsync getARB() {
		if (instance == null) {
			instance = (ARBAsync) GWT.create(ARB.class);
			ServiceDefTarget target = (ServiceDefTarget) instance;
			target.setServiceEntryPoint(GWT.getModuleBaseURL() + "ARB");
		}
		return instance;
	}
}
