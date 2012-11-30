/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.tournament.Create;

import business.IController;
import data.DTOs.IDepartmentDTO;
import data.DTOs.ILeagueDTO;
import data.DTOs.ISportDTO;
import data.DTOs.ITeamDTO;
import data.DTOs.ITournamentDTO;
import data.models.ILeague;
import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;


/**
 * Context für den Use Case neues Tournament, GUI sollte interface von dem
 * kriegen
 *
 * First LoadSport
 * Second LoadTeams
 * Third CreateTournament
 * @author phil
 */
public interface ITournamentCreation extends Remote, IController  {
    public LinkedList<ISportDTO> loadSport(List<IDepartmentDTO> department) throws RemoteException;
    public LinkedList<ITeamDTO> loadTeams(String sport) throws RemoteException;
    public ITournamentDTO CreateTournament(String name, String location, String date, BigDecimal fee,
    String sportname, List<String> TeamNames) throws RemoteException;

    ILeague getLeagueWithName(String leaguename) throws RemoteException;
    
    LinkedList<ILeagueDTO> loadLeagues() throws RemoteException;

    LinkedList<ITeamDTO> loadTeamsBySportAndLeague(String sportname, String leaguename) throws RemoteException;

    LinkedList<ITeamDTO> loadTeamsWithLeague(String leaguename) throws RemoteException;
}
