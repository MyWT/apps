package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class ParentTeamPositionHistory extends ApplicationJavaBean {

   private java.util.Date validFrom;
   
   private java.util.Date validUpto;
   
   private Long teamPositionId;
   
   private Long parentTeamPositionId;
   
   public java.util.Date getValidFrom() {
      return validFrom;
   }
   
   public void setValidFrom(java.util.Date newValidFrom) {
      if (ObjectUtils.areEqual(this.validFrom, newValidFrom)) { return; }
      this.validFrom = newValidFrom;
   }
   public java.util.Date getValidUpto() {
      return validUpto;
   }
   
   public void setValidUpto(java.util.Date newValidUpto) {
      if (ObjectUtils.areEqual(this.validUpto, newValidUpto)) { return; }
      this.validUpto = newValidUpto;
   }
   public Long getTeamPositionId() {
      return teamPositionId;
   }
   
   public void setTeamPositionId(Long newTeamPositionId) {
      if (ObjectUtils.areEqual(this.teamPositionId, newTeamPositionId)) { return; }
      this.teamPositionId = newTeamPositionId;
   }
   
   public Long getParentTeamPositionId() {
      return parentTeamPositionId;
   }
   
   public void setParentTeamPositionId(Long newParentTeamPositionId) {
      if (ObjectUtils.areEqual(this.parentTeamPositionId, newParentTeamPositionId)) { return; }
      this.parentTeamPositionId = newParentTeamPositionId;
   }
}