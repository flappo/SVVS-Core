/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IRoleDTO;
import data.models.IDepartment;
import data.models.IPerson;
import data.models.IRole;
import data.models.ISport;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IRoleDAO extends IDAOs<IRole, IRoleDTO> {

    List<IRole> getBySportAndPerson(Session s, ISport sport, IPerson person) throws RemoteException;

    List<IRole> getByPerson(Session s, IPerson person) throws RemoteException;

    List<IRole> getBySport(Session s, ISport sport) throws RemoteException;

    IRole getByAll(Session s, IPerson person, IDepartment department, ISport sport) throws RemoteException;
    
}
