/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ITournamentInvite;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface ITournamentInviteDTO extends IDTO<ITournamentInvite>{

    void extract(ITournamentInvite model)throws RemoteException ;

    ISportsmanDTO getSportsman()throws RemoteException ;

    ITournamentDTO getTournament()throws RemoteException ;

    boolean isAccepted()throws RemoteException ;

    void setAccepted(boolean accepted)throws RemoteException ;

    void setSportsman(ISportsmanDTO sportsman)throws RemoteException ;

    void setTournament(ITournamentDTO tournament)throws RemoteException ;

    ITrainingTeamDTO getTeam()throws RemoteException ;

    void setTeam(ITrainingTeamDTO team)throws RemoteException ;
    
}
