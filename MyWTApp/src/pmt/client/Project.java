package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class Project extends ApplicationDynaBean {

   public String getProjectCode() {
      return (String) getValue("projectCode");
   }
   
   public void setProjectCode(String newProjectCode) {
      setValue("projectCode", newProjectCode);
   }
   public String getProjectName() {
      return (String) getValue("projectName");
   }
   
   public void setProjectName(String newProjectName) {
      setValue("projectName", newProjectName);
   }
   public java.util.Date getCreatedOn() {
      return (java.util.Date) getValue("createdOn");
   }
   
   public void setCreatedOn(java.util.Date newCreatedOn) {
      setValue("createdOn", newCreatedOn);
   }
   public java.util.Date getUpdateOn() {
      return (java.util.Date) getValue("updateOn");
   }
   
   public void setUpdateOn(java.util.Date newUpdateOn) {
      setValue("updateOn", newUpdateOn);
   }
   public java.util.Collection getPhases() {
      return getListValue("phases");
   }
   
   public void setPhases(java.util.Collection newPhases) {
      setListValue("phases", newPhases);
   }
   
   public Long getCreatedById() {
      return (Long) getValue("createdById");
   }
   
   public void setCreatedById(Long newCreatedById) {
      setValue("createdById", newCreatedById);
   }
   
   public Long getStatusId() {
      return (Long) getValue("statusId");
   }
   
   public void setStatusId(Long newStatusId) {
      setValue("statusId", newStatusId);
   }
   
   public Long getProjectOwnerId() {
      return (Long) getValue("projectOwnerId");
   }
   
   public void setProjectOwnerId(Long newProjectOwnerId) {
      setValue("projectOwnerId", newProjectOwnerId);
   }
}