/*
 * Ecrire un algorithme qui demande à l'utilisateur la grandeur du tableau et ses valeurs.
 * Cet algorithme crée ce tableau et y insère les valeurs au fur et à mesure de la saisie.
 * Il indique ensuite à l'utilisateur :
 * 1. Si le tableau est trié par ordre croissant ou non
 * 2. La plus petite valeur du tableau
 * 3. La plus grande valeur du tableau
 */
package Exo3;
import java.util.Scanner;

public class Exo3 {

	public static void main(String[] args) {
		//déclaration des variables
		int nbr,taille,min,max,courant;
		boolean croissant;
		
		//Enregistrement de la taille du tableau donnée par l'utilisateur
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//Initialisation des variables
		int tab[] = new int[taille];
		croissant=true;
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		courant=Integer.MIN_VALUE;
		
		//Pour chaque indice du tableau, on enregistre la valeur donnée par l'utilisateur
		for(int i=0;i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			nbr=sc2.nextInt();
			
			tab[i]=nbr;
			
		}
		
		//boucle pour lire le tableau
		for(int i=0;i<taille;i++) {
			
			/*si la valeur lue est supérieure ou égale à max alors on enregistre la valeur
			du tableau dans max*/
			if(tab[i]>=max) {
				max = tab[i];
			}
			
			/*si la valeur lue est inférieure à min alors on enregistre la valeur
			du tableau dans min*/
			if(tab[i]<min) {
				min=tab[i];
			}
			
			/*
			 * Si la valeur lue est inférieur à la valeur de la variable courant alors
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
