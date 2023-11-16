package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;

public class Delfino extends Animale implements INuotante {

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

	@Override
	public void nuota() {
		
		System.out.println("sono " + getName() + " e Sto nuotando!!!");
		
	}

}
