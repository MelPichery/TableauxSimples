/*
 * Ecrire un algorithme qui déclare un tableau de 10 éléments, le remplir du chiffre 0 au chiffre 9 et
 * affiche ensuite à l'utilisateur toutes les valeurs de ce tableau.

 */
package Exo1;


public class Exo1 {

	public static void main(String[] args) {
	
		//déclaration du tableau
		int tab[] = new int[10];

		for(int i=0; i<10;i++){
			//assignation de la valeur de l'indice du tableau dans chaque case du tableau
			tab[i]=i;
			
			System.out.println(tab[i]);
			
		}
		
	}

}
