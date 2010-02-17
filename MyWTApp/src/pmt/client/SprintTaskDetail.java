package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class SprintTaskDetail extends ApplicationDynaBean {

   
   public Long getTaskId() {
      return (Long) getValue("taskId");
   }
   
   public void setTaskId(Long newTaskId) {
      setValue("taskId", newTaskId);
   }
   
   
   public Sprint getSprint() {
      return (Sprint) getValue("sprint");
   }
   
   public void setSprint(Sprint newSprint) {
      setValue("sprint", newSprint);
   }
}