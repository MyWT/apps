package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class Status extends ApplicationDynaBean {

   public String getStatus() {
      return (String) getValue("status");
   }
   
   public void setStatus(String newStatus) {
      setValue("status", newStatus);
   }
}