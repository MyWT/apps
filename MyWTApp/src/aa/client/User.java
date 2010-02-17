package aa.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class User extends ApplicationDynaBean {

   public String getUserName() {
      return (String) getValue("userName");
   }
   
   public void setUserName(String newUserName) {
      setValue("userName", newUserName);
   }
}