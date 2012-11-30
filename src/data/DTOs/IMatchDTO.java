/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IMatch;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IMatchDTO extends IDTO<IMatch> {

    String getDate()throws RemoteException ;

    Integer getGoalsTeam1()throws RemoteException ;

    Integer getGoalsTeam2()throws RemoteException ;

    String getLocation()throws RemoteException ;

    ITeamDTO getTeam1()throws RemoteException ;

    ITeamDTO getTeam2()throws RemoteException ;

    ITournamentDTO getTournament()throws RemoteException ;

    void setDate(String date)throws RemoteException ;

    void setGoalsTeam1(Integer goalsTeam1)throws RemoteException ;

    void setGoalsTeam2(Integer goalsTeam2)throws RemoteException ;

    void setLocation(String location)throws RemoteException ;

    void setTeam1(ITeamDTO team1)throws RemoteException ;

    void setTeam2(ITeamDTO team2)throws RemoteException ;

    void setTournament(ITournamentDTO tournament)throws RemoteException ;
    
}
