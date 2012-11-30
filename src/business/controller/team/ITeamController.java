/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.team;

import business.IController;
import data.DTOs.ISportsmanTrainingTeamDTO;
import data.DTOs.ITeamDTO;
import data.DTOs.ITournamentDTO;
import data.DTOs.ITrainingTeamDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author phil
 */
public interface ITeamController extends Remote, IController {

    public LinkedList<ITeamDTO> loadTeams() throws RemoteException;

    public LinkedList<ITeamDTO> loadTeams(String sportname) throws RemoteException;

    public LinkedList<ITeamDTO> loadTeamsWithLeague(String leaguename) throws RemoteException;

    public LinkedList<ITeamDTO> loadTeams(String sportname, String leaguename) throws RemoteException;

    public LinkedList<ITrainingTeamDTO> loadTrainingTeams() throws RemoteException;

    public LinkedList<ITrainingTeamDTO> loadTrainingTeams(String name) throws RemoteException;
    public LinkedList<ITrainingTeamDTO> loadTrainingTeamsWithSport(String sportname) throws RemoteException;

    public LinkedList<ISportsmanTrainingTeamDTO> loadPlayersOfTeam(String TeamName) throws RemoteException;

    List<ISportsmanTrainingTeamDTO> loadAssignedPlayersOfTeam(ITournamentDTO tournament, ITeamDTO team) throws RemoteException;
}
