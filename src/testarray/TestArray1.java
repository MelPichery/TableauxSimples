/*
 * TP03 Tableau, boucles et condition, Exercice 1
 */
package testarray;

public class TestArray1 {

	public static void main(String[] args) {
		//déclaration et initialisation des variables
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayInverse= new int[array.length];	
		int tailleArraySuperieurA3=0;
		int tailleArrayPair=0;
		int compteurArraySuperieurA3=0,compteurArrayPair=0;
		int	min =Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		
		/*
		 * Pour chaque index du tableau array, on affiche la valeur puis le tableau array à l'index inverse d'array prend 
		 * la valeur du tableau array à l'index i
		 */
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+"  ");			
			
			arrayInverse[array.length-1-i] = array[i];
			
			//si la valeur du tableau à l'index i est supérieur à 3 alors la variable tailleArraySuperieurA3 est incrémenté de 1
			if (array[i]>3) {
				
				tailleArraySuperieurA3 = tailleArraySuperieurA3 + 1;
								
			}
			
			//si la valeur du tableau à l'index i est pair alors la variable tailleArrayPair est incrémenté de 1
			if (array[i]%2 == 0) {
				
				
				tailleArrayPair = tailleArrayPair + 1 ;
				
			}
			
			//si la valeur du tableau à l'index i est inférieur à min alors min prend la valeur du tableau à l'index i
			if (array[i]<min) {
				
				min = array[i];
			}
			
			//si la valeur du tableau à l'index i est supérieur à max alors max prend la valeur du tableau à l'index i
			if (array[i]>max) {
				
				max=array[i];
				
			}
		}
		
		//saut ligne + affichage pour plus de visibilité en sortie
		System.out.println();
		System.out.println("Affichage du tableau inverse :");
		
		for (int i = 0; i < arrayInverse.length; i++) {
			
			System.out.print(arrayInverse[i]+"  ");
			
		}
		
		//Création des tableaux
		int[] arraySuperieurA3 = new int[tailleArraySuperieurA3];
		int[] arrayPair = new int[tailleArrayPair];
		
		//Lecture du tableau array
		for (int i = 0; i < array.length; i++) {
						
			/*
			 * Si la valeur du tableau array est supérieur à 3 alors le tableau arraySuperieurA3 prend la valeur
			 * du tableau array à l'index i, le compteur pour l'index du tableau arraySuperieurA3 est incrémenté de 1
			 */
			if (array[i]>3) {
				
				arraySuperieurA3[compteurArraySuperieurA3]=array[i];
				compteurArraySuperieurA3=compteurArraySuperieurA3+1;
				
			}
			
			/*
			 * Si la valeur du tableau array est pair alors le tableau arrayPair prend la valeur
			 * du tableau array à l'index i, le compteur pour l'index du tableau arrayPair est incrémenté de 1
			 */
			if (array[i]%2 == 0) {
				
				arrayPair[compteurArrayPair] = array[i];
				compteurArrayPair=compteurArrayPair+1;
				
			}
		}
		
		//saut ligne + affichage pour plus de visibilité en sortie
		System.out.println();
		System.out.println("Affichage du tableau des chiffres supérieur à 3 :");
		
		//Affichage du tableau arraySuperieurA3
		for (int i = 0; i < arraySuperieurA3.length; i++) {
			
			System.out.print(arraySuperieurA3[i]+"  ");
			
		}
		
		//saut ligne + affichage pour plus de visibilité en sortie
		System.out.println();
		System.out.println("Affichage du tableau des chiffres pairs :");
		
		//Affichage du tableau arrayPair
		for (int i = 0; i < arrayPair.length; i++) {
			
			System.out.print(arrayPair[i]+"  ");
			
		}
		
		//saut ligne + affichage pour plus de visibilité en sortie
		System.out.println();
		System.out.println("Valeur max : "+max+"    Valeur min : "+min);
		
	}

}
