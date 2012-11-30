/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IContribution;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IContributionDTO extends IDTO<IContribution>{
    
    String getName()throws RemoteException ;
    void setName(String name)throws RemoteException ;
    
    double getValue()throws RemoteException ;
    void setValue(double value)throws RemoteException ;
}
