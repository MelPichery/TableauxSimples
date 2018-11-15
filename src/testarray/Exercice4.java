//TP03 TABLEAUX, BOUCLES ET CONDITIONS
package testarray;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		
		//d�claration et initialisation des variables
		int option = 0, valeur = 0;
		int[] tab = new int[0];
		boolean continuer = true;
		
		//Tant que continuer est � vrai alors le menu est affich�
		while (continuer) {
			
			//Affichage du menu et sauvegarde de l'option donn�e par l'utilisateur
			Scanner sc1 = new Scanner(System.in);
			System.out.println("1 - Ajouter un nombre \n2 - Afficher les nombres existants \n3 - Quitter");
			option=sc1.nextInt();			
				
				//Si option est �gal � 1 alors le tableau tabTemp est cr�� avec une taille incr�ment�e de 1
				if(option == 1) {
					
					
					int[] tabTemp = new int[tab.length+1];
					
					//Pour chaque index du tableau tabTemp alors la valeur du tableau tabTemp � l'index i prend la valeur du tableau tab � l'index i
					for (int i = 0; i < tabTemp.length-1; i++) {
						
						tabTemp[i] = tab[i]; 
								
					}
					
					//le tableau tab est redimensionn� � la m�me taille que tabTemp
					tab = new int[tabTemp.length];
					
					//Pour chaque index du tableau tabTemp alors la valeur du tableau tab � l'index i prend la valeur du tableau tabTemp � l'index i
					for (int h = 0; h < tabTemp.length; h++) {
						
						tab[h] = tabTemp[h];
						
					}
					
					//Affichage de la consigne et sauvegarde de la valeur donn�e par l'utilisateur
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Donnez une valeur");
					valeur=sc2.nextInt();
					
					//la valeur du tableau tab au dernier index existant prend la valeur enregitr�e
					tab[tab.length-1] = valeur;
					 
				}
				
				//Si option est �gal � 2 alors on affiche le tableau tab
				if (option == 2) {
					System.out.print("Valeurs du tableau : ");
					
					for (int j = 0; j < tab.length; j++) {
						
						System.out.print(tab[j]+"  ");
						
					}
					
					System.out.println();
				}								
				
				//Si option est �gal � 3 alors continuer prend faux et on sort de la boucle while
				if(option == 3) {
					
					continuer = false;
					
				}
				
		}
		
	}
	
}
