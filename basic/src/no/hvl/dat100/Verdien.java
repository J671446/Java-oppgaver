package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Verdien{
	public static void main (String [] args) {
		String tallTxt = showInputDialog("gi n - verdi");
		double verdiN = parseDouble(tallTxt);
		double result = 1;
		for (double i = 1; i <= verdiN; i++) {
			result = result * i;
		}
		result = result * (verdiN-1) * verdiN;
		System.out.println("Når verdien er: " + verdiN + " blir resultatet: " + result);
	
	}
}


