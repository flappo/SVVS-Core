/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IRightDTO;
import data.models.IRight;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IRightDAO extends IDAOs<IRight, IRightDTO>{

    Long getRightbyName(Session s, String name) throws RemoteException;
    
}
