/*
 * Ecrivez un algorithme constituant un tableau, � partir de deux tableaux de m�me longueur
 * pr�alablement saisis. Le nouveau tableau sera la somme des �l�ments des deux tableaux de d�part.
 */
package Exo9;

import java.util.Scanner;

public class Exo9 {

	public static void main(String[] args) {
		
		//d�claration et initialisation des variables
		int taille, nbre=0;
		
		//Le syst�me demande � l'utilisateur et enregistre la taille du tableau
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//d�claration des tableaux
		int[] tab1 = new int[taille];
		int[] tab2 = new int[taille];
		int[] tabsom = new int[taille];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistr�e dans le tableau 1
		 */
		for (int i = 0; i < taille; i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur tab1");
			nbre=sc2.nextInt();
			
			tab1[i] = nbre;
			
		}
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistr�e dans le tableau 2
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
