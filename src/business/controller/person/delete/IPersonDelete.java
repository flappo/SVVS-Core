/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.person.delete;


import business.IController;
import data.DTOs.IPersonDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Michael
 */
public interface IPersonDelete extends Remote, IController {
    public void removePerson(IPersonDTO person) throws RemoteException;
}
