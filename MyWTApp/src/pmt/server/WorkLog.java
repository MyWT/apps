package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class WorkLog extends ApplicationJavaBean {

   private Integer timeWorked_hh;
   
   private Integer timeWorked_mm;
   
   private String remarks;
   
   private java.util.Date loggenOn;
   
   private Long userId;
   
   private Long taskId;
   
   public Integer getTimeWorked_hh() {
      return timeWorked_hh;
   }
   
   public void setTimeWorked_hh(Integer newTimeWorked_hh) {
      if (ObjectUtils.areEqual(this.timeWorked_hh, newTimeWorked_hh)) { return; }
      this.timeWorked_hh = newTimeWorked_hh;
   }
   public Integer getTimeWorked_mm() {
      return timeWorked_mm;
   }
   
   public void setTimeWorked_mm(Integer newTimeWorked_mm) {
      if (ObjectUtils.areEqual(this.timeWorked_mm, newTimeWorked_mm)) { return; }
      this.timeWorked_mm = newTimeWorked_mm;
   }
   public String getRemarks() {
      return remarks;
   }
   
   public void setRemarks(String newRemarks) {
      if (ObjectUtils.areEqual(this.remarks, newRemarks)) { return; }
      this.remarks = newRemarks;
   }
   public java.util.Date getLoggenOn() {
      return loggenOn;
   }
   
   public void setLoggenOn(java.util.Date newLoggenOn) {
      if (ObjectUtils.areEqual(this.loggenOn, newLoggenOn)) { return; }
      this.loggenOn = newLoggenOn;
   }
   public Long getUserId() {
      return userId;
   }
   
   public void setUserId(Long newUserId) {
      if (ObjectUtils.areEqual(this.userId, newUserId)) { return; }
      this.userId = newUserId;
   }
   
   public Long getTaskId() {
      return taskId;
   }
   
   public void setTaskId(Long newTaskId) {
      if (ObjectUtils.areEqual(this.taskId, newTaskId)) { return; }
      this.taskId = newTaskId;
   }
}