package Banque;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bienvenue à la GBA (Graven Banque et Assurance) que souhaitez-vous faire ?");

		int compteCourant = 9600;
		int decouvertAutorise = 120;

		Scanner scan = new Scanner(System.in);
		System.out.println("Tapez 1 pour afficher le solde du compte");
		System.out.println("Tapez 2 pour déposer de l’argent vers le compte");
		System.out.println("Tapez 3 pour retirer de l’argent depuis le compte");
		
		int choice = scan.nextInt();
		
		switch (choice) {
			case 1: showAccountBalance(compteCourant);;
					break;
			case 2: System.out.println("Combien d'argent voulez-vous déposer?");
					int moneyToAdd = scan.nextInt();
					addMoney(compteCourant, moneyToAdd);
					break;
			case 3: System.out.println("Combien d'argent voulez-vous retirer?");
					int moneyToWithdraw = scan.nextInt();
					withdrawMoney(compteCourant, decouvertAutorise, moneyToWithdraw);
					break;
			
		}
		
		scan.close();
	}

	public static void showAccountBalance(int compteCourant) {
		System.out.println("Le solde de votre compte est de " + compteCourant + " €.");
	}

	public static int addMoney(int compteCourant, int moneyToAdd) {
		System.out.println("Votre nouveau solde est de "+ (compteCourant + moneyToAdd) +" €.");
		return compteCourant + moneyToAdd;
	}

	public static int withdrawMoney(int compteCourant, int decouvertAutorise, int moneyToWithdraw) {
		if (moneyToWithdraw > (compteCourant + decouvertAutorise)) {
			System.out.println("Vous n'avez pas assez d'argent pour effectuer cette opération.");
			return compteCourant;
		} else { System.out.println("Votre nouveau solde est de "+ (compteCourant-moneyToWithdraw) +" €.");
			 return compteCourant - moneyToWithdraw;
			 
		} 

	}

}
