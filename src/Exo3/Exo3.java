/*
 * Ecrire un algorithme qui demande � l'utilisateur la grandeur du tableau et ses valeurs.
 * Cet algorithme cr�e ce tableau et y ins�re les valeurs au fur et � mesure de la saisie.
 * Il indique ensuite � l'utilisateur :
 * 1. Si le tableau est tri� par ordre croissant ou non
 * 2. La plus petite valeur du tableau
 * 3. La plus grande valeur du tableau
 */
package Exo3;
import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		//d�claration des variables
		int nbr,taille,min,max,courant;
		boolean croissant;
		
		//Enregistrement de la taille du tableau donn�e par l'utilisateur
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//Initialisation des variables
		int tab[] = new int[taille];
		croissant=true;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		courant=Integer.MIN_VALUE;
		
		//Pour chaque indice du tableau, on enregistre la valeur donn�e par l'utilisateur
		for(int i=0;i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			nbr=sc2.nextInt();
			
			tab[i]=nbr;
			
		}
		
		//boucle pour lire le tableau
		for(int i=0;i<taille;i++) {
			
			/*si la valeur lue est sup�rieure ou �gale � max alors on enregistre la valeur
			du tableau dans max*/
			if(tab[i]>=max) {
				max = tab[i];
			}
			
			/*si la valeur lue est inf�rieure � min alors on enregistre la valeur
			du tableau dans min*/
			if(tab[i]<min) {
				min=tab[i];
			}
			
			/*
			 * Si la valeur lue est inf�rieur � la valeur de la variable courant alors
			 * croissant prend false
			 */
			if(tab[i]<courant) {
				croissant=false;
			}
			
			courant=tab[i];
			
		}
		//Affichage du max, min et croissant
		System.out.println("max : "+max+" min : "+min+" croissant : "+croissant);

	}

}
