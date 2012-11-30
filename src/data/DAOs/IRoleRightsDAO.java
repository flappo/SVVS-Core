/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IRoleRightsDTO;
import data.models.IRoleRights;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IRoleRightsDAO extends IDAOs<IRoleRights, IRoleRightsDTO>{

    IRoleRights getById(Session s, int id) throws RemoteException;
    
}
