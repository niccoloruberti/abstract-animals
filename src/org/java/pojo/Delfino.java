package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Delfino extends Animale {

	public Delfino(String name) {
		super(name);
		
	}

	@Override
	public void verso() {
		
		System.out.println("click click");
		
	}

	@Override
	public void mangia() {
		
		System.out.println("pesci");
		
	}

}
