package Logica;

import java.util.Scanner;

public class Ex3SegEmHora {
	public static void main(String[] args) {
		
		int segTotal,hora,minutos,seg;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe os segundos: "); //14.477 = 4hrs10min7seg
		segTotal = in.nextInt();
		
		hora = segTotal/3600;
		minutos = (segTotal%3600)/60;
		seg = (segTotal%3600)%60;
		
		System.out.println("O tempo foi de: "+hora+" hora(s), "+minutos+" minuto(s) e "+seg+" segundo(s).");
	}
}
