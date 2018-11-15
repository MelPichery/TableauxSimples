/*
 * Ecrivez un algorithme qui permet la saisie d’un nombre quelconque de valeurs.
 * Toutes les valeurs doivent ensuite être augmentées de 1, et le tableau sera affiché à l’écran
 */
package Exo8;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		
		//déclaration et initialisation des variables
		int taille, nbre=0;
		
		//Le système demande à l'utilisateur et enregistre la taille du tableau
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//déclaration du tableau
		int tab[] = new int[taille];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistrée dans le tableau
		 */
		for (int i = 0; i < taille; i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			nbre=sc2.nextInt();
			
			nbre = nbre + 1 ;
			
			tab[i] = nbre;
			
		}
		
		//pour chaque indice du tableau,on affiche la valeur
		for (int i = 0; i < taille; i++) {
			
			System.out.println(tab[i]);
			
		}
		
	}

}
