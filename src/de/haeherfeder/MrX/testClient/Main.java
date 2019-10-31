package de.haeherfeder.MrX.testClient;

import de.haeherfeder.MrX.packages.AddPlayerObject;

public class Main {

	public static void main(String[] args) {
		System.out.println("Startet");
		Client client = new Client("mc.haeherfeder.de", 4210);
		System.out.println("to connect");
		client.connect();
		System.out.println("connectet");
		client.sendObject(new AddPlayerObject("0480c7769e66c0a2fadd0b4db4faf23f","MrX1","pos"));
		System.out.println("objected send");
		
	}

}
