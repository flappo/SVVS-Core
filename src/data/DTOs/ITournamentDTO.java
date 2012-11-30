/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ITournament;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface ITournamentDTO extends IDTO<ITournament> {

    String getDate()throws RemoteException ;

    double getFee()throws RemoteException ;

    String getLocation()throws RemoteException ;

    String getName()throws RemoteException ;

    void setDate(String date)throws RemoteException ;

    void setFee(double fee)throws RemoteException ;

    void setLocation(String location)throws RemoteException ;

    void setName(String name)throws RemoteException ;

    List<IMatchDTO> getMatches()throws RemoteException ;

    List<ITeamDTO> getTeams()throws RemoteException ;

    void setMatches(List<IMatchDTO> matches)throws RemoteException ;

    void setTeams(List<ITeamDTO> teams)throws RemoteException ;

    ISportDTO getSport()throws RemoteException ;

    void setSport(ISportDTO sport)throws RemoteException ;

    boolean isFinished()throws RemoteException ;

    void setFinished(boolean finished)throws RemoteException ;

    
}
