/*
 * Ecrivez un algorithme constituant un tableau, à partir de deux tableaux de même longueur
 * préalablement saisis. Le nouveau tableau sera la somme des éléments des deux tableaux de départ.
 */
package Exo9;

import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		
		//déclaration et initialisation des variables
		int taille, nbre=0;
		
		//Le système demande à l'utilisateur et enregistre la taille du tableau
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//déclaration des tableaux
		int[] tab1 = new int[taille];
		int[] tab2 = new int[taille];
		int[] tabsom = new int[taille];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistrée dans le tableau 1
		 */
		for (int i = 0; i < taille; i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur tab1");
			nbre=sc2.nextInt();
			
			tab1[i] = nbre;
			
		}
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistrée dans le tableau 2
		 */
		for (int i = 0; i < taille; i++) {
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Entrez une valeur tab2");
			nbre=sc3.nextInt();
			
			tab2[i] = nbre;
			
		}
		
		/*
		 * pour chaque indice du tableau, le tableau tabsom prend la valeur de l'addition
		 * des valeurs du tableau 1 et du tableau 2
		 */
		for (int i = 0; i < taille; i++) {
			
			tabsom[i] = tab1[i] + tab2[i];
			
			//affichage des valeurs du tableau tabsom
			System.out.println(tabsom[i]);
			
		}
		
	}

}
