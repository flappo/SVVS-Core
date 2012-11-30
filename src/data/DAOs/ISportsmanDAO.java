/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ISportsmanDTO;
import data.models.IDepartment;
import data.models.IPerson;
import data.models.ISport;
import data.models.ISportsman;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ISportsmanDAO extends IDAOs<ISportsman, ISportsmanDTO>{

    List<ISportsman> getByPerson(Session s, IPerson person) throws RemoteException;

    ISportsman getByAll(Session s, IPerson person, IDepartment department, ISport sport) throws RemoteException;

    ISportsman getById(Session s, int id) throws RemoteException;
    
}
