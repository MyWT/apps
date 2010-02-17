package pmt.server;

import rnd.webapp.mwt.client.utils.ObjectUtils;
import rnd.webapp.mwt.server.bean.ApplicationJavaBean;

public class EligiblePosition extends ApplicationJavaBean {

   private Long positionId;
   
   public TeamPosition teamPosition;
   
   
   public Long getPositionId() {
      return positionId;
   }
   
   public void setPositionId(Long newPositionId) {
      if (ObjectUtils.areEqual(this.positionId, newPositionId)) { return; }
      this.positionId = newPositionId;
   }
   
   
   public TeamPosition getTeamPosition() {
      return teamPosition;
   }
   
   public void setTeamPosition(TeamPosition newTeamPosition) {
      if (ObjectUtils.areEqual(this.teamPosition, newTeamPosition)) { return; }
      this.teamPosition = newTeamPosition;
   }
}