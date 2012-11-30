/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IManagerDTO;
import data.models.IDepartment;
import data.models.IManager;
import data.models.IPerson;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IManagerDAO extends IDAOs<IManager, IManagerDTO>{

    List<IManager> getByPerson(Session s, IPerson person) throws RemoteException;

    IManager getByAll(Session s, IPerson person, IDepartment department) throws RemoteException;
    
}
