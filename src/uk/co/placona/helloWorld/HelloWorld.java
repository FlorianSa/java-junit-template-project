package uk.co.placona.helloWorld;
import java.util.Locale;
	import java.util.Scanner;
public class HelloWorld {

	

		public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
		double darlehen, zinssatz, annuitaet,laufzeit;
		
		//Eingeben & Ausgeben
		System.out.println("Geben Sie den Darlehensbetrag ein!");
		darlehen = in.nextDouble();
		System.out.println("Geben Sie den Zinssatz (in %) ein!");
		zinssatz = in.nextDouble();
		zinssatz = zinssatz/100;
		System.out.println("Laufzeit eingeben!");
		laufzeit = in.nextDouble();
		
		//Rechnen
		annuitaet=berechneannuitaet(darlehen, zinssatz, laufzeit);
		
		//Ausgabe
		System.out.println(annuitaet);
		

		}
		//Rechner
		public static double berechneannuitaet(double darlehen, double zinssatz, double laufzeit) {
			
		
		double annuitaet;
		annuitaet = darlehen* ((Math.pow(1+zinssatz,laufzeit)*zinssatz)/(Math.pow(1+zinssatz,laufzeit)-1));
		return annuitaet;
		}
	}
