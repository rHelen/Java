package Arrays;

import java.util.Scanner;

public class Vetor2PareImpar {

	public static void main(String[] args) {
		int[] A = new int [6];
		int x,somaP=0,contI=0,contP=0;
		int[] impar = new int[6];
		int[] par = new int[6];
		Scanner in = new Scanner(System.in);
		
			for(x=0;x<6;x++) {
			System.out.println("Informe um número: ");
			A[x]=in.nextInt();
			
			if(A[x]%2==0) {
				somaP+=A[x];
				par[x]=A[x];
			} else {
				impar[x]=A[x];
				contI++;
			}
		}
		
		for(x=0;x<6;x++) {
			if(A[x]%2==0) {
				System.out.println("Número par: "+A[x]);
		} 
			System.out.println("A soma dos números pares é: "+somaP);
		
		for(x=0;x<6;x++) {
			if(A[x]%2==1) {
			
			System.out.println("Números ímpares: "+A[x]);
			}
		 System.out.println("A quantidade de números ímpares digitados é: "+contI);
		}
	}
}
}