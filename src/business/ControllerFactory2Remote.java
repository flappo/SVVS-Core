/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.controller.team.ITeamController;
import business.controller.team.playerToTeam.IPlayerToTeam;
import business.controller.team.teamTOplayer.ITeamToPlayer;
import business.controller.touramentTeam.ITournamentTeamController;
import business.controller.tournament.Create.ITournamentCreation;
import business.controller.tournament.ITournamentController;
import business.controller.tournament.edit.ITournamentEdit;
import java.rmi.RemoteException;
import javax.ejb.Remote;

/**
 *
 * @author phil
 */
@Remote
public interface ControllerFactory2Remote {
    public String isOk() throws RemoteException;
    public ITeamController getTeamController() throws RemoteException;
    public ITeamToPlayer getTeamToPlayer() throws RemoteException;
    public IPlayerToTeam getPlayerToTeam() throws RemoteException;
    public ITournamentTeamController getTournamentTeamController() throws RemoteException;

}
