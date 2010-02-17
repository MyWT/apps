package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class TeamPosition extends ApplicationJavaBean {

   private String positionName;
   
   private String positionCode;
   
   public java.util.Collection eligiblePositions;
   
   private Long parentTeamPositionId;
   
   public String getPositionName() {
      return positionName;
   }
   
   public void setPositionName(String newPositionName) {
      if (ObjectUtils.areEqual(this.positionName, newPositionName)) { return; }
      this.positionName = newPositionName;
   }
   public String getPositionCode() {
      return positionCode;
   }
   
   public void setPositionCode(String newPositionCode) {
      if (ObjectUtils.areEqual(this.positionCode, newPositionCode)) { return; }
      this.positionCode = newPositionCode;
   }
   public java.util.Collection getEligiblePositions() {
      if (eligiblePositions == null) {
         eligiblePositions = new java.util.LinkedList();
      }
      return eligiblePositions;
   }
   
   public void setEligiblePositions(java.util.Collection newEligiblePositions) {
      this.eligiblePositions = newEligiblePositions;
   }
   
   public Long getParentTeamPositionId() {
      return parentTeamPositionId;
   }
   
   public void setParentTeamPositionId(Long newParentTeamPositionId) {
      if (ObjectUtils.areEqual(this.parentTeamPositionId, newParentTeamPositionId)) { return; }
      this.parentTeamPositionId = newParentTeamPositionId;
   }
}