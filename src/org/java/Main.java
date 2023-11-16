package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;
import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;
import org.java.pojo.inter.IVolante;

public class Main {

	public static void main(String[] args) {
		
		int animalCounter = 4;
		
		Animale[] animali = new Animale[animalCounter];
		
		Cane c1 = new Cane("Balto");
		
		animali[0] = c1;
		
		Passerotto p1 = new Passerotto("Titti");
		
		animali[1] = p1;
		
		Aquila a1 = new Aquila("Maverick");
		
		animali[2] = a1;
		
		Delfino d1 = new Delfino("Willy");
		
		animali[3] = d1;

		
	
		for ( int x = 0; x < animalCounter; x++) {
			
			Animale a = animali[x];
			
			 System.out.println("Tipo: " + a.getClass().getSimpleName());
			 System.out.println(a.toString());
			 System.out.print("verso: "); a.verso();
			 System.out.print("mangia: "); a.mangia();
			 System.out.print("quando va a letto: "); a.dormi();
			 System.out.println("\n");
			 System.out.println("----------");

		}
		
		IVolante[] volanti = new IVolante[2];
		
		volanti[0] = p1;
		
		volanti[1] = a1;
		
		for ( int x = 0; x < volanti.length; x++) {
			
			IVolante vol = volanti[x];
			
			faiVolare(vol);
			
		}
		
		INuotante[] nuotanti = new INuotante[2];
		
		nuotanti[0] = c1;
		
		nuotanti[1] = d1;
		
		for ( int x = 0; x < nuotanti.length; x++) {
			
			INuotante nuot = nuotanti[x];
			
			faiNuotare(nuot);
		}
		
	}
	
	public static void faiVolare(IVolante volante) {
		
		volante.vola();
	}
	
	public static void faiNuotare(INuotante nuotante) {
		nuotante.nuota();
	}

}
