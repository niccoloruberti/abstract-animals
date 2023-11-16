package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;

public class Cane extends Animale implements INuotante {

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

	@Override
	public void nuota() {
		
		System.out.println("sono " + getName() + " e Sto nuotando!!!");
		
	}

}
