/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.tournament;

import business.IController;
import data.DTOs.IDepartmentDTO;
import data.DTOs.ISportDTO;
import data.DTOs.ITeamDTO;
import data.DTOs.ITournamentDTO;
import data.models.ITournament;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author phil
 */
public interface ITournamentController extends Remote, IController {

    public LinkedList<ITeamDTO> loadTeams(String sportname) throws RemoteException;

    public LinkedList<ISportDTO> loadSport(List<IDepartmentDTO> department) throws RemoteException;

    public LinkedList<ITournamentDTO> loadTournaments() throws RemoteException;

    public ITournament loadTournament(int ID) throws RemoteException;

    ITournamentDTO loadTournamentDTO(int ID) throws RemoteException;
}
