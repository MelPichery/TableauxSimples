/*
 * Ecrivez un algorithme permettant � l�utilisateur de saisir un nombre quelconque de valeurs, qui
 * devront �tre stock�es dans un tableau.
 * L�utilisateur doit donc commencer par entrer le nombre de valeurs qu�il compte saisir. Il effectuera
 * ensuite cette saisie.
 * Enfin, une fois la saisie termin�e, le programme affichera le nombre de valeurs multiples de 3 et le
 * nombre de valeurs non multiple de 3.
 */
package Exo5;

import java.util.Scanner;

public class Exo5 {

	public static void main(String[] args) {
	
		//d�claration et initialisation des variables
		int taille=0, nbre,divisible=0;
		
		//le syst�me demande la taille du tableau et enregistre la taille donnez par l'utilisateur
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez la taille du tableau");
		taille=sc1.nextInt();
		
		//d�claration du tableau
		int[] tab = new int[taille];
			
		//pour chaque indice du tableau, l'utilisateur entre une valeur
		for(int i =0; i<taille;i++) {
			
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Entrez une valeur");
			nbre=sc2.nextInt();
			
			tab[i] = nbre;
			
			/*
			 * si le nombre est un multiple alors on incr�mente la variable
			 * divisible de 1
			 */
			if((nbre % 3)==0) {
				divisible = divisible + 1;
			}
			     
		}
		
		//affichage du nombre de divisible et de non divisible
		System.out.println("Nombre de valeurs divisible par 3 : "+divisible);
		System.out.println("Nombre de valeurs non divisible par 3 : "+(taille-divisible));
		
	}

}
