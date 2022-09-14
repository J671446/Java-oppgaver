package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class EnterNumbers {
	static void enterNumbers() {
		String tallTxt = showInputDialog("Gi et tall");
		System.out.println(tallTxt);
				
		int tall = parseInt(tallTxt);
	}		
	public static void main (String [] args) {
		for (int i= 0; i < 5; i++) {
			enterNumbers();
		}
	}
}
