package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Cane extends Animale {

	public Cane(String name) {
		super(name);
		
	}

	@Override
	public void verso() {
		
		System.out.println("bau, bau");
		
	}

	@Override
	public void mangia() {
		
		System.out.println("crocchette");
		
	}

}
