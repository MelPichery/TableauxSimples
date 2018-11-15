package testarray;

import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		
		int rangn = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Choisissez un rang N");
		rangn = sc1.nextInt();	
		
		int[] fibonacci = new int[rangn+3];
		
		
		
		fibonacci[0]=0;
		fibonacci[1]=1;
		
		for (int i = 2; i < rangn+3; i++) {
			
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
			
		}
		
		System.out.print("Résultat Suite Fibonacci : "+fibonacci[rangn]+"  ");
		
	}

}
