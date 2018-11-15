/*
 * Toujours et encore sur le même principe, écrivez un algorithme permettant, à l’utilisateur de saisir
 * les notes d'une classe.
 * Le programme, une fois la saisie terminée, renvoie le nombre des notes supérieures à la moyenne de
 * la classe
 */
package Exo7;

import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		
		//déclaration et initialisation des variables
		int taille,note=0, somme=0, moyenne=0,notesup=0,total=0;
		
		//Le système demande à l'utilisateur et enregistre la taille du tableau
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//déclaration du tableau
		int notes[] = new int[taille];
		
		//pour chaque indice du tableau, l'utilisateur donne une valeur
		for(int i =0; i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			note=sc2.nextInt();
			
			notes[i] = note;
			
			//Calcul du total en ajoutant à chaque fois la note
			total = total + notes[i];
			
		}
		
		//calcul de la moyenne
		moyenne=total/taille;
		
		/*
		 * pour chaque indice du tableau, on vérifie si la note est supérieure à la moyenne
		 * et on incrémente de 1 notesup lorsque c'est le cas
		 */
		for (int i = 0; i < taille; i++) {
			
			if(notes[i]>moyenne) {
				
				notesup = notesup +1;
				
			}
			
		}
		
		//affichage de notesup
		System.out.println("Nbre de notes supérieures à la moyenne : "+notesup);
		
	}

}
