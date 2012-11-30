/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.person;


import business.IController;
import data.DTOs.ICountryDTO;
import data.DTOs.IPersonDTO;
import data.DTOs.ISportDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author phil
 */
public interface IPersonController extends Remote, IController {
    public LinkedList<ICountryDTO> loadCountries() throws RemoteException;
    public LinkedList<ISportDTO> loadSports() throws RemoteException;
    public List<IPersonDTO> loadPersons() throws RemoteException;
    public IPersonDTO loadPersonWithUsername(String username) throws RemoteException;
}
