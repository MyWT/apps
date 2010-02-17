package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class Priority extends ApplicationDynaBean {

   public String getPriority() {
      return (String) getValue("priority");
   }
   
   public void setPriority(String newPriority) {
      setValue("priority", newPriority);
   }
}