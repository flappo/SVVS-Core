/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ITeamDTO;
import data.models.ILeague;
import data.models.ISport;
import data.models.ITeam;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ITeamDAO extends IDAOs<ITeam, ITeamDTO>{

    List<ITeam> getBySport(Session s, ISport model) throws RemoteException;

    List<ITeam> getByLeague(Session s, ILeague model) throws RemoteException;

    List<ITeam> getBySportAndLeague(Session s, ISport model, ILeague league) throws RemoteException;
    
}
