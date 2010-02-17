package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class Sprint extends ApplicationJavaBean {

   private String sprintName;
   
   private Integer estimatedTime;
   
   private java.util.Date startDate;
   
   private java.util.Date endDate;
   
   private java.util.Date dueDate;
   
   private Long projectId;
   
   public java.util.Collection sprintTaskDetails;
   
   private Long phaseId;
   
   public String getSprintName() {
      return sprintName;
   }
   
   public void setSprintName(String newSprintName) {
      if (ObjectUtils.areEqual(this.sprintName, newSprintName)) { return; }
      this.sprintName = newSprintName;
   }
   public Integer getEstimatedTime() {
      return estimatedTime;
   }
   
   public void setEstimatedTime(Integer newEstimatedTime) {
      if (ObjectUtils.areEqual(this.estimatedTime, newEstimatedTime)) { return; }
      this.estimatedTime = newEstimatedTime;
   }
   public java.util.Date getStartDate() {
      return startDate;
   }
   
   public void setStartDate(java.util.Date newStartDate) {
      if (ObjectUtils.areEqual(this.startDate, newStartDate)) { return; }
      this.startDate = newStartDate;
   }
   public java.util.Date getEndDate() {
      return endDate;
   }
   
   public void setEndDate(java.util.Date newEndDate) {
      if (ObjectUtils.areEqual(this.endDate, newEndDate)) { return; }
      this.endDate = newEndDate;
   }
   public java.util.Date getDueDate() {
      return dueDate;
   }
   
   public void setDueDate(java.util.Date newDueDate) {
      if (ObjectUtils.areEqual(this.dueDate, newDueDate)) { return; }
      this.dueDate = newDueDate;
   }
   public Long getProjectId() {
      return projectId;
   }
   
   public void setProjectId(Long newProjectId) {
      if (ObjectUtils.areEqual(this.projectId, newProjectId)) { return; }
      this.projectId = newProjectId;
   }
   
   public java.util.Collection getSprintTaskDetails() {
      if (sprintTaskDetails == null) {
         sprintTaskDetails = new java.util.LinkedList();
      }
      return sprintTaskDetails;
   }
   
   public void setSprintTaskDetails(java.util.Collection newSprintTaskDetails) {
      this.sprintTaskDetails = newSprintTaskDetails;
   }
   
   public Long getPhaseId() {
      return phaseId;
   }
   
   public void setPhaseId(Long newPhaseId) {
      if (ObjectUtils.areEqual(this.phaseId, newPhaseId)) { return; }
      this.phaseId = newPhaseId;
   }
}