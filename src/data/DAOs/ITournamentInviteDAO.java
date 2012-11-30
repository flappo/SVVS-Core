/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.DAOs;

import data.DTOs.ITournamentInviteDTO;
import data.models.ISportsman;
import data.models.ITournament;
import data.models.ITournamentInvite;
import data.models.ITrainingTeam;
import java.rmi.RemoteException;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author uubu
 */
public interface ITournamentInviteDAO extends IDAOs<ITournamentInvite, ITournamentInviteDTO>{

    List<ITournamentInvite> getBySportsman(Session s, ISportsman sportsman) throws RemoteException;

    List<ITournamentInvite> getByTournament(Session s, ITournament tournament) throws RemoteException;

    List<ITournamentInvite> getByTournamentAndTeam(Session s, ITournament tournament, ITrainingTeam team) throws RemoteException;

    List<ITournamentInvite> getTeamsOfTournament(Session s, ITournament tournament) throws RemoteException;

    List<ITournamentInvite> getAllTeams(Session s) throws RemoteException;

    List<ITournamentInviteDTO> getAllTeamDTOs(Session s) throws RemoteException;

    List<ITournamentInviteDTO> getTeamsOfTournamentDTOs(Session s, ITournament tournament) throws RemoteException;

    ITournamentInvite getByAll(Session s, ITournament tournament, ITrainingTeam team, ISportsman sportsman) throws RemoteException;
    
}
