package testarray;

public class TestArray1 {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		int[] arrayInverse= new int[array.length];	
		int tailleArraySuperieurA3=0;
		int tailleArrayPair=0;
		int compteurArraySuperieurA3=0,compteurArrayPair=0;
		int	min =Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i]+"  ");			
			
			arrayInverse[array.length-1-i] = array[i];
			
			if (array[i]>3) {
				
				tailleArraySuperieurA3 = tailleArraySuperieurA3+1;
								
			}
			
			if (array[i]%2 == 0) {
				
				
				tailleArrayPair = tailleArrayPair +1 ;
				
			}
			
			if (array[i]<min) {
				
				min = array[i];
			}
			
			if (array[i]>max) {
				
				max=array[i];
				
			}
		}
		
		System.out.println();
		System.out.println("Affichage du tableau inverse :");
		
		for (int i = 0; i < arrayInverse.length; i++) {
			
			System.out.print(arrayInverse[i]+"  ");
			
		}
								
		int[] arraySuperieurA3 = new int[tailleArraySuperieurA3];
		int[] arrayPair = new int[tailleArrayPair];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]>3) {
				
				arraySuperieurA3[compteurArraySuperieurA3]=array[i];
				compteurArraySuperieurA3=compteurArraySuperieurA3+1;
				
			}
			
			if (array[i]%2 == 0) {
				
				arrayPair[compteurArrayPair] = array[i];
				compteurArrayPair=compteurArrayPair+1;
				
			}
		}
		
		System.out.println();
		System.out.println("Affichage du tableau des chiffres supérieur à 3 :");
		
		for (int i = 0; i < arraySuperieurA3.length; i++) {
			
			System.out.print(arraySuperieurA3[i]+"  ");
			
		}
		
		System.out.println();
		System.out.println("Affichage du tableau des chiffres pairs :");
		
		for (int i = 0; i < arrayPair.length; i++) {
			
			System.out.print(arrayPair[i]+"  ");
			
		}
		System.out.println();
		System.out.println("Valeur max : "+max+"    Valeur min : "+min);
		
	}

}
