/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IPerson;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface IPersonDTO extends IDTO<IPerson>{

    String getBirthdate()throws RemoteException ;

    String getFirstname()throws RemoteException ;

    String getLastname()throws RemoteException ;

    String getMail()throws RemoteException ;

    IAddressDTO getMainAddress()throws RemoteException ;

    String getPassword()throws RemoteException ;

    String getPhone()throws RemoteException ;

    Long getRight()throws RemoteException ;

    String getSex()throws RemoteException ;

    String getUsername()throws RemoteException ;

    void setBirthdate(String birthdate)throws RemoteException ;

    void setFirstname(String firstname)throws RemoteException ;

    void setLastname(String lastname)throws RemoteException ;

    void setMail(String mail)throws RemoteException ;

    void setMainAddress(IAddressDTO mainAddress)throws RemoteException ;

    void setPassword(String password)throws RemoteException ;

    void setPhone(String phone)throws RemoteException ;

    void setRight(Long right)throws RemoteException ;

    void setSex(String sex)throws RemoteException ;

    void setUsername(String username)throws RemoteException ;

    IContributionDTO getContribution()throws RemoteException ;

    String getContributionStatus()throws RemoteException ;

    List<IDepartmentDTO> getDepartments()throws RemoteException ;

    List<ISportDTO> getSports()throws RemoteException ;

    void setContribution(IContributionDTO contribution)throws RemoteException ;

    void setContributionStatus(String contributionStatus)throws RemoteException ;

    void setDepartments(List<IDepartmentDTO> departments)throws RemoteException ;

    void setSports(List<ISportDTO> sports)throws RemoteException ;

    boolean hasRight(long right)throws RemoteException ;

    
}
