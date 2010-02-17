package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class Status extends ApplicationJavaBean {

   private String status;
   
   public String getStatus() {
      return status;
   }
   
   public void setStatus(String newStatus) {
      if (ObjectUtils.areEqual(this.status, newStatus)) { return; }
      this.status = newStatus;
   }
}