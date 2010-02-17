package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class TeamPosition extends ApplicationDynaBean {

   public String getPositionName() {
      return (String) getValue("positionName");
   }
   
   public void setPositionName(String newPositionName) {
      setValue("positionName", newPositionName);
   }
   public String getPositionCode() {
      return (String) getValue("positionCode");
   }
   
   public void setPositionCode(String newPositionCode) {
      setValue("positionCode", newPositionCode);
   }
   public java.util.Collection getEligiblePositions() {
      return getListValue("eligiblePositions");
   }
   
   public void setEligiblePositions(java.util.Collection newEligiblePositions) {
      setListValue("eligiblePositions", newEligiblePositions);
   }
   
   public Long getParentTeamPositionId() {
      return (Long) getValue("parentTeamPositionId");
   }
   
   public void setParentTeamPositionId(Long newParentTeamPositionId) {
      setValue("parentTeamPositionId", newParentTeamPositionId);
   }
}