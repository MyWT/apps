package pmt.client;

import rnd.webapp.mwt.client.bean.ApplicationDynaBean;

public class TeamChart extends ApplicationDynaBean {

   public String getChartName() {
      return (String) getValue("chartName");
   }
   
   public void setChartName(String newChartName) {
      setValue("chartName", newChartName);
   }
   public Long getTeamStructureId() {
      return (Long) getValue("teamStructureId");
   }
   
   public void setTeamStructureId(Long newTeamStructureId) {
      setValue("teamStructureId", newTeamStructureId);
   }
   
   public Long getRootTeamPositionHolderId() {
      return (Long) getValue("rootTeamPositionHolderId");
   }
   
   public void setRootTeamPositionHolderId(Long newRootTeamPositionHolderId) {
      setValue("rootTeamPositionHolderId", newRootTeamPositionHolderId);
   }
}