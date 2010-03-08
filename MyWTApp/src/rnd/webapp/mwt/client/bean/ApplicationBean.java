package rnd.webapp.mwt.client.bean;

import rnd.bean._Bean;

public interface ApplicationBean extends _Bean {

	String APPLICATION_BEAN_ID = "applicationBeanId";

	Long getApplicationBeanId();

	void setApplicationBeanId(Long id);
}
