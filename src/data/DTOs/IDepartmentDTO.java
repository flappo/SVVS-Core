/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DTOs;

import data.models.IDepartment;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author uubu
 */
public interface IDepartmentDTO extends IDTO<IDepartment> {

    String getName()throws RemoteException ;
    
    void setName(String name)throws RemoteException ;

    List<ISportDTO> getSports()throws RemoteException ;

    void setSports(List<ISportDTO> sports)throws RemoteException ;
}
