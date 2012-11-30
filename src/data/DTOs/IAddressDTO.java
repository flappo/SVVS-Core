/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IAddress;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IAddressDTO extends IDTO<IAddress>{

    void setStreet(String street)throws RemoteException ;
    String getStreet()throws RemoteException ;
    
    void setPostcode(String postcode)throws RemoteException ;
    String getPostcode()throws RemoteException ;
    
    void setCity(String city)throws RemoteException ;
    String getCity()throws RemoteException ;
    
    void setCountry(ICountryDTO country)throws RemoteException ;
    ICountryDTO getCountry()throws RemoteException ;
    
}
