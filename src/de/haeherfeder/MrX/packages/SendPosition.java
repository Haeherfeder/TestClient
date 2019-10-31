package de.haeherfeder.MrX.packages;

import java.io.Serializable;
import java.util.HashMap;

/**
 * not used yet
 * 
 * Object to send the positions from the scot and mrX in arrays
 * 
 * @author haeherfeder
 *
 */
public class SendPosition implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HashMap<String, String> scotPos = new HashMap<String, String>(20);
	public HashMap<String, String> mrXPos = new HashMap<String, String>(20);
}
