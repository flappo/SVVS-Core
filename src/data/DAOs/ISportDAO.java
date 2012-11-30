/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ISportDTO;
import data.models.ISport;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ISportDAO extends IDAOs<ISport, ISportDTO>{

    ISport getByName(Session s, String name) throws RemoteException;

    ISport getById(Session s, int id) throws RemoteException;

    ISportDTO saveDTO(Session s, ISportDTO dto) throws RemoteException;

    ISport saveDTOgetModel(Session s, ISportDTO dto) throws RemoteException;
    
}
