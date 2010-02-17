package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class TeamPositionHolder extends ApplicationJavaBean {

   private Long teamPositionId;
   
   private Long positionHolderId;
   
   private Long positionHolderUserId;
   
   private Long parentTeamPositionHolderId;
   
   
   public Long getTeamPositionId() {
      return teamPositionId;
   }
   
   public void setTeamPositionId(Long newTeamPositionId) {
      if (ObjectUtils.areEqual(this.teamPositionId, newTeamPositionId)) { return; }
      this.teamPositionId = newTeamPositionId;
   }
   
   public Long getPositionHolderId() {
      return positionHolderId;
   }
   
   public void setPositionHolderId(Long newPositionHolderId) {
      if (ObjectUtils.areEqual(this.positionHolderId, newPositionHolderId)) { return; }
      this.positionHolderId = newPositionHolderId;
   }
   
   public Long getPositionHolderUserId() {
      return positionHolderUserId;
   }
   
   public void setPositionHolderUserId(Long newPositionHolderUserId) {
      if (ObjectUtils.areEqual(this.positionHolderUserId, newPositionHolderUserId)) { return; }
      this.positionHolderUserId = newPositionHolderUserId;
   }
   
   public Long getParentTeamPositionHolderId() {
      return parentTeamPositionHolderId;
   }
   
   public void setParentTeamPositionHolderId(Long newParentTeamPositionHolderId) {
      if (ObjectUtils.areEqual(this.parentTeamPositionHolderId, newParentTeamPositionHolderId)) { return; }
      this.parentTeamPositionHolderId = newParentTeamPositionHolderId;
   }
}