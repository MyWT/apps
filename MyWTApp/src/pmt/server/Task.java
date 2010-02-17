package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class Task extends ApplicationJavaBean {

   private String taskNo;
   
   private String taskName;
   
   private String description;
   
   private String remarks;
   
   private Integer estimatedTime_hh;
   
   private Integer estimatedTime_mm;
   
   private java.util.Date startDate;
   
   private java.util.Date endDate;
   
   private java.util.Date dueDate;
   
   private Integer taskLevel;
   
   private java.util.Date createdOn;
   
   private java.util.Date updatedOn;
   
   private Long phaseId;
   
   private Long projectId;
   
   private Long createdById;
   
   private Long statusId;
   
   private Long assigneeId;
   
   private Long assignorId;
   
   private Long parentTaskId;
   
   private Long taskTypeId;
   
   private Long priorityId;
   
   public String getTaskNo() {
      return taskNo;
   }
   
   public void setTaskNo(String newTaskNo) {
      if (ObjectUtils.areEqual(this.taskNo, newTaskNo)) { return; }
      this.taskNo = newTaskNo;
   }
   public String getTaskName() {
      return taskName;
   }
   
   public void setTaskName(String newTaskName) {
      if (ObjectUtils.areEqual(this.taskName, newTaskName)) { return; }
      this.taskName = newTaskName;
   }
   public String getDescription() {
      return description;
   }
   
   public void setDescription(String newDescription) {
      if (ObjectUtils.areEqual(this.description, newDescription)) { return; }
      this.description = newDescription;
   }
   public String getRemarks() {
      return remarks;
   }
   
   public void setRemarks(String newRemarks) {
      if (ObjectUtils.areEqual(this.remarks, newRemarks)) { return; }
      this.remarks = newRemarks;
   }
   public Integer getEstimatedTime_hh() {
      return estimatedTime_hh;
   }
   
   public void setEstimatedTime_hh(Integer newEstimatedTime_hh) {
      if (ObjectUtils.areEqual(this.estimatedTime_hh, newEstimatedTime_hh)) { return; }
      this.estimatedTime_hh = newEstimatedTime_hh;
   }
   public Integer getEstimatedTime_mm() {
      return estimatedTime_mm;
   }
   
   public void setEstimatedTime_mm(Integer newEstimatedTime_mm) {
      if (ObjectUtils.areEqual(this.estimatedTime_mm, newEstimatedTime_mm)) { return; }
      this.estimatedTime_mm = newEstimatedTime_mm;
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
   public Integer getTaskLevel() {
      return taskLevel;
   }
   
   public void setTaskLevel(Integer newTaskLevel) {
      if (ObjectUtils.areEqual(this.taskLevel, newTaskLevel)) { return; }
      this.taskLevel = newTaskLevel;
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
   public Long getPhaseId() {
      return phaseId;
   }
   
   public void setPhaseId(Long newPhaseId) {
      if (ObjectUtils.areEqual(this.phaseId, newPhaseId)) { return; }
      this.phaseId = newPhaseId;
   }
   
   public Long getProjectId() {
      return projectId;
   }
   
   public void setProjectId(Long newProjectId) {
      if (ObjectUtils.areEqual(this.projectId, newProjectId)) { return; }
      this.projectId = newProjectId;
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
   
   public Long getAssigneeId() {
      return assigneeId;
   }
   
   public void setAssigneeId(Long newAssigneeId) {
      if (ObjectUtils.areEqual(this.assigneeId, newAssigneeId)) { return; }
      this.assigneeId = newAssigneeId;
   }
   
   public Long getAssignorId() {
      return assignorId;
   }
   
   public void setAssignorId(Long newAssignorId) {
      if (ObjectUtils.areEqual(this.assignorId, newAssignorId)) { return; }
      this.assignorId = newAssignorId;
   }
   
   public Long getParentTaskId() {
      return parentTaskId;
   }
   
   public void setParentTaskId(Long newParentTaskId) {
      if (ObjectUtils.areEqual(this.parentTaskId, newParentTaskId)) { return; }
      this.parentTaskId = newParentTaskId;
   }
   
   public Long getTaskTypeId() {
      return taskTypeId;
   }
   
   public void setTaskTypeId(Long newTaskTypeId) {
      if (ObjectUtils.areEqual(this.taskTypeId, newTaskTypeId)) { return; }
      this.taskTypeId = newTaskTypeId;
   }
   
   public Long getPriorityId() {
      return priorityId;
   }
   
   public void setPriorityId(Long newPriorityId) {
      if (ObjectUtils.areEqual(this.priorityId, newPriorityId)) { return; }
      this.priorityId = newPriorityId;
   }
}