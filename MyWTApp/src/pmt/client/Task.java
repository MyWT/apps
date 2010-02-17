package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class Task extends ApplicationDynaBean {

   public String getTaskNo() {
      return (String) getValue("taskNo");
   }
   
   public void setTaskNo(String newTaskNo) {
      setValue("taskNo", newTaskNo);
   }
   public String getTaskName() {
      return (String) getValue("taskName");
   }
   
   public void setTaskName(String newTaskName) {
      setValue("taskName", newTaskName);
   }
   public String getDescription() {
      return (String) getValue("description");
   }
   
   public void setDescription(String newDescription) {
      setValue("description", newDescription);
   }
   public String getRemarks() {
      return (String) getValue("remarks");
   }
   
   public void setRemarks(String newRemarks) {
      setValue("remarks", newRemarks);
   }
   public Integer getEstimatedTime_hh() {
      return (Integer) getValue("estimatedTime_hh");
   }
   
   public void setEstimatedTime_hh(Integer newEstimatedTime_hh) {
      setValue("estimatedTime_hh", newEstimatedTime_hh);
   }
   public Integer getEstimatedTime_mm() {
      return (Integer) getValue("estimatedTime_mm");
   }
   
   public void setEstimatedTime_mm(Integer newEstimatedTime_mm) {
      setValue("estimatedTime_mm", newEstimatedTime_mm);
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
   public Integer getTaskLevel() {
      return (Integer) getValue("taskLevel");
   }
   
   public void setTaskLevel(Integer newTaskLevel) {
      setValue("taskLevel", newTaskLevel);
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
   public Long getPhaseId() {
      return (Long) getValue("phaseId");
   }
   
   public void setPhaseId(Long newPhaseId) {
      setValue("phaseId", newPhaseId);
   }
   
   public Long getProjectId() {
      return (Long) getValue("projectId");
   }
   
   public void setProjectId(Long newProjectId) {
      setValue("projectId", newProjectId);
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
   
   public Long getAssigneeId() {
      return (Long) getValue("assigneeId");
   }
   
   public void setAssigneeId(Long newAssigneeId) {
      setValue("assigneeId", newAssigneeId);
   }
   
   public Long getAssignorId() {
      return (Long) getValue("assignorId");
   }
   
   public void setAssignorId(Long newAssignorId) {
      setValue("assignorId", newAssignorId);
   }
   
   public Long getParentTaskId() {
      return (Long) getValue("parentTaskId");
   }
   
   public void setParentTaskId(Long newParentTaskId) {
      setValue("parentTaskId", newParentTaskId);
   }
   
   public Long getTaskTypeId() {
      return (Long) getValue("taskTypeId");
   }
   
   public void setTaskTypeId(Long newTaskTypeId) {
      setValue("taskTypeId", newTaskTypeId);
   }
   
   public Long getPriorityId() {
      return (Long) getValue("priorityId");
   }
   
   public void setPriorityId(Long newPriorityId) {
      setValue("priorityId", newPriorityId);
   }
}