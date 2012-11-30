/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IContributionHistory;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IContributionHistoryDTO extends IDTO<IContributionHistory> {

    IContributionDTO getContribution()throws RemoteException ;

    int getMonth()throws RemoteException ;

    String getStatus()throws RemoteException ;

    int getYear()throws RemoteException ;

    void setContribution(IContributionDTO contribution)throws RemoteException ;

    void setMonth(int month)throws RemoteException ;

    void setStatus(String status)throws RemoteException ;

    void setYear(int year)throws RemoteException ;

}
