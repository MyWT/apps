package rnd.webapp.mwt.client;

import java.io.Serializable;

import rnd.webapp.mwt.client.rpc.ApplicationResponse;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class ARBAsyncCallback implements AsyncCallback {

	public void onFailure(Throwable caught) {
		caught.printStackTrace();
		Window.alert(caught.getMessage());
	}

	@Override
	public void onSuccess(Object result) {
		onSuccess(getSerializableResult(result));
	}

	public abstract void onSuccess(Serializable result);

	public static Serializable getSerializableResult(Object result) {
		ApplicationResponse resp = (ApplicationResponse) result;
		Throwable throwable = resp.getThrowable();
		if (throwable != null) {
			throwable.printStackTrace();
			Window.alert(throwable.getMessage());
			throw new RuntimeException(throwable);
		} else {
			return resp.getResult();
		}
	}

}
