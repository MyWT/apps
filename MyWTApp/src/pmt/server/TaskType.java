package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class TaskType extends ApplicationJavaBean {

   private String taskType;
   
   public String getTaskType() {
      return taskType;
   }
   
   public void setTaskType(String newTaskType) {
      if (ObjectUtils.areEqual(this.taskType, newTaskType)) { return; }
      this.taskType = newTaskType;
   }
}