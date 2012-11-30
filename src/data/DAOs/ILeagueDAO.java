/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ILeagueDTO;
import data.models.ILeague;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ILeagueDAO extends IDAOs<ILeague, ILeagueDTO>{

    ILeague getByName(Session s, String name) throws RemoteException;
    
}
