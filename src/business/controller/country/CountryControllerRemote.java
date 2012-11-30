/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.country;

import business.IController;
import data.DTOs.ICountryDTO;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.EJBObject;
import javax.ejb.Remote;

/**
 *
 * @author phil
 */
public interface CountryControllerRemote extends IController{
    public List<ICountryDTO> getCountries() throws RemoteException;
}
