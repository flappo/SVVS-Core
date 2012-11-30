/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.ISportsman;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface ISportsmanDTO extends IDTO<ISportsman>{

    IDepartmentDTO getDepartment()throws RemoteException ;

    IPersonDTO getPerson()throws RemoteException ;

    IRoleRightsDTO getRoleRight()throws RemoteException ;

    ISportDTO getSport()throws RemoteException ;

    void setDepartment(IDepartmentDTO department)throws RemoteException ;

    void setPerson(IPersonDTO person)throws RemoteException ;

    void setRoleRight(IRoleRightsDTO roleRight)throws RemoteException ;

    void setSport(ISportDTO sport)throws RemoteException ;
    
}
