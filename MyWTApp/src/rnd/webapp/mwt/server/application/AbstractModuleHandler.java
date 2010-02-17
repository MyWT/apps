package rnd.webapp.mwt.server.application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import rnd.webapp.mwt.client.bean.ApplicationBean;
import rnd.webapp.mwt.client.bean._Bean;
import rnd.webapp.mwt.client.rpc.ApplicationRequest;
import rnd.webapp.mwt.client.rpc.ApplicationResponse;
import rnd.webapp.mwt.client.rpc.ApplicationRequest.Method;
import rnd.webapp.mwt.client.rpc.util.ARUtils;
import rnd.webapp.mwt.client.utils.Block;
import rnd.webapp.mwt.client.utils.ExceptionUtils;

public abstract class AbstractModuleHandler extends AbstractApplicationHandler implements ModuleHandler {

	private Map<String, ApplicationBeanHandler> beanHandlerMap;

	private Map<String, Class> beanTypeMap;

	protected AbstractModuleHandler() {
		this.beanHandlerMap = new HashMap<String, ApplicationBeanHandler>();
		this.beanTypeMap = new HashMap<String, Class>();
		initialiseModule();
	}

	protected abstract void initialiseModule();

	@Override
	protected void initialiseApplication() {
	}

	public final void addApplicationBean(String appBeanName, Class appBeanType) {
		this.beanTypeMap.put(appBeanName, appBeanType);
	}

	public final void addApplicationBeanHandler(String appBeanName, Class appBeanType, ApplicationBeanHandler applicationBeanHandler) {
		addApplicationBean(appBeanName, appBeanType);
		this.beanHandlerMap.put(appBeanName, applicationBeanHandler);
	}

	public ApplicationBeanHandler getApplicationBeanHandler(String appBeanName) {
		// Logger.log("beanHandlerMap", this.beanHandlerMap);
		return this.beanHandlerMap.get(appBeanName);
	}

	public final Class getApplicationBeanType(String appBeanName) {
		return this.beanTypeMap.get(appBeanName);
	}

	@Override
	public void executeRequest(ApplicationRequest req, ApplicationResponse resp) {
		// if
		// (Debugger.D.pushCheck("rnd.webapp.mwt.server.application.AbstractModuleHandler.executeRequest"))
		// {
		// Debugger.D.push(this, new Object[] { "request", request });
		// }
		// try {
		Method method = req.getMethod();
		// D.println("method", method);

		// Save Object

		if (method == Method.Save) {
//			Long savedObjectId = saveObject(ARUtils.getApplicationBean(req));
//			DataTable dataTable = fetchDataTable(ARUtils.getAppBeanName(req), ARUtils.getViewName(req), ARUtils.getFilter(req), Collections.singleton(savedObjectId));
//			resp.setResult((Serializable) dataTable.getRow(0));
			return;
		}
		// Find Object
		else if (method == Method.Find) {
			resp.setResult((Serializable) findObject(ARUtils.getAppBeanPKId(req), getApplicationBeanType(ARUtils.getAppBeanName(req))));
			return;
		}
		// Fetch Data Table
		else if (method == Method.Fetch) {
//			DataTable dataTable = fetchDataTable(ARUtils.getAppBeanName(req), ARUtils.getViewName(req), ARUtils.getFilter(req), null);
//			resp.setResult((Serializable) dataTable);
			return;
		}
		// Delete Object
		else if (method == Method.Delete) {
			deleteObject(ARUtils.getAppBeanPKId(req), getApplicationBeanType(ARUtils.getAppBeanName(req)));
			return;
		}
		// Unknown Operation
		else {
			throw new UnsupportedOperationException(method.toString());
		}
		// }
		// finally {
		// Debugger.D.pop("rnd.webapp.mwt.server.application.AbstractModuleHandler.executeRequest");
		// }
	}

