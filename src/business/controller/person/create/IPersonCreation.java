/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.person.create;


import business.IController;
import data.DTOs.IContributionDTO;
import data.DTOs.ICountryDTO;
import data.DTOs.IPersonDTO;
import data.DTOs.ISportDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Date;
import java.util.LinkedList;
/**
 * First loadCountries
 * Second loadSports
 * Third LoadContributions
 * Fourth CreatePerson
 * Fifth AssignToSport
 *
 * @author phil
 */
public interface IPersonCreation extends Remote, IController {
    public LinkedList<ICountryDTO> loadCountries() throws RemoteException;
    public LinkedList<ISportDTO> loadSports() throws RemoteException;
    public LinkedList<IContributionDTO> loadContributions() throws RemoteException;
    
    public IPersonDTO CreatePerson(String firstname, String lastname,
            String sex, String phone, String mail,
            String username, String password, Date birthday, int right,
            String street, String postcode, String city, String country, int contributionID) throws RemoteException;
    
    public void AssignToSport(LinkedList<String> sport, int personID) throws RemoteException;

    IPersonDTO CreatePersonDTO() throws RemoteException;

    IPersonDTO SaveDTO(IPersonDTO dto) throws RemoteException;
}
