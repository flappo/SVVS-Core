/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ILeague;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface ILeagueDTO extends IDTO<ILeague>{

    String getName()throws RemoteException ;

//    List<ITournamentTeamDTO> getTournamentTeams();

    void setName(String name)throws RemoteException ;

//    void setTournamentTeams(List<ITournamentTeamDTO> tournamentTeams);
//
//    List<ITeamDTO> getTeams();
//
//    void setTeams(List<ITeamDTO> teams);
    
}
