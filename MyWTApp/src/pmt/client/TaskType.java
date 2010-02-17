package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class TaskType extends ApplicationDynaBean {

   public String getTaskType() {
      return (String) getValue("taskType");
   }
   
   public void setTaskType(String newTaskType) {
      setValue("taskType", newTaskType);
   }
}