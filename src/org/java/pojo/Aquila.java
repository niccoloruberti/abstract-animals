package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante {

	public Aquila(String name) {
		super(name);
		
	}
	
	@Override
	public void vola() {
		
		System.out.println("sono " + getName() + " e Sto volando!!!");
		
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
