/*
 * Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
 * 1. Cet algorithme crée ce tableau et y insère les valeurs au fur et à mesure de la saisie. Le
 * tableau est affiché à l'utilisateur.
 * 2. Un deuxième tableau devra maintenant contenir les valeurs du premier tableau dans l'ordre
 * inverse que celui de la saisie. Ce nouveau tableau est affiché à l'utilisateur.
 */
package Exo2;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		
		//Déclaration et initialisation des variables
		int taille,nbre=0;		
		
		//le système inscrit la phrase et enregistre dans la variable taille la réponse		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//création des tableaux
		int tab[] = new int[taille];
		int tabinv[] = new int[taille];
		
		//pour chaque indice du tableau, l'utilisateur entre une valeur
		for(int i=0;i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			nbre=sc2.nextInt();
			
			tab[i] = nbre;
						
			tabinv[taille-1-i]=nbre;
						
		}
		
		//Affichage du tableau
		for(int i=0;i<taille;i++) {
			
			System.out.println(tab[i]);
			
		}
		//Affichage du tableau avec les valeurs inversées
		for(int i=0;i<taille;i++) {
			
			System.out.println(tabinv[i]);
			
		}
		
		

	}

}
