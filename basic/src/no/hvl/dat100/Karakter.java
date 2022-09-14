package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter {
	static void giveYourGrade() {
		boolean askAgain = true;
		while (askAgain) {
			String tallTxt = showInputDialog("Gi poengsum:");
			int value = parseInt(tallTxt);
			if (value >100 || value <0) {
				System.out.println("din verdi er ikke valid, prøv igjen");
			}
			else {
				askAgain = false;
				System.out.println(tallTxt);
				int venstrepoeng[] = new int[] {100,89,79,59,49,39};
				int høyrepoeng[]= new int[] {90,80,60,50,40,0};
				char karakter[]= {'A', 'B', 'C', 'D', 'E', 'F'};
		     
				for (int i= 0; i < 6; i++) {
					if (venstrepoeng[i] >= value && høyrepoeng[i] <= value ) {
						System.out.println("Din karakter er: " + karakter[i]);
					}
				}
			}
		}
	}	

	public static void main (String [] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("Resultat for : " + i);
			giveYourGrade();
		}
	}
}
