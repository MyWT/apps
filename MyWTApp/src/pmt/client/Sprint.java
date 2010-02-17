package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class Sprint extends ApplicationDynaBean {

   public String getSprintName() {
      return (String) getValue("sprintName");
   }
   
   public void setSprintName(String newSprintName) {
      setValue("sprintName", newSprintName);
   }
   public Integer getEstimatedTime() {
      return (Integer) getValue("estimatedTime");
   }
   
   public void setEstimatedTime(Integer newEstimatedTime) {
      setValue("estimatedTime", newEstimatedTime);
   }
   public java.util.Date getStartDate() {
      return (java.util.Date) getValue("startDate");
   }
   
   public void setStartDate(java.util.Date newStartDate) {
      setValue("startDate", newStartDate);
   }
   public java.util.Date getEndDate() {
      return (java.util.Date) getValue("endDate");
   }
   
   public void setEndDate(java.util.Date newEndDate) {
      setValue("endDate", newEndDate);
   }
   public java.util.Date getDueDate() {
      return (java.util.Date) getValue("dueDate");
   }
   
   public void setDueDate(java.util.Date newDueDate) {
      setValue("dueDate", newDueDate);
   }
   public Long getProjectId() {
      return (Long) getValue("projectId");
   }
   
   public void setProjectId(Long newProjectId) {
      setValue("projectId", newProjectId);
   }
   
   public java.util.Collection getSprintTaskDetails() {
      return getListValue("sprintTaskDetails");
   }
   
   public void setSprintTaskDetails(java.util.Collection newSprintTaskDetails) {
      setListValue("sprintTaskDetails", newSprintTaskDetails);
   }
   
   public Long getPhaseId() {
      return (Long) getValue("phaseId");
   }
   
   public void setPhaseId(Long newPhaseId) {
      setValue("phaseId", newPhaseId);
   }
}