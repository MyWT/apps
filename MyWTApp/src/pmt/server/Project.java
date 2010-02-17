package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class Project extends ApplicationJavaBean {

   private String projectCode;
   
   private String projectName;
   
   private java.util.Date createdOn;
   
   private java.util.Date updateOn;
   
   private java.util.Collection phases;
   
   private Long createdById;
   
   private Long statusId;
   
   private Long projectOwnerId;
   
   public String getProjectCode() {
      return projectCode;
   }
   
   public void setProjectCode(String newProjectCode) {
      if (ObjectUtils.areEqual(this.projectCode, newProjectCode)) { return; }
      this.projectCode = newProjectCode;
   }
   public String getProjectName() {
      return projectName;
   }
   
   public void setProjectName(String newProjectName) {
      if (ObjectUtils.areEqual(this.projectName, newProjectName)) { return; }
      this.projectName = newProjectName;
   }
   public java.util.Date getCreatedOn() {
      return createdOn;
   }
   
   public void setCreatedOn(java.util.Date newCreatedOn) {
      if (ObjectUtils.areEqual(this.createdOn, newCreatedOn)) { return; }
      this.createdOn = newCreatedOn;
   }
   public java.util.Date getUpdateOn() {
      return updateOn;
   }
   
   public void setUpdateOn(java.util.Date newUpdateOn) {
      if (ObjectUtils.areEqual(this.updateOn, newUpdateOn)) { return; }
      this.updateOn = newUpdateOn;
   }
   public java.util.Collection getPhases() {
      if (phases == null) {
         phases = new java.util.LinkedList();
      }
      return phases;
   }
   
   public void setPhases(java.util.Collection newPhases) {
      this.phases = newPhases;
   }
   
   public Long getCreatedById() {
      return createdById;
   }
   
   public void setCreatedById(Long newCreatedById) {
      if (ObjectUtils.areEqual(this.createdById, newCreatedById)) { return; }
      this.createdById = newCreatedById;
   }
   
   public Long getStatusId() {
      return statusId;
   }
   
   public void setStatusId(Long newStatusId) {
      if (ObjectUtils.areEqual(this.statusId, newStatusId)) { return; }
      this.statusId = newStatusId;
   }
   
   public Long getProjectOwnerId() {
      return projectOwnerId;
   }
   
   public void setProjectOwnerId(Long newProjectOwnerId) {
      if (ObjectUtils.areEqual(this.projectOwnerId, newProjectOwnerId)) { return; }
      this.projectOwnerId = newProjectOwnerId;
   }
}