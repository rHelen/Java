package LacoRepeticao;

import java.util.Scanner;

public class Ex3Idade {

	public static void main(String[] args) {
		int idade,vinteUm=0,cinquenta=0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe a idade: ");
		idade=in.nextInt();
		
		while(idade!=-99) {
			if(idade<21) {
				vinteUm++;
			} else if(idade>50) {
				cinquenta++;
			}
			System.out.println("Informe a idade: ");
			idade=in.nextInt();
		}
		System.out.println("Foram: \n"+vinteUm+" pessoas com menos de"
				+ " vinte e um anos. \n"+cinquenta+" pessoas com mais de cinquenta anos.");
	}

}
