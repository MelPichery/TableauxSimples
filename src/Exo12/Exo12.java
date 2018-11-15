/*
 * Tri à bulle
 */
package Exo12;

public class Exo12 {

	public static void main(String[] args) {
		
		//déclaration des variables
		int valeurTmp;
		boolean permute=true;
		int[] tab = {12,32,5,156,10,96,98,55,-8};
		
		/*
		 * Tant que permute est vrai alors permute prend faux et on parcourt le tableau
		 */
		while (permute==true) {
			
			permute = false;
			
			for (int i = 0; i < tab.length-1; i++) {
				
				/*
				 * si la valeur du tableau à l'index i est supérieur à la valeur du tableau à l'index i + 1
				 * alors valeurTmp prend la valeur du tableau à l'index i, la valeur du tableau à l'index i prend
				 * la valeur du tableau à l'index i + 1 et la valeur du tableau à l'index i + 1 prend la valeurTmp
				 * permute prend vrai
				 */
				if(tab[i]>tab[i+1]) {
					
					valeurTmp = tab[i];
					tab[i]=tab[i+1];
					tab[i+1]=valeurTmp;
					permute=true;
					
				}
				
			}
						
		}
		
		//Affichage du tableau
		for (int i = 0; i < tab.length; i++) {
			
			System.out.println(tab[i]);
			
		}
		
	}

}
