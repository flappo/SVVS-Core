/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data.models;

import java.util.List;

/**
 *
 * @author uubu
 */
public interface ISportsman extends IRole{

    List<ISportsmanTrainingTeam> getTeams();

    void setTeams(List<ISportsmanTrainingTeam> teams);

    List<ITournamentInvite> getInvites();

    void setInvites(List<ITournamentInvite> invites);

    void addInvite(ITournamentInvite invite);

    void removeInvite(ITournamentInvite invite);
    
}
