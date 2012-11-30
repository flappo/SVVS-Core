/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ITrainingTeam;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface ITrainingTeamDTO extends IDTO<ITrainingTeam> {

    List<ICoachDTO> getCoaches()throws RemoteException ;

    IDepartmentDTO getDepartment()throws RemoteException ;

    List<ISportsmanTrainingTeamDTO> getSportsmen()throws RemoteException ;

    void setCoaches(List<ICoachDTO> coaches)throws RemoteException ;

    void setDepartment(IDepartmentDTO department)throws RemoteException ;

    void setSportsmen(List<ISportsmanTrainingTeamDTO> sportsmen)throws RemoteException ;

    ISportDTO getSport()throws RemoteException ;

    void setSport(ISportDTO sport)throws RemoteException ;

    ILeagueDTO getLeague()throws RemoteException ;

    void setLeague(ILeagueDTO league)throws RemoteException ;

    String getName()throws RemoteException ;
}
