package aa.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class User extends ApplicationJavaBean {

   private String userName;
   
   public String getUserName() {
      return userName;
   }
   
   public void setUserName(String newUserName) {
      if (ObjectUtils.areEqual(this.userName, newUserName)) { return; }
      this.userName = newUserName;
   }
}