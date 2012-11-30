/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ISportsmanTrainingTeam;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface ISportsmanTrainingTeamDTO extends IDTO<ISportsmanTrainingTeam>{

    String getPosition()throws RemoteException ;

    ISportsmanDTO getSportsman()throws RemoteException ;

//    ITrainingTeamDTO getTeam();

    void setPosition(String position)throws RemoteException ;

    void setSportsman(ISportsmanDTO sportsman)throws RemoteException ;

//    void setTeam(ITrainingTeamDTO team);
    
}
