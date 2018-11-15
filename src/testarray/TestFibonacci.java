package testarray;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		//Déclaration et initialisation de la variable rangn
		int rangn = 0;
		
		//Affichage de la consigne et sauvegarde de rangn
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Choisissez un rang N");
		rangn = sc1.nextInt();	
		
		//Création du tableau fibonacci de taille rangn + 1
		int[] fibonacci = new int[rangn+1];
		
		//le tableau prend les valeurs 0 et 1 à l'index 0 et 1
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		//le tableau fibonacci à l'index i prend la valeur de la somme des valeurs de ce même tableau à l'index i-1 et i-2
		for (int i = 2; i < rangn+1; i++) {
			
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
			
		}
		
		//Affichage du résultat
		System.out.print("Résultat Suite Fibonacci : "+fibonacci[rangn]+"  ");
		
	}

}
