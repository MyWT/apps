package rnd.webapp.mwt.client;

import rnd.webapp.mwt.client.rpc.ApplicationRequest;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ARBAsync {

	void executeRequest(ApplicationRequest req, AsyncCallback callback);

}
