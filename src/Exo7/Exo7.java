/*
 * Toujours et encore sur le m�me principe, �crivez un algorithme permettant, � l�utilisateur de saisir
 * les notes d'une classe.
 * Le programme, une fois la saisie termin�e, renvoie le nombre des notes sup�rieures � la moyenne de
 * la classe
 */
package Exo7;

import java.util.Scanner;

public class Exo7 {

	public static void main(String[] args) {
		
		//d�claration et initialisation des variables
		int taille,note=0, somme=0, moyenne=0,notesup=0,total=0;
		
		//Le syst�me demande � l'utilisateur et enregistre la taille du tableau
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//d�claration du tableau
		int notes[] = new int[taille];
		
		//pour chaque indice du tableau, l'utilisateur donne une valeur
		for(int i =0; i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			note=sc2.nextInt();
			
			notes[i] = note;
			
			//Calcul du total en ajoutant � chaque fois la note
			total = total + notes[i];
			
		}
		
		//calcul de la moyenne
		moyenne=total/taille;
		
		/*
		 * pour chaque indice du tableau, on v�rifie si la note est sup�rieure � la moyenne
		 * et on incr�mente de 1 notesup lorsque c'est le cas
		 */
		for (int i = 0; i < taille; i++) {
			
			if(notes[i]>moyenne) {
				
				notesup = notesup +1;
				
			}
			
		}
		
		//affichage de notesup
		System.out.println("Nbre de notes sup�rieures � la moyenne : "+notesup);
		
	}

}
