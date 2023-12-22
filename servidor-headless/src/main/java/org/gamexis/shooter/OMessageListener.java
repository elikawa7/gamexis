package org.gamexis.shooter;

import com.esotericsoftware.kryonet.Connection;
import org.gamexis.network.messages.LoginMessage;
import org.gamexis.network.messages.LogoutMessage;
import org.gamexis.network.messages.PositionMessage;
import org.gamexis.network.messages.ShootMessage;

public interface OMessageListener {

	/**
	 * This should be received with playerID and bullet direction
	 * 
	 * @param pp
	 */
	public void shootMessageReceived(ShootMessage pp);

	/**
	 * PlayerID, and location should be received.
	 */
	public void loginReceived(Connection con, LoginMessage m);

	/**
	 * PlayerID should be received.
	 */
	public void logoutReceived(LogoutMessage m);

	/**
	 * PlayerID and direction should be received.
	 * 
	 * @param move
	 */
	public void playerMovedReceived(PositionMessage move);

}
