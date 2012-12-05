/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.role.EditPersonRole.state;

import business.IController;
import data.DTOs.IDepartmentDTO;
import data.DTOs.IPersonDTO;
import data.DTOs.IRoleDTO;
import data.DTOs.IRoleRightsDTO;
import data.DTOs.ISportDTO;
import data.models.IPerson;
import data.models.IRole;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author phil
 */
public interface IEditPersonRoleState extends IController {

    public List<IRoleRightsDTO> loadRoleRights() throws RemoteException;

    public List<IRoleRightsDTO> loadRoleRightsOfPerson(IPersonDTO person) throws RemoteException;

    public void EditPersonRole(IPersonDTO person, IRoleRightsDTO roles, IDepartmentDTO department, ISportDTO sport) throws RemoteException;
}
