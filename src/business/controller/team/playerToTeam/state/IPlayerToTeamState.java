/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.team.playerToTeam.state;

import business.IController;
import data.DTOs.ISportsmanDTO;
import data.DTOs.ISportsmanTrainingTeamDTO;
import data.DTOs.ITeamDTO;
import data.DTOs.ITrainingTeamDTO;
import data.models.ISportsman;
import java.rmi.RemoteException;
import java.util.LinkedList;

/**
 *
 * @author phil
 */
public interface IPlayerToTeamState  extends IController {
  public LinkedList<ITrainingTeamDTO> loadTeam()  throws RemoteException;
  public LinkedList<ITrainingTeamDTO> loadTeams(String sportname) throws RemoteException;
  public LinkedList<ISportsmanTrainingTeamDTO> loadPlayersOfTeam(String TeamName) throws RemoteException;
  public LinkedList<ISportsmanDTO> loadSportsman(String sportname)throws RemoteException;
  public void AddPlayerToTeam(int TrainingTeamID, int SportsmanID, String position) throws RemoteException ;
}
