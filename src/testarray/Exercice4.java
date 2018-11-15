package testarray;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		
		//int taille = 0;
		int option = 0, valeur = 0;
		int[] tab = new int[0];
		boolean continuer = true;
		
		
		while (continuer) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("1 - Ajouter un nombre \n2 - Afficher les nombres existants \n3 - Quitter");
			option=sc1.nextInt();			
						
				if(option == 1) {
					
					
					int[] tabTemp = new int[tab.length+1];
					
					for (int i = 0; i < tabTemp.length-1; i++) {
						
						tabTemp[i] = tab[i]; 
								
					}
					
					
					tab = new int[tabTemp.length];
					
					for (int h = 0; h < tabTemp.length; h++) {
						
						tab[h] = tabTemp[h];
						
					}
					
					Scanner sc2 = new Scanner(System.in);
					System.out.println("Donnez une valeur");
					valeur=sc2.nextInt();
					
					tab[tab.length-1] = valeur;
					 
				}
				
				
				if (option == 2) {
					System.out.print("Valeurs du tableau : ");
					
					for (int j = 0; j < tab.length; j++) {
						
						System.out.print(tab[j]+"  ");
						
					}
					
					System.out.println();
				}								
				
				if(option == 3) {
					
					continuer = false;
					
				}
				
		}
		
	}
	
}
