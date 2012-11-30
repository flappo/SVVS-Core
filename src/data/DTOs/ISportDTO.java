/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ISport;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface ISportDTO extends IDTO<ISport> {

    int getMaxPlayers()throws RemoteException ;

    String getName()throws RemoteException ;

//    List<ITeamDTO> getTeams();

    void setMaxPlayers(int maxPlayers)throws RemoteException ;

    void setName(String name)throws RemoteException ;
//
//    void setTeams(List<ITeamDTO> teams);
    
}
