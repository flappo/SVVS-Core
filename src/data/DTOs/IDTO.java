/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IModel;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author uubu
 */
@javax.ejb.Remote
public interface IDTO<V extends IModel> extends Serializable, Remote{
    
   int getId()throws RemoteException ;
   
   void extract(V model)throws RemoteException ;
   
   String getValues() throws RemoteException;

}
