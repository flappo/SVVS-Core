/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IRight;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IRightDTO extends IDTO<IRight> {

    String getName()throws RemoteException ;

    long getValue()throws RemoteException ;

    void setName(String name)throws RemoteException ;

    void setValue(long value)throws RemoteException ;
    
}
