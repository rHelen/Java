package ExerciciosExtras;

import java.util.Scanner;

public class Extra1idadeEmDias {

	public static void main(String[] args) {
		int anos,meses,dias,idadeEmdias;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos: ");
		anos = in.nextInt();
		System.out.println("Informe sua idade em meses: ");
		meses = in.nextInt();
		System.out.println("Informe sua idade em dias: ");
		dias = in.nextInt();
		
		idadeEmdias = (anos*365)+(meses*30)+dias;
				
		System.out.println("Sua idade em dias é de: "+idadeEmdias+" dias.");
	}

}
