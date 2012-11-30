/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IAddressDTO;
import data.models.IAddress;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Michael
 */
public interface IAddressDAO extends IDAOs<IAddress,IAddressDTO> {
    
    public List<IAddress> getByCity(Session s, String city) throws RemoteException;

    IAddress getById(Session s, int id) throws RemoteException;

    IAddressDTO saveDTO(Session s, IAddressDTO dto) throws RemoteException;

    IAddress saveDTOgetModel(Session s, IAddressDTO dto) throws RemoteException;
    
}
