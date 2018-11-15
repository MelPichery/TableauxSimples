/*
 * Toujours à partir de deux tableaux précédemment saisis, écrivez un algorithme qui calcule le « JOKE »
 * des deux tableaux. Pour calculer le « JOKE », il faut multiplier chaque élément du tableau 1 par
 * chaque élément du tableau 2, et additionner le tout.
 */
package Exo10;

import java.util.Scanner;

public class Exo10 {

	public static void main(String[] args) {
		
		//déclaration et initialisation des variables
		int taille1, taille2, somme=0;
		
		//Le système demande à l'utilisateur et enregistre la taille du tableau 1
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau 1");
		taille1=sc1.nextInt();
		
		//déclaration du tableau 1
		int[] tab1 = new int[taille1];
		
		//Le système demande à l'utilisateur et enregistre la taille du tableau 2
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau 2");
		taille2=sc2.nextInt();
		
		//déclaration du tableau 2
		int[] tab2 = new int[taille2];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistrée dans le tableau 1
		 */
		for (int i = 0; i <taille1; i++) {
			
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Entrez une valeur tab1");
			tab1[i]=sc3.nextInt();						
			
		}		
	
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistrée dans le tableau 2
		 */
		for (int i = 0; i <taille2; i++) {
			
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Entrez une valeur tab2");
			tab2[i]=sc4.nextInt();
			
			
		}
		
		/*
		 * pour chaque indice du tableau 1, on multiplie la valeur du tableau 1
		 * par la valeur du tableau 2 et on l'ajoute à la somme
		 */
		for (int i = 0; i < taille2; i++) {
			for (int j = 0; j < taille1; j++) {
				
				somme = somme + (tab1[j] * tab2[i]);
				
			}
			
		}
		
		//affichage de la somme
		System.out.println("Somme JOKE : "+somme);
		
	}

}
