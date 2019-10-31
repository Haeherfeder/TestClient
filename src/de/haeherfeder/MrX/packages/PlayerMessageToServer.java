package de.haeherfeder.MrX.packages;

import java.io.Serializable;

/**
 * The Object to trigger a message to all players of the same Type or all(Type.Spielleitung)
 * 
 * @author Haeherfeder
 *
 */
public class PlayerMessageToServer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param message The message that should be send to the other Players of the team
	 */
	public PlayerMessageToServer(String message){
		this.message = message;
	}
	public String message;
}
