package tests;

import java.awt.Color;

import cases_du_tapis.*;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/******** Tester si toutes les listes contients bien leurs numéros ************/
		int i = 0;
		// tester la liste des nombres impairs
		System.out.println("Liste Impair:");
		Impair li = new Impair(1/5, Color.blue);
		while ( i < li.getListe_impair().size()) {
			System.out.println(li.getListe_impair().get(i));
			 i++;
		}
		
		// tester la liste des nombres pairs
		i=0;
		System.out.println("Liste Pair:");
		Pair lp = new Pair(1/5, Color.blue);
		while ( i < lp.getListe_pair().size()) {
			System.out.println(lp.getListe_pair().get(i));
			 i++;
		}
		
		// tester la liste des nombres "manque"
		i=0;
		System.out.println("Liste Manque:");
		Manque lm = new Manque(1/5, Color.blue);
		while ( i < lm.getListe_manque().size()) {
			System.out.println(lm.getListe_manque().get(i));
			 i++;
		}
		
		// tester la liste des nombres "passe"
		i=0;
		System.out.println("Liste Passe:");
		Passe lpa = new Passe(1/5, Color.blue);
		while ( i < lpa.getListe_passe().size()) {
			System.out.println(lpa.getListe_passe().get(i));
			 i++;
		}
		
	}

}
