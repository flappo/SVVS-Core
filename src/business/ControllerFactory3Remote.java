/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.controller.role.EditPersonRole.IEditPersonRole;
import business.controller.role.IRoleController;
import business.controller.tournament.Create.ITournamentCreation;
import business.controller.tournament.ITournamentController;
import business.controller.tournament.edit.ITournamentEdit;
import java.rmi.RemoteException;
import javax.ejb.Remote;

/**
 *
 * @author phil
 */
@Remote
public interface ControllerFactory3Remote {

    public String isOk();
    public ITournamentController getTournamentController() throws RemoteException;
    public ITournamentEdit getTournamentEdit() throws RemoteException;
    public ITournamentCreation getTournamentCreation() throws RemoteException;
    public IRoleController getRoleController() throws RemoteException;
    public IEditPersonRole getEditPersonRole() throws RemoteException;
}
