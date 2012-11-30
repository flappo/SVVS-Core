/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.controller.JMS.IMessageController;
import business.controller.country.CountryControllerRemote;
import business.controller.departments.IDepartmentController;
import business.controller.person.IAuthentificationController;
import business.controller.person.IPersonController;
import business.controller.person.create.IPersonCreation;
import business.controller.person.delete.IPersonDelete;
import business.controller.person.edit.IPersonEdit;
import business.controller.sport.ISportController;
import business.controller.team.ITeamController;
import java.io.Serializable;
import java.rmi.RemoteException;
import javax.ejb.Remote;

/**
 *
 * @author phil
 */
@Remote
public interface ControllerFactoryRemote extends Serializable {

    public String isOk() throws RemoteException;
    public ISportController getSportController() throws RemoteException;
    public CountryControllerRemote getCountryController() throws RemoteException;
    public IDepartmentController getDepartmentController() throws RemoteException;
    public IPersonController getPersonController() throws RemoteException;
    public IAuthentificationController getAuthentificationController() throws RemoteException;
    public IPersonCreation getPersonCreation() throws RemoteException;
    public IPersonDelete getPersonDelete() throws RemoteException;
    public IPersonEdit getPersonEdit() throws RemoteException;
    public IMessageController getMessageController() throws RemoteException, Exception;
}
