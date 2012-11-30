/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ITrainingTeamDTO;
import data.models.ITrainingTeam;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ITrainingTeamDAO extends IDAOs<ITrainingTeam, ITrainingTeamDTO>{

    ITrainingTeam getByName(Session s, String name) throws RemoteException;

    ITrainingTeam getById(Session s, int id) throws RemoteException;
    
}
