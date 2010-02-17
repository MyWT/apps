package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class ParentTeamPositionHistory extends ApplicationDynaBean {

   public java.util.Date getValidFrom() {
      return (java.util.Date) getValue("validFrom");
   }
   
   public void setValidFrom(java.util.Date newValidFrom) {
      setValue("validFrom", newValidFrom);
   }
   public java.util.Date getValidUpto() {
      return (java.util.Date) getValue("validUpto");
   }
   
   public void setValidUpto(java.util.Date newValidUpto) {
      setValue("validUpto", newValidUpto);
   }
   public Long getTeamPositionId() {
      return (Long) getValue("teamPositionId");
   }
   
   public void setTeamPositionId(Long newTeamPositionId) {
      setValue("teamPositionId", newTeamPositionId);
   }
   
   public Long getParentTeamPositionId() {
      return (Long) getValue("parentTeamPositionId");
   }
   
   public void setParentTeamPositionId(Long newParentTeamPositionId) {
      setValue("parentTeamPositionId", newParentTeamPositionId);
   }
}