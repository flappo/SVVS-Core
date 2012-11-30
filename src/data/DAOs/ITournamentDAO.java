/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ITournamentDTO;
import data.models.ITournament;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ITournamentDAO extends IDAOs<ITournament, ITournamentDTO>{

    ITournament getById(Session s, int id) throws RemoteException;
    
}
