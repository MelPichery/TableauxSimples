package testarray;

public class TestArray2 {

	public static void main(String[] args) {
		
		//d�claration et initialisation des variables
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int moyenne = 0, total = 0, indexDe15=0, compteurDoublon = 0;
		
		//lecture du tableau array
		for (int i = 0; i < array.length; i++) {
			
			//total prend la valeur de total + valeur du tableau array � l'index i
			total = total + array[i];
			
			//si la valeur du tableau array � l'index i est �gal � 15 alors indexDe15 prend i
			if (array[i] == 15) {
				
				indexDe15 = i;
				
			}
			
			//lecture du tableau array avant initialisation � i + 1
			for (int j = i+1; j < array.length; j++) {
				
				/*
				 * Si la valeur du tableau array � l'index i est �gal � la valeur du tableau array � l'index j 
				 * alors compteurDoublon est incr�ment� de 1
				 */
				if(array[i] == array[j]) {
					
					compteurDoublon = compteurDoublon + 1;
					
				}
				
			}
			
			
		}
		
		//calcule de la moyenne
		moyenne = total/array.length;
		
		//Affichage de moyenne indexDe15 et compteurDoublon
		System.out.println("La moyenne est de : "+moyenne+"    L'index du nombre 15 est : "+indexDe15);
		System.out.println("Nombre de doublon : "+compteurDoublon);

	}

}
