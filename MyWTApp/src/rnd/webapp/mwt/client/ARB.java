package rnd.webapp.mwt.client;

import rnd.webapp.mwt.client.rpc.ApplicationRequest;
import rnd.webapp.mwt.client.rpc.ApplicationResponse;

import com.google.gwt.user.client.rpc.RemoteService;

public interface ARB extends RemoteService {

	ApplicationResponse executeRequest(ApplicationRequest req);

}
