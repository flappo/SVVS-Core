/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ICountryDTO;
import data.models.ICountry;
import java.rmi.RemoteException;
import javax.ejb.Remote;
import org.hibernate.Session;

/**
 *
 * @author Michael
 */

public interface ICountryDAO extends IDAOs<ICountry, ICountryDTO> {
    
    public ICountry getByName(Session s,String name) throws RemoteException;
    
    public ICountry getByCode(Session s,String code) throws RemoteException;

    ICountry getById(Session s, int id) throws RemoteException;

    ICountryDTO saveDTO(Session s, ICountryDTO dto) throws RemoteException;

    ICountry saveDTOgetModel(Session s, ICountryDTO dto) throws RemoteException;
    
}
