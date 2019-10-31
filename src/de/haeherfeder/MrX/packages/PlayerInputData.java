package de.haeherfeder.MrX.packages;

import java.io.Serializable;
/**
 * Object send to the server to update the pos
 * 
 * contains contents 2 strings, Position, which is used, and name, which is not used yet
 * 
 * @author haeherfeder
 *
 */
public class PlayerInputData implements Serializable{
	private static final long serialVersionUID = 3L;
	public String Position; //ggf. auch anderes Format, kannst mir bescheid sagen.
	public String Player;
}