/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ITeam;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface ITeamDTO extends IDTO<ITeam> {

    void extract(ITeam model)throws RemoteException ;

    String getName()throws RemoteException ;

    //ISportDTO getSport();
//
//    List<ITournamentDTO> getTournaments();

    void setName(String name)throws RemoteException ;

    //void setSport(ISportDTO sport);

//    void setTournaments(List<ITournamentDTO> tournaments);

    ILeagueDTO getLeague()throws RemoteException ;

    void setLeague(ILeagueDTO league)throws RemoteException ;
    
}
