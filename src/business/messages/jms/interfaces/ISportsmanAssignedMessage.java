/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.messages.jms.interfaces;

import data.DTOs.ISportsmanDTO;
import data.DTOs.ITrainingTeamDTO;

/**
 *
 * @author uubu
 */
public interface ISportsmanAssignedMessage extends IMessage {
    
    ISportsmanDTO getSportsman();
    ITrainingTeamDTO getTeam();
}
