/*
 * Ecrivez un algorithme qui permet la saisie d�un nombre quelconque de valeurs.
 * Toutes les valeurs doivent ensuite �tre augment�es de 1, et le tableau sera affich� � l��cran
 */
package Exo8;

import java.util.Scanner;

public class Exo8 {

	public static void main(String[] args) {
		
		//d�claration et initialisation des variables
		int taille, nbre=0;
		
		//Le syst�me demande � l'utilisateur et enregistre la taille du tableau
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//d�claration du tableau
		int tab[] = new int[taille];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur donne une valeur
		 * cette valeur est enregistr�e dans le tableau
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
