/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IDTO;
import data.models.IManager;
import data.models.IModel;
import data.models.IPerson;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.Remote;
import org.hibernate.Session;

/**
 * * @author Michael
 */
@Remote
public interface IDAOs<V extends IModel, X extends IDTO> extends Serializable, java.rmi.Remote {
    
    public List<V> getAll(Session s) throws RemoteException;
    
    public List<X> getAllDTO(Session s) throws RemoteException;
    
    public X extractDTO(V model) throws RemoteException;
    
   // public V extractModel(X dto throws RemoteException);
    
    public void add(Session s, V model) throws RemoteException;
    
    public void remove(Session s, V model) throws RemoteException;
    
     public void remove(Session s, List<V> models) throws RemoteException;
    
    public void update(Session s, V model) throws RemoteException;
    
    public V create() throws RemoteException;

}
