package ExerciciosExtras;

import java.util.Scanner;

public class Extra2DiasEmAnos {
	public static void main(String[] args) {
		int idadeEmDias,anos,meses,dias;
		Scanner in = new Scanner(System.in);
		// 6684 dias
		System.out.println("Informe sua idade em dias: ");
		idadeEmDias = in.nextInt();
		
		anos = idadeEmDias/365;
		meses = (idadeEmDias%365)/30;
		dias = ((idadeEmDias%365)%30);
		
		System.out.println("A idade em é de: "+anos+" anos, "+meses+" meses e"
				+ " "+dias+" dias.");
	}

}