	private void deleteObject(Long appBeanPKId, Class applicationBeanType) {
//		getORMHelper().deleteObject(appBeanPKId, applicationBeanType);
	}

//	private DataTable fetchDataTable(String appBeanName, String viewName, FilterInfo filterInfo, Set<Long> ids) {
//		// if
//		// (Debugger.D.pushCheck("rnd.webapp.mwt.server.application.AbstractModuleHandler.fetch")) {
//		// Debugger.D.push(this, new Object[] { "appBeanName", appBeanName, "viewName", viewName });
//		// }
//		// try {
//
//		ApplicationBeanHandler handler = getApplicationBeanHandler(appBeanName);
//		if (handler == null) {
//			handler = DefaultApplicationBeanHandler.getSharedInstance();
//		}
//
//		ViewMetaData viewMetaData = handler.getViewMetaData(viewName);
//		if (viewMetaData == null) {
//			viewMetaData = DefaultApplicationBeanHandler.getSharedInstance().getViewMetaData(viewName);
//		}
//
//		String viewQuery = viewMetaData.getViewQuery();
//		// D.println("viewQuery", viewQuery);
//
//		Object[] params = null;
//		boolean filtered = false;
//		if (filterInfo != null) {
//			viewQuery = new StringBuffer(viewQuery).append(" where ").append(viewMetaData.getFilter(filterInfo.getFilterName())).toString();
//			params = filterInfo.getFilterParams().toArray();
//			filtered = true;
//			// D.println("viewQuery", viewQuery);
//		}
//
//		if (ids != null && !ids.isEmpty()) {
//			StringBuffer buffer = new StringBuffer(viewQuery);
//			if (filtered) {
//				buffer.append(" and ");
//			} else {
//				buffer.append(" where ");
//			}
//			buffer.append(viewMetaData.getIdColumnName()).append(" in ( ").append(ObjectUtils.toString(ids, " , ")).append(" )");
//			// D.println("viewQuery", viewQuery);
//		}
//
//		Object[] result = (Object[]) QueryExecutor.get().executeQuery(viewQuery, params, QueryExecutor.ListArrayResultSetProcessor, new ColumnMetaDataCreator(), getConnection(), true);
//		// D.println("result", result);
//
//		ColumnMetaData[] columnMetaDatas = (ColumnMetaData[]) result[0];
//		// D.println("columnMetaDatas", columnMetaDatas);
//
//		RowMetaDataImpl rowMetaData = new RowMetaDataImpl(columnMetaDatas);
//
//		rowMetaData.setIdColumnIndex(viewMetaData.getIdColumnIndex());
//		rowMetaData.setDisplayColumnIndex(viewMetaData.getDisplayColumnIndex());
//
//		DataTable dataTable = new DataTableImpl(rowMetaData);
//		// D.println("dataTable", dataTable);
//
//		List list = (List) result[1];
//
//		for (Object columnsObj : list) {
//			Row row = new RowImpl(rowMetaData);
//			// D.println("row", row);
//
//			Object[] columns = (Object[]) columnsObj;
//
//			List columnList = new ArrayList(columns.length);
//
//			for (int i = 0; i < columns.length; i++) {
//				if (columns[i] instanceof BigInteger) {
//					columns[i] = WrapperUtils.getLong(columns[i]);
//				}
//				columnList.add(columns[i]);
//			}
//
//			row.setColumns(columnList);
//
//			dataTable.addRow(row);
//		}
//		// D.println("dataTable", dataTable.getRowCount());
//		// D.println("dataTable", dataTable.getRows().toArray());
//
//		return dataTable;
//
//		// }
//		// finally {
//		// Debugger.D.pop("rnd.webapp.mwt.server.application.AbstractModuleHandler.fetch");
//		// }
//	}

//	class ColumnMetaDataCreator implements ResultSetMetaDataProcessor {
//
//		public ColumnMetaData[] processResultSetMetaData(ResultSetMetaData rs) throws SQLException {
//			// if
//			// (Debugger.D.pushCheck("rnd.webapp.mwt.server.application.AbstractModuleHandler.ColumnMetaDataCreator.processResultSetMetaData"))
//			// {
//			// Debugger.D.push(this, null);
//			// }
//			// try {
//			ColumnMetaDataImpl[] columnMetaDatas = new ColumnMetaDataImpl[rs.getColumnCount()];
//			// D.println("columnMetaDatas", columnMetaDatas);
//
//			for (int i = 1; i < columnMetaDatas.length + 1; i++) {
//
//				ColumnMetaDataImpl columnMetaData = new ColumnMetaDataImpl();
//
//				columnMetaData.setDisplayName(rs.getColumnLabel(i));
//				columnMetaData.setDisplayWidth(rs.getColumnDisplaySize(i));
//				columnMetaData.setName(rs.getColumnName(i));
//				columnMetaData.setExpression(new RowColumnExpression(columnMetaData.getName()));
//				columnMetaData.setType(rs.getColumnType(i));
//
//				columnMetaDatas[i - 1] = columnMetaData;
//
//				// D.println("columnMetaData[" + i + "]", columnMetaDatas[i - 1]);
//			}
//
//			// D.println("columnMetaDatas", columnMetaDatas);
//			return columnMetaDatas;
//			// }
//			// finally {
//			// Debugger.D.pop("rnd.webapp.mwt.server.application.AbstractModuleHandler.ColumnMetaDataCreator.processResultSetMetaData");
//			// }
//		}
//	}

//	private Connection getConnection() {
//		return null;
//		// return getORMHelper().getConnection();
//	}

//	ObjectPersistor getORMHelper() {
//		return null;
		// return KodoHelper.getSharedInstance();
//	}

