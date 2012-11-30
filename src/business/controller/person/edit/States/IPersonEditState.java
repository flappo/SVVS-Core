/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.person.edit.States;

import business.IController;
import data.DTOs.IContributionDTO;
import data.DTOs.ICountryDTO;
import data.DTOs.IPersonDTO;
import data.DTOs.ISportDTO;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.LinkedList;

/**
 *
 * @author phil
 */
public interface IPersonEditState extends IController {
    public LinkedList<ICountryDTO> loadCountries() throws RemoteException;
    public LinkedList<IContributionDTO> loadContributions() throws RemoteException;
    public LinkedList<ISportDTO> loadSports() throws RemoteException;
    
    
    public IPersonDTO editPerson(int PersonID, String firstname, String lastname,
            String sex, String phone, String mail,
            String username, String password, Date birthday, int right,
            String street, String postcode, String city, String country, int contributionID) throws RemoteException;
    public void AssignToSport(LinkedList<String> sport, int personID) throws RemoteException;
}
