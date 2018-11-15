/*
 * Tri par sélection
 */
package Exo11;



public class Exo11 {

	public static void main(String[] args) {
		
		//déclaration des variables
		int min,indiceMin,valeurTmp;
		
		//déclaration du tableau
		int[] tab = {12,32,5,156,10,96,98,55,-8};		
		
		/*
		 * Pour chaque indice du tableau-1, min prend la valeur du tableau, indiceMin l'indice et
		 * la valeurTmp la valeur min
		 */
		for (int i = 0; i < tab.length-1; i++) {
			
			min = tab[i];
			indiceMin = i;
			valeurTmp = min;
			
			/*
			 * Pour chaque indice du tableau, on vérifie si la valeur du tableau et inférieur à min
			 * si c'est le cas min prend la valeur du tableau et l'indiceMin prend l'indice 
			 */
			for (int j = i+1; j < tab.length; j++) {
				
				if (tab[j]<min) {
					
					min = tab[j];
					indiceMin=j;
					
				} 
				
			}
			
			/*
			 * l'indice du tableau prend la valeur min et l'indice du tableau correspondant 
			 * à l'indice min prend la valeur de valeurTmp
			 */
			tab[i] = min;
			tab[indiceMin]=valeurTmp;
				
		}
		
		//Pour chaque indice du tableau, affichage de la valeur
		for (int i = 0; i < tab.length; i++) {
			
			System.out.println(tab[i]);
			
		}
		
	}
	
	

}
