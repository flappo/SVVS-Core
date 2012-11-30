/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.sport;

import business.IController;
import data.DTOs.ISportDTO;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author phil
 */
public interface ISportController extends IController {

    public List<ISportDTO> getAllSports() throws RemoteException;
}
