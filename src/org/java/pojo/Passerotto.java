package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante {

	public Passerotto(String name) {
		
		super(name);
		
	}
	
	@Override
	public void vola() {
		
		System.out.println("sono " + getName() + " e Sto volando!!!");
		
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
