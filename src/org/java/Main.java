package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;
import org.java.pojo.abs.Animale;

public class Main {

	public static void main(String[] args) {
		
		int animalCounter = 4;
		
		Animale[] animali = new Animale[animalCounter];
		
		animali[0] = new Cane("Balto");
		
		animali[1] = new Passerotto("Titti");
		
		animali[2] = new Aquila("Maverick");
		
		animali[3] = new Delfino("Willy");
		
		for ( int x = 0; x < animalCounter; x++) {
			
			Animale a = animali[x];
			
			 System.out.println("Tipo: " + a.getClass().getSimpleName());
			 System.out.println(a.toString());
			 System.out.print("verso: "); a.verso();
			 System.out.print("mangia: "); a.mangia();
			 System.out.print("quando va a letto: "); a.dormi();
			 System.out.println("----------");

		}
		
	}

}
