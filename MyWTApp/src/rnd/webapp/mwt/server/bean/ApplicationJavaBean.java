package rnd.webapp.mwt.server.bean;

import rnd.webapp.mwt.client.bean.ApplicationBean;

public class ApplicationJavaBean extends JavaBean implements ApplicationBean {

	private Long applicationBeanId;

	public Long getApplicationBeanId() {
		return this.applicationBeanId;
	}

	public void setApplicationBeanId(Long id) {
		this.applicationBeanId = id;
	}

	// Due to no-access to applicationId by JavaBean
	// If we do not override it JavaBean have to cycle through whole Class-Tree
	// @Override
	// protected Class<?> getFieldType(String propertyName) throws NoSuchFieldException {
	// if (propertyName.equals("applicationBeanId")) { return Long.class; }
	// return super.getFieldType(propertyName);
	// }

	@Override
	public String toString() {
		return super.toString() + "-" + getApplicationBeanId();
	}

}