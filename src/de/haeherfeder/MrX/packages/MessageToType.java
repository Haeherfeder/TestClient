package de.haeherfeder.MrX.packages;

import java.io.Serializable;

/**
 * send a message to all persons in the group (Type)
 * 
 * @author haeherfeder
 *
 */
public final class MessageToType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String author;
	final String message;
	/**
	 * the constructor which set the Strings, because they are final.
	 * 
	 * @param message message send to the client
	 * @param author nickname of the sender
	 */
	public MessageToType(String message,String author){
		this.message = message;
		this.author = author;
	}
}
