/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controller.JMS;

import business.IController;
import business.messages.jms.interfaces.IMessage;
import data.DTOs.ISportsmanDTO;
import data.DTOs.ITournamentInviteDTO;
import data.DTOs.ITrainingTeamDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import javax.ejb.EJBObject;

/**
 *
 * @author Evgeniya Spiegel
 */
public interface IMessageController extends EJBObject, Remote, IController {

    List<IMessage> LoadMessages(String username) throws RemoteException, Exception;

    boolean createInviteMessage(ITournamentInviteDTO tinvite) throws RemoteException;

    void createQueue(String username) throws RemoteException, Exception;

    boolean createSportsmanAssignedMessage(List<String> usernames, ISportsmanDTO sportsman, ITrainingTeamDTO team) throws RemoteException;

    boolean createSportsmanCreatedMessage(List<String> usernames, ISportsmanDTO sportsman) throws RemoteException;
    
}
