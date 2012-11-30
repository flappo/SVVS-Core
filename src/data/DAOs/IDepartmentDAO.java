/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IDepartmentDTO;
import data.models.IDepartment;
import data.models.ISport;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IDepartmentDAO extends IDAOs<IDepartment, IDepartmentDTO>{

    IDepartment getBySport(Session s, ISport model) throws RemoteException;

    IDepartment getById(Session s, int id) throws RemoteException;
    
}
