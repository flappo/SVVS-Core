/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IRole;
import java.rmi.RemoteException;

/**
 *
 * @author uubu
 */
public interface IRoleDTO extends IDTO<IRole>{
    
     public IRoleRightsDTO getRoleRight()throws RemoteException ;
     public void setRoleRight(IRoleRightsDTO roleRight)throws RemoteException ;
     public IDepartmentDTO getDepartment()throws RemoteException ;
     public void setDepartment(IDepartmentDTO department)throws RemoteException ;
     public ISportDTO getSport()throws RemoteException ;
     public void setSport(ISportDTO sport)throws RemoteException ;
    
}
