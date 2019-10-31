package de.haeherfeder.MrX.testClient;

import de.haeherfeder.MrX.packages.*;

public class Listener {
	public void received(Object data) {
		System.out.println(data+" : "+data.getClass());
		if(data instanceof SendPosition) {
			SendPosition s = (SendPosition) data;
			if(s!=null) {
				if(s.mrXPos!=null) {
					for(String key : s.mrXPos.keySet()) {
						System.out.println(key+" : "+s.mrXPos.get(key));
					}
				}else {
					System.out.println("MrX==null");
				}
				if(s.scotPos!=null) {
					for(String key : s.scotPos.keySet()) {
						System.out.println(key+" : "+s.scotPos.get(key));
					}
				}else {
					System.out.println("Scotpos==null");
				}
			}
		}
		if(data instanceof NoPosResivied) {
			System.out.println("\bAchtung");
		}
		if(data instanceof ServerClose) {
			
		}
	}
}
