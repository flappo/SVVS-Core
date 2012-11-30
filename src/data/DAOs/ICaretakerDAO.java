/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ICaretakerDTO;
import data.models.ICaretaker;
import data.models.IDepartment;
import data.models.IPerson;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ICaretakerDAO extends IDAOs<ICaretaker, ICaretakerDTO> {

    List<ICaretaker> getByPerson(Session s, IPerson person) throws RemoteException;

    ICaretaker getByAll(Session s, IPerson person) throws RemoteException;
    
}
