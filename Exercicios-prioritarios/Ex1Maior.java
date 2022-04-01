package Exercicios;

import java.util.Scanner;

public class Ex1Maior {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a = 0, maior = 0;
		
		for(int x = 0; x < 3; x++) {
			
			System.out.println("Insira um valor: ");
			a = leia.nextInt();
			
			if(x == 0) {
				a = maior;
			}
			if(a>maior) {
				maior=a;
			}
		}
		System.out.println("Maior valor : "+maior);
	}
}