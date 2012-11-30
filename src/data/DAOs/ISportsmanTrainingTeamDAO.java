/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ISportsmanDTO;
import data.DTOs.ISportsmanTrainingTeamDTO;
import data.DTOs.ITrainingTeamDTO;
import data.models.ISportsman;
import data.models.ISportsmanTrainingTeam;
import data.models.ITrainingTeam;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ISportsmanTrainingTeamDAO extends IDAOs<ISportsmanTrainingTeam, ISportsmanTrainingTeamDTO>{

    ISportsmanTrainingTeam getById(Session s, int id) throws RemoteException;

    List<ISportsmanTrainingTeam> getBySportsman(Session s, ISportsman sportsman) throws RemoteException;

    ISportsmanTrainingTeam getBySportsmanAndTeam(Session s, ISportsman sportsman, ITrainingTeam team) throws RemoteException;

    ISportsmanTrainingTeam getBySportsmanAndTeamDTO(Session s, ISportsmanDTO sportsman, ITrainingTeamDTO team) throws RemoteException;
    
}
