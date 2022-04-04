package Logica;

import java.util.Scanner;

public class Ex4CalculoD {

	public static void main(String[] args) {
		
		double a,b,c,d,r,s;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		a=in.nextDouble();
		System.out.println("Informe o valor de B: ");
		b=in.nextDouble();
		System.out.println("Informe o valor de C: ");
		c=in.nextDouble();
		
		d=((Math.pow((a+b),2)))+(Math.pow((b+c),2))/2;
		
		System.out.println("O valor de D é: "+d);
	}

}
