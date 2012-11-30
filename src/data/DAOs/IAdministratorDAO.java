/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IAdministratorDTO;
import data.models.IAdministrator;
import data.models.IDepartment;
import data.models.IPerson;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IAdministratorDAO extends IDAOs<IAdministrator, IAdministratorDTO>{

    List<IAdministrator> getByPerson(Session s, IPerson person) throws RemoteException;

    IAdministrator getByAll(Session s, IPerson person) throws RemoteException;
    
}
