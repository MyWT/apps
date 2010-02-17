package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class WorkLog extends ApplicationDynaBean {

   public Integer getTimeWorked_hh() {
      return (Integer) getValue("timeWorked_hh");
   }
   
   public void setTimeWorked_hh(Integer newTimeWorked_hh) {
      setValue("timeWorked_hh", newTimeWorked_hh);
   }
   public Integer getTimeWorked_mm() {
      return (Integer) getValue("timeWorked_mm");
   }
   
   public void setTimeWorked_mm(Integer newTimeWorked_mm) {
      setValue("timeWorked_mm", newTimeWorked_mm);
   }
   public String getRemarks() {
      return (String) getValue("remarks");
   }
   
   public void setRemarks(String newRemarks) {
      setValue("remarks", newRemarks);
   }
   public java.util.Date getLoggenOn() {
      return (java.util.Date) getValue("loggenOn");
   }
   
   public void setLoggenOn(java.util.Date newLoggenOn) {
      setValue("loggenOn", newLoggenOn);
   }
   public Long getUserId() {
      return (Long) getValue("userId");
   }
   
   public void setUserId(Long newUserId) {
      setValue("userId", newUserId);
   }
   
   public Long getTaskId() {
      return (Long) getValue("taskId");
   }
   
   public void setTaskId(Long newTaskId) {
      setValue("taskId", newTaskId);
   }
}