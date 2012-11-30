/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IRoleRights;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IRoleRightsDTO extends IDTO<IRoleRights> {

    String getName()throws RemoteException ;

    Long getRight()throws RemoteException ;

    void setName(String name)throws RemoteException ;

    void setRight(Long right)throws RemoteException ;
    
}
