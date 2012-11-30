/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.IContributionDTO;
import data.models.IContribution;
import java.rmi.RemoteException;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface IContributionDAO extends IDAOs<IContribution, IContributionDTO>{

    IContribution getById(Session s, int id) throws RemoteException;

    IContributionDTO saveDTO(Session s, IContributionDTO dto) throws RemoteException;

    IContribution saveDTOgetModel(Session s, IContributionDTO dto) throws RemoteException;
    
}
