package Tag05_ks1;

import java.util.Scanner;

public class Afg1_Umsatz {

	public static void main(String[] args) {
		// EINGABE
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte Ihren Umsatz in EUR eingeben: ");
		double Umsatz = input.nextDouble();
		
		// VERARBEITUNG
		double Rabattsatz;
		if (Umsatz<=1000) {
			Rabattsatz = 1.0;
		} else if (Umsatz <=2500) {
			Rabattsatz = 3.0;
		} else if (Umsatz<=5000) {
			Rabattsatz = 5.0;
		} else if (Umsatz<=10000) {
			Rabattsatz = 7.0;
		} else {
			Rabattsatz = 10.0;
		}
		double Rabatt = Umsatz*Rabattsatz/100;
		double Zahlbetrag = Umsatz-Rabatt;

		// AUSGABE
		System.out.println("Für den Umsatz "+Umsatz+" EUR erhalten Sie "+Rabattsatz+" % Rabatt !");
		System.out.println("Der Rabatt beträgt "+Rabatt+" !");
		System.out.println("Sie zahlen nur "+Zahlbetrag+" EUR !");
		input.close();
	}

}