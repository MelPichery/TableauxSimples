/*
 * Ecrire un algorithme qui déclare un tableau de 10 notes scolaires, dont on fait ensuite saisir les
 * valeurs par l’utilisateur.
 * La somme des nombres est affichée à l'utilisateur.
 * La moyenne des notes de ce tableau est aussi affichée à l'utilisateur
 */
package Exo4;

import java.util.Scanner;

public class Exo4 {

	public static void main(String[] args) {
		
		//déclaration des variables et initialisation
		int note=0, somme=0, moyenne=0;
		int notes[] = new int[10];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur rentre une valeur
		 */
		for(int i =0; i<10;i++) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			note=sc1.nextInt();
			
			notes[i] = note;
			
			//calcul de la somme des notes
			somme = somme + note;
		}
		
		//calcul de la moyenne
		moyenne = somme/10;
		
		//affichage de la somme et de la moyenne
		System.out.println("Somme : "+somme+" Moyenne : "+moyenne);
		
	}

}
