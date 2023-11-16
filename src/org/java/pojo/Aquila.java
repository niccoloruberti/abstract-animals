package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Aquila extends Animale {

	public Aquila(String name) {
		super(name);
		
	}

	@Override
	public void verso() {
		
		System.out.println("aaaah aaaah");
		
	}

	@Override
	public void mangia() {
		
		System.out.println("piccoli animali");
		
	}

}
