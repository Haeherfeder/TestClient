package de.haeherfeder.MrX.packages;

//package com.arcxesgames.packets;

import java.io.Serializable;
/**
 * Object for log in a player.
 * 
 * @author Haeherfeder/arcxes
 *
 */
public class AddPlayerObject implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 
	 * @param hashedPasswd the md5 hash of the passwd, later probably the md5 of the passwd with a hash;
	 */
	public AddPlayerObject(String hashedPasswd) {
		this.hashedPasswd = hashedPasswd;
	}
	/**
	 * 
	 * @param hashedPasswd the hashed pw from the Client
	 * @param name the nickname/accountname
	 */
	public AddPlayerObject(String hashedPasswd,String name) {
		this.hashedPasswd  = hashedPasswd;
		this.name = name;
	}
	/**
	 * 
	 * @param hashedPasswd the hashed passwd from the acc, see above
	 * @param name nickname from the player
	 * @param pos position for the start
	 */
	public AddPlayerObject(String hashedPasswd,String name,String pos) {
		this.hashedPasswd  = hashedPasswd;
		this.name = name;
		this.pos = pos;
	}
	/**
//	 * @value String name 
//	 * @value String hashedPasswd
//	 * @value String pos 
 	 */
	public String name;
	public final String hashedPasswd;
	public String pos;

}