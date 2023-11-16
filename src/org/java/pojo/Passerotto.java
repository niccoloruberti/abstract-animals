package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Passerotto extends Animale {

	public Passerotto(String name) {
		
		super(name);
		
	}

	@Override
	public void verso() {
		
		System.out.println("chip chip");
		
	}

	@Override
	public void mangia() {
		
		System.out.println("semi");
		
	}

}
