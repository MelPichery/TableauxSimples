package testarray;

public class TestArray2 {

	public static void main(String[] args) {
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int moyenne = 0, total = 0, indexDe15=0, compteurDoublon = 0;
		
		for (int i = 0; i < array.length; i++) {
			 
			total = total + array[i];
			
			if (array[i] == 15) {
				
				indexDe15 = i;
				
			}
			
			
			for (int j = i+1; j < array.length; j++) {
				
				if(array[i] == array[j]) {
					
					compteurDoublon = compteurDoublon + 1;
					
				}
				
			}
			
			
		}
		
		moyenne = total/array.length;
		
		System.out.println("La moyenne est de : "+moyenne+"    L'index du nombre 15 est : "+indexDe15);
		System.out.println("Nombre de doublon : "+compteurDoublon);

	}

}
