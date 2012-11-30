/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IPersonDTO;
import data.models.IPerson;
import data.models.IRole;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Michael
 */
public interface IPersonDAO extends IDAOs<IPerson, IPersonDTO> {
    
    public List<IPerson> getByLastName(Session s,String name) throws RemoteException;
    
    public List<IPerson> getByFirstName(Session s, String name) throws RemoteException;
    
    public List<IPerson> getLikeName(Session s,String name) throws RemoteException;

    List<IRole> getAllRoles(Session s, IPerson model) throws RemoteException;

    IPerson getById(Session s, int id) throws RemoteException;

    IPersonDTO saveDTO(Session s, IPersonDTO personDTO) throws RemoteException;

    IPerson saveDTOgetModel(Session s, IPersonDTO personDTO) throws RemoteException;

    IPersonDTO createPersonDTO() throws RemoteException;
    IPerson getUserByUserName(String Username, Session s) throws RemoteException;
    


    void removeDTO(Session s, IPersonDTO dto) throws RemoteException;

    IPerson getByUsername(Session s, String name) throws RemoteException;
    
}
