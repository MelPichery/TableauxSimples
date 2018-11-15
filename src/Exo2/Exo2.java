/*
 * Ecrire un algorithme qui demande � l'utilisateur la grandeur du tableau et ses valeurs.
 * 1. Cet algorithme cr�e ce tableau et y ins�re les valeurs au fur et � mesure de la saisie. Le
 * tableau est affich� � l'utilisateur.
 * 2. Un deuxi�me tableau devra maintenant contenir les valeurs du premier tableau dans l'ordre
 * inverse que celui de la saisie. Ce nouveau tableau est affich� � l'utilisateur.
 */
package Exo2;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		
		//D�claration et initialisation des variables
		int taille,nbre=0;		
		
		//le syst�me inscrit la phrase et enregistre dans la variable taille la r�ponse		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//cr�ation des tableaux
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
		//Affichage du tableau avec les valeurs invers�es
		for(int i=0;i<taille;i++) {
			
			System.out.println(tabinv[i]);
			
		}
		
		

	}

}