	protected _Bean findObject(Object id, Class beanType) {
		// if
		// (Debugger.D.pushCheck("rnd.webapp.mwt.server.application.AbstractModuleHandler.findObject"))
		// {
		// Debugger.D.push(this, new Object[] { "id", id, "beanType", beanType });
		// }
		// try {
//		ApplicationBean serverBean = (ApplicationBean) getORMHelper().findObject(id, beanType);
//		serverBean.setApplicationBeanId((Long) id);
		// D.println("serverBean", serverBean);

		ApplicationBean clientBean = getNewClientBean(beanType);

//		copy(serverBean, clientBean, this.serverCopyBeanHelper, this.clientBeanCopyHelper, new HashMap<ApplicationBean, ApplicationBean>());
		// D.println("clientBean", clientBean);

		return clientBean;

		// }
		// finally {
		// Debugger.D.pop("rnd.webapp.mwt.server.application.AbstractModuleHandler.findObject");
		// }
	}

	private ApplicationBean getNewClientBean(Class beanType) {
		return getNewApplicationBean(getClientBeanType(beanType));
	}

	protected Long saveObject(ApplicationBean clientBean) {
		// if
		// (Debugger.D.pushCheck("rnd.webapp.mwt.server.application.AbstractModuleHandler.saveObject"))
		// {
		// Debugger.D.push(this, new Object[] { "clientBean", clientBean });
		// }
		// try {
		Long appBeanId = clientBean.getApplicationBeanId();
		// D.println("appBeanId", appBeanId);

		ApplicationBean serverBean = null;
		if (appBeanId == null) {
			serverBean = getNewApplicationBean(getServerBeanType(clientBean.getClass()));
		} else {
//			serverBean = (ApplicationBean) getORMHelper().findObject(appBeanId, getServerBeanType(clientBean.getClass()));
		}

		copy(clientBean, serverBean, this.clientBeanCopyHelper, this.serverCopyBeanHelper, new HashMap<ApplicationBean, ApplicationBean>());
		// D.println("serverBean", serverBean);

//		appBeanId = (Long) getORMHelper().saveObject(serverBean);
		// D.println("appBeanId", appBeanId);

		return appBeanId;

		// }
		// finally {
		// Debugger.D.pop("rnd.webapp.mwt.server.application.AbstractModuleHandler.saveObject");
		// }
	}

	private interface BeanCopyHelper {

		Long getApplicationBeanId(ApplicationBean applicationBean);

