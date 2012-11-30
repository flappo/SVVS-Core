/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ICountry;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface ICountryDTO extends IDTO<ICountry> {
    
    String getName()throws RemoteException ;
    void setName(String name)throws RemoteException ;
    
    String getCode()throws RemoteException ;
    void setCode(String code)throws RemoteException ;
}
