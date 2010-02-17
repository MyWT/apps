package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class Phase extends ApplicationJavaBean {

   private String phaseCode;
   
   private String phaseName;
   
   private java.util.Date createdOn;
   
   private java.util.Date updatedOn;
   
   private Project project;
   
   private Long statusId;
   
   private Long createdById;
   
   private Long phaseOwnerId;
   
   public String getPhaseCode() {
      return phaseCode;
   }
   
   public void setPhaseCode(String newPhaseCode) {
      if (ObjectUtils.areEqual(this.phaseCode, newPhaseCode)) { return; }
      this.phaseCode = newPhaseCode;
   }
   public String getPhaseName() {
      return phaseName;
   }
   
   public void setPhaseName(String newPhaseName) {
      if (ObjectUtils.areEqual(this.phaseName, newPhaseName)) { return; }
      this.phaseName = newPhaseName;
   }
   public java.util.Date getCreatedOn() {
      return createdOn;
   }
   
   public void setCreatedOn(java.util.Date newCreatedOn) {
      if (ObjectUtils.areEqual(this.createdOn, newCreatedOn)) { return; }
      this.createdOn = newCreatedOn;
   }
   public java.util.Date getUpdatedOn() {
      return updatedOn;
   }
   
   public void setUpdatedOn(java.util.Date newUpdatedOn) {
      if (ObjectUtils.areEqual(this.updatedOn, newUpdatedOn)) { return; }
      this.updatedOn = newUpdatedOn;
   }
   public Long getStatusId() {
      return statusId;
   }
   
   public void setStatusId(Long newStatusId) {
      if (ObjectUtils.areEqual(this.statusId, newStatusId)) { return; }
      this.statusId = newStatusId;
   }
   
   public Long getCreatedById() {
      return createdById;
   }
   
   public void setCreatedById(Long newCreatedById) {
      if (ObjectUtils.areEqual(this.createdById, newCreatedById)) { return; }
      this.createdById = newCreatedById;
   }
   
   public Long getPhaseOwnerId() {
      return phaseOwnerId;
   }
   
   public void setPhaseOwnerId(Long newPhaseOwnerId) {
      if (ObjectUtils.areEqual(this.phaseOwnerId, newPhaseOwnerId)) { return; }
      this.phaseOwnerId = newPhaseOwnerId;
   }
   
   
   public Project getProject() {
      return project;
   }
   
   public void setProject(Project newProject) {
      if (ObjectUtils.areEqual(this.project, newProject)) { return; }
      this.project = newProject;
   }
}