/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.role.EditPersonRole;

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
import java.util.List;

/**
 *
 * @author phil
 */
public interface IEditPersonRole extends Remote, IController {
    public List<IRoleDTO> loadRolesOfPerson(IPersonDTO person) throws RemoteException;
    public List<IRoleRightsDTO> loadRoleRights() throws RemoteException;
    public List<IRoleRightsDTO> loadRoleRightsOfPerson(IPersonDTO person) throws RemoteException;

    public List<IDepartmentDTO> loadDepartments() throws RemoteException;

    public void EditPersonRole(IPersonDTO person, List<IRoleRightsDTO> roles, IDepartmentDTO department, ISportDTO sport) throws  RemoteException;
}
