/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ICoachDTO;
import data.models.ICoach;
import data.models.IDepartment;
import data.models.IPerson;
import data.models.ISport;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ICoachDAO extends IDAOs<ICoach, ICoachDTO>{

    List<ICoach> getByPerson(Session s, IPerson person) throws RemoteException;

    ICoach getByAll(Session s, IPerson person, IDepartment department, ISport sport) throws RemoteException;
    
}
