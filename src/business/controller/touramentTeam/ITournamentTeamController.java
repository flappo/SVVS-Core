/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.touramentTeam;

import business.IController;
import business.messages.jms.interfaces.ITournamentInviteMessage;
import data.DTOs.ISportsmanDTO;
import data.DTOs.ITournamentDTO;
import data.DTOs.ITournamentInviteDTO;
import data.DTOs.ITrainingTeamDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface ITournamentTeamController extends Remote, IController{
    
    public List<ITournamentInviteDTO> loadTournamentTeams() throws RemoteException;
    
    public List<ISportsmanDTO> loadPlayersOfTeam(ITournamentDTO tournament, ITrainingTeamDTO team) throws RemoteException;

    public List<ISportsmanDTO> loadNotAssignedPlayersOfTeam(ITournamentDTO tournament, ITrainingTeamDTO team)throws RemoteException;
    
    public void assignPlayer(ITournamentDTO tournament, ITrainingTeamDTO team, ISportsmanDTO sportsman) throws RemoteException;

    void removePlayer(ITournamentDTO tournament, ITrainingTeamDTO team, ISportsmanDTO sportsman) throws RemoteException;

    void acceptInvite(ITournamentInviteMessage tim, boolean accepted) throws RemoteException;
    
}
