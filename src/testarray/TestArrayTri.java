package testarray;

import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		
		//d�claration et initialisation du tableau
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
			
		    //Tri du tableau avec la m�thode sort et affichage du tableau tri�
			Arrays.sort(array);
			System.out.println(Arrays.toString(array));

	}

}
