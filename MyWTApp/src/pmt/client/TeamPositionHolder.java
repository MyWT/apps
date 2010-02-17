package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class TeamPositionHolder extends ApplicationDynaBean {

   
   public Long getTeamPositionId() {
      return (Long) getValue("teamPositionId");
   }
   
   public void setTeamPositionId(Long newTeamPositionId) {
      setValue("teamPositionId", newTeamPositionId);
   }
   
   public Long getPositionHolderId() {
      return (Long) getValue("positionHolderId");
   }
   
   public void setPositionHolderId(Long newPositionHolderId) {
      setValue("positionHolderId", newPositionHolderId);
   }
   
   public Long getPositionHolderUserId() {
      return (Long) getValue("positionHolderUserId");
   }
   
   public void setPositionHolderUserId(Long newPositionHolderUserId) {
      setValue("positionHolderUserId", newPositionHolderUserId);
   }
   
   public Long getParentTeamPositionHolderId() {
      return (Long) getValue("parentTeamPositionHolderId");
   }
   
   public void setParentTeamPositionHolderId(Long newParentTeamPositionHolderId) {
      setValue("parentTeamPositionHolderId", newParentTeamPositionHolderId);
   }
}