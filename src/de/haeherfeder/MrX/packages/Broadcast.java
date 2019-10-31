package de.haeherfeder.MrX.packages;

import java.io.Serializable;

/**
 * Object from the server to message all players or from Type.Spielleitung to the server to reply all.
 * 
 * @author haeherfeder
 *
 */
public final class Broadcast implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	String author;
	/**
	 * 
	 * @param message the message for the clients
	 * @param author nickname from the sender
	 */
	public Broadcast(String message,String author) {
		this.message = message;
		this.author = author;
	
	}
}