		boolean isInverseOwnerRequired();

		String getInverseOwner(Class elementType, String indexedPrpName);

		ApplicationBean getNewApplicationBean(Class sourceBeanType);
	}

	private BeanCopyHelper serverCopyBeanHelper = new ServerBeanCopyHelper();

	class ServerBeanCopyHelper implements BeanCopyHelper {

		public Long getApplicationBeanId(ApplicationBean serverBean) {
			return null;
//			Long applicationBeanId = getORMHelper().getObjectId(serverBean);
//			return applicationBeanId;
			
		}

		public boolean isInverseOwnerRequired() {
			return true;
		}

		public String getInverseOwner(Class beanType, String indexedPrpName) {
			// return getORMHelper().getInverseOwner(beanType, indexedPrpName);
			return beanType.getSimpleName();
		}

		public ApplicationBean getNewApplicationBean(Class serverBeanType) {
			return AbstractModuleHandler.this.getNewApplicationBean(getClientBeanType(serverBeanType));
		}
	}

	private BeanCopyHelper clientBeanCopyHelper = new ClientBeanCopyHelper();

	class ClientBeanCopyHelper implements BeanCopyHelper {

		public Long getApplicationBeanId(ApplicationBean clientBean) {
			return clientBean.getApplicationBeanId();
		}

		public boolean isInverseOwnerRequired() {
			return false;
		}

		public String getInverseOwner(Class elementType, String indexedPrpName) {
			return null;
		}

		public ApplicationBean getNewApplicationBean(Class clientBeanType) {
			return AbstractModuleHandler.this.getNewApplicationBean(getServerBeanType(clientBeanType));
		}

	}

