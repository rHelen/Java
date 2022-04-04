package Logica;

import java.util.Scanner;

public class Ex5PontosDaReta {

	public static void main(String[] args) {
		double x1,x2,y1,y2,d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o valor de X1: ");
		x1=in.nextDouble();
		System.out.println("Informe o valor de X2: ");
		x2=in.nextDouble();
		System.out.println("Informe o valor de Y1: ");
		y1=in.nextDouble();
		System.out.println("Informe o valor de Y2: ");
		y2=in.nextDouble();
		
		d=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		System.out.println("O ponto de intercessão é: "+d);
	}

}
