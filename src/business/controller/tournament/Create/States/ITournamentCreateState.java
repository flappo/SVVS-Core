/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.tournament.Create.States;

import business.IController;
import data.DTOs.IDepartmentDTO;
import data.DTOs.ISportDTO;
import data.DTOs.ITeamDTO;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

/**
 * Interface für alle Funktionen 
 * @author phil
 */
public interface ITournamentCreateState extends IController{
    public LinkedList<ISportDTO> loadSport(List<IDepartmentDTO> department) throws RemoteException;
    public LinkedList<ITeamDTO> loadTeams(String sport) throws RemoteException;
    public void CreateTournament(String name, String location, BigDecimal fee,
    String sportname, List<String> TeamNames)throws RemoteException;
}
