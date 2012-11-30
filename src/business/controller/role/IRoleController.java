/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.role;

import business.IController;
import data.DTOs.IDepartmentDTO;
import data.DTOs.IPersonDTO;
import data.DTOs.IRoleDTO;
import data.DTOs.IRoleRightsDTO;
import data.DTOs.ISportDTO;
import data.models.IPerson;
import data.models.IRole;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author phil
 */
public interface IRoleController extends Remote, IController  {
    public List<IRoleDTO> loadRolesOfPerson(IPersonDTO person) throws RemoteException;
    public List<IRoleRightsDTO> loadRoleRights() throws RemoteException;
    public List<IRoleRightsDTO> loadRoleRightsOfPerson(IPersonDTO person)throws RemoteException;
    //public void EditPersonRole(IPerson person, List<IRole> roles) throws  RemoteException;
     public void EditPersonRole(IPersonDTO person, List<IRoleRightsDTO> roles, IDepartmentDTO department, ISportDTO sport)throws  RemoteException ;
     public boolean hasRole(IPersonDTO person, String Rolename) throws RemoteException;
     public List<IRoleDTO> getRole(IPersonDTO person, String Rolename) throws RemoteException ;
}
