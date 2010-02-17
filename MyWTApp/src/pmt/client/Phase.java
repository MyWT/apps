package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class Phase extends ApplicationDynaBean {

   public String getPhaseCode() {
      return (String) getValue("phaseCode");
   }
   
   public void setPhaseCode(String newPhaseCode) {
      setValue("phaseCode", newPhaseCode);
   }
   public String getPhaseName() {
      return (String) getValue("phaseName");
   }
   
   public void setPhaseName(String newPhaseName) {
      setValue("phaseName", newPhaseName);
   }
   public java.util.Date getCreatedOn() {
      return (java.util.Date) getValue("createdOn");
   }
   
   public void setCreatedOn(java.util.Date newCreatedOn) {
      setValue("createdOn", newCreatedOn);
   }
   public java.util.Date getUpdatedOn() {
      return (java.util.Date) getValue("updatedOn");
   }
   
   public void setUpdatedOn(java.util.Date newUpdatedOn) {
      setValue("updatedOn", newUpdatedOn);
   }
   public Long getStatusId() {
      return (Long) getValue("statusId");
   }
   
   public void setStatusId(Long newStatusId) {
      setValue("statusId", newStatusId);
   }
   
   public Long getCreatedById() {
      return (Long) getValue("createdById");
   }
   
   public void setCreatedById(Long newCreatedById) {
      setValue("createdById", newCreatedById);
   }
   
   public Long getPhaseOwnerId() {
      return (Long) getValue("phaseOwnerId");
   }
   
   public void setPhaseOwnerId(Long newPhaseOwnerId) {
      setValue("phaseOwnerId", newPhaseOwnerId);
   }
   
   
   public Project getProject() {
      return (Project) getValue("project");
   }
   
   public void setProject(Project newProject) {
      setValue("project", newProject);
   }
}