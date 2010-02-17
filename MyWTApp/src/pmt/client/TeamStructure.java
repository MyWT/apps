package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class TeamStructure extends ApplicationDynaBean {

   public String getStructureName() {
      return (String) getValue("structureName");
   }
   
   public void setStructureName(String newStructureName) {
      setValue("structureName", newStructureName);
   }
   public Long getRootPositionId() {
      return (Long) getValue("rootPositionId");
   }
   
   public void setRootPositionId(Long newRootPositionId) {
      setValue("rootPositionId", newRootPositionId);
   }
}