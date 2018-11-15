/*
 * Ecrivez un algorithme permettant, toujours sur le m�me principe, � l�utilisateur de saisir un nombre
 * d�termin� de valeurs.
 * Le programme, une fois la saisie termin�e, renvoie la plus grande valeur en pr�cisant quelle position
 * elle occupe dans le tableau.
 * On prendra soin d�effectuer la saisie dans un premier temps, et la recherche de la plus grande valeur
 * du tableau dans un second temps.
 */
package Exo6;

import java.util.Scanner;

public class Exo6 {

	public static void main(String[] args) {
		
		//d�claration et initialisation des variables
		int taille,valmax=Integer.MIN_VALUE,position=0,nbre;
		
		/*
		 * Le syst�me demande � l'utilisateur d'entrer la taille du tableau
		 * et enregistre la taille dans la variable taille
		 */
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//d�claration du tableau
		int[] tab = new int[taille];
		
		/*
		 * pour chaque indice du tableau, l'utilisateur rentre une valeur
		 */
		for(int i=0;i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			nbre=sc2.nextInt();
			
			tab[i]=nbre;
			
			/*
			 * si valmax est inf�rieur � la valeur lue alors
			 * valmax prend la valeur lue et on sauvegarde la position 
			 */
			if(valmax<tab[i]) {
				
				valmax = tab[i];
				position = i+1;
				
			}
			
		}

		//affichage de la valeur max et de la position
		System.out.println("La + grande valeur : "+valmax+" en position : "+position);
		
	}

}