	private void copy(ApplicationBean sourceBean, ApplicationBean targetBean, BeanCopyHelper sourceBeanCopyHelper, BeanCopyHelper targetBeanCopyHelper, Map<ApplicationBean, ApplicationBean> copyMap) {
		// if (Debugger.D.pushCheck("rnd.webapp.mwt.server.application.AbstractModuleHandler.copy"))
		// {
		// Debugger.D.push(this, new Object[] { "sourceBean", sourceBean, "targetBean", targetBean
		// });
		// }
		// try {
		// Returing to avoid in-finite loop in Object Graph
		if (copyMap.containsKey(sourceBean)) {
			return;
		}
		copyMap.put(sourceBean, targetBean);

		// Copy ApplicationBean Id
		targetBean.setApplicationBeanId(sourceBean.getApplicationBeanId());

		// Copy properties
		Set<String> propertyNames = sourceBean.getPropertyNames();
		// D.println("prpSize", propertyNames.size());

		// Copy simpe properties
		for (String propertyName : propertyNames) {
			// D.println("propertyName", propertyName);

			Object value = sourceBean.getValue(propertyName);
			// D.println("tempValue", value);

			if (value instanceof ApplicationBean) {

				ApplicationBean sourceValue = (ApplicationBean) value;

				Long sourceObjectId = sourceBeanCopyHelper.getApplicationBeanId(sourceValue);
				sourceValue.setApplicationBeanId(sourceObjectId);
				// D.println("sourceObjectId", sourceObjectId);

				ApplicationBean targetValue = null;

				if (sourceObjectId != null) {
					targetValue = copyMap.get(sourceValue);
				}
				// D.println("targetValue", targetValue);

				if (targetValue == null) {
					targetValue = sourceBeanCopyHelper.getNewApplicationBean(sourceValue.getClass());
					targetValue.setApplicationBeanId(sourceObjectId);
					copy(sourceValue, targetValue, sourceBeanCopyHelper, targetBeanCopyHelper, copyMap);
				}
				value = targetValue;
			}

			targetBean.setValue(propertyName, value);
		}

		// Copy indexed properties
		Set<String> indexedPropertyNames = sourceBean.getIndexedPropertyNames();
		// D.println("IndxPrpSize", indexedPropertyNames.size());

		for (String indexedPropertyName : indexedPropertyNames) {
			// D.println("indexedPropertyName", indexedPropertyName);

			int size = sourceBean.size(indexedPropertyName);
			// D.println("size", size);

			int trtSize = targetBean.size(indexedPropertyName);
			// D.println("trtSize", trtSize);

			String inverseOwner = targetBeanCopyHelper.getInverseOwner(targetBean.getClass(), indexedPropertyName);
			// D.println("inverseOwner", inverseOwner);

			Map<Long, ApplicationBean> existingTargetElementMap = new HashMap();

			for (int i = 0; i < trtSize; i++) {

				ApplicationBean targetElement = (ApplicationBean) targetBean.getElement(indexedPropertyName, i);
				Long targetElementId = targetBeanCopyHelper.getApplicationBeanId(targetElement);
				targetElement.setApplicationBeanId(targetElementId);

				if (targetElementId != null) {
					existingTargetElementMap.put(targetElementId, targetElement);
				}
			}
			// D.println("targetElementMap_size", existingTargetElementMap.size());

			List<ApplicationBean> newElements = new ArrayList<ApplicationBean>();

			for (int i = 0; i < size; i++) {

				ApplicationBean sourceElement = (ApplicationBean) sourceBean.getElement(indexedPropertyName, i);
				// D.println("sourceElement", sourceElement);

				Long sourceElementId = sourceBeanCopyHelper.getApplicationBeanId(sourceElement);
				sourceElement.setApplicationBeanId(sourceElementId);
				// D.println("sourceElementId", sourceElementId);

				ApplicationBean targetElement = null;

				if (sourceElementId != null) {
					targetElement = existingTargetElementMap.remove(sourceElementId);
				}
				// D.println("targetElement", targetElement);

				if (targetElement == null) {
					targetElement = sourceBeanCopyHelper.getNewApplicationBean(sourceElement.getClass());
					newElements.add(targetElement);
				}

				copy(sourceElement, targetElement, sourceBeanCopyHelper, targetBeanCopyHelper, copyMap);
				// D.println("InverseOwnerRequired", targetBeanCopyHelper.isInverseOwnerRequired());

				if (targetBeanCopyHelper.isInverseOwnerRequired()) {
					targetElement.setValue(inverseOwner, targetBean);
				}
			}
			// D.println("newElements_size", newElements.size());
			if (newElements.size() > 0) {
				targetBean.addAllElement(indexedPropertyName, newElements);
			}

			Collection<ApplicationBean> existingElements = existingTargetElementMap.values();
			// D.println("existingElements_size", existingElements.size());
			if (existingElements.size() > 0) {
				targetBean.removeAllElement(indexedPropertyName, existingElements);
			}

		}
		// }
		// finally {
		// Debugger.D.pop("rnd.webapp.mwt.server.application.AbstractModuleHandler.copy");
		// }

	}

	Class getServerBeanType(Class clientBeanType) {

		String srcType = "client";
		String trtType = "server";

		return getTargetBeanType(clientBeanType, srcType, trtType);
	}

	Class getClientBeanType(Class serverBeanType) {

		String srcType = "server";
		String trtType = "client";

		return getTargetBeanType(serverBeanType, srcType, trtType);
	}

	private Class getTargetBeanType(Class srcBeanType, String srcType, String trtType) {

		String srcBeanTypeName = srcBeanType.getName();

		// Get target bean type
		final String trtClassName = srcBeanTypeName.substring(0, srcBeanTypeName.lastIndexOf('.') - srcType.length()) + trtType + srcBeanTypeName.substring(srcBeanTypeName.lastIndexOf('.'));

		final Class targetClass = (Class) ExceptionUtils.makeUnchecked(new Block() {
			public Object doBlock() throws Exception {
				return Class.forName(trtClassName);
			}
		});

		return targetClass;
	}

	ApplicationBean getNewApplicationBean(final Class beanType) {
		return (ApplicationBean) ExceptionUtils.makeUnchecked(new Block() {
			public Object doBlock() throws Exception {
				return beanType.newInstance();
			}
		});
	}

}
