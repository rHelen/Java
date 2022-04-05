package Arrays;

import java.util.Scanner;

public class Matriz2matrizes {

	public static void main(String[] args) {
		int[][] A = new int[2][2];
		int[][] B = new int[2][2];
		int[][] C = new int[2][2];
		int x,num,linha,coluna;
		Scanner in = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.print("Informe um número: ");
				A[linha][coluna]=in.nextInt();
			}
		} System.out.println("\n");
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.print("Informe um número: ");
				A[linha][coluna]=in.nextInt();
			}
			
			System.out.println("A soma das matrizes é: ");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					System.out.print("[ "+A[linha][coluna]+" ]");
				} System.out.println(" ");
			} 
			
		} System.out.println("\n");
		System.out.println("Menu de opções\n1. somar as duas matrizes\n2. subtrair a primeira matriz "
				+ "da segunda\n3. adicionar uma constante as duas matrizes\n4. imprimir as matrizes");
		num=in.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("A soma das matrizes é: ");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					C[linha][coluna]=A[linha][coluna]+B[linha][coluna];
					System.out.print("[ "+C[linha][coluna]+" ]");
				} System.out.println(" ");
			} 
			break;
		case 2:
			System.out.println("A subtração das matrizes é: ");
			for(linha=0;linha<2;linha++) {
				for(coluna=0;coluna<2;coluna++) {
					C[linha][coluna]=B[linha][coluna]-A[linha][coluna];
					System.out.println("[ "+C[linha][coluna]+" ]");
				} System.out.println("\n");
			} 
			break;
			default:
				System.out.println("Opção inválida, tente novamente");
		   
		}
			
	}
}
