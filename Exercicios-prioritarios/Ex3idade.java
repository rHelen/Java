package Exercicios;

import java.util.Scanner;

public class Ex3idade {

	public static void main(String[] args) {
		
		int idade;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade = in.nextInt();
		
		if(idade>=10 && idade <=14) {
			System.out.println("Infantil");
		}
		if(idade>=15 && idade <=17) {
			System.out.println("Juvenil");
		}
		if(idade>=18 && idade <=25) {
			System.out.println("Adulto");
		}
	}
}
