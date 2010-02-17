package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class SprintTaskDetail extends ApplicationJavaBean {

   private Long taskId;
   
   public Sprint sprint;
   
   
   public Long getTaskId() {
      return taskId;
   }
   
   public void setTaskId(Long newTaskId) {
      if (ObjectUtils.areEqual(this.taskId, newTaskId)) { return; }
      this.taskId = newTaskId;
   }
   
   
   public Sprint getSprint() {
      return sprint;
   }
   
   public void setSprint(Sprint newSprint) {
      if (ObjectUtils.areEqual(this.sprint, newSprint)) { return; }
      this.sprint = newSprint;
   }
}