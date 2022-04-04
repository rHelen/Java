package Logica;

import java.util.Scanner;

public class Ex7SistemasLineares {

	public static void main(String[] args) {
		double a,b,c,d,e,f,x,y;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a=in.nextDouble();
		System.out.println("Informe o valor de B: ");
		b=in.nextDouble();
		System.out.println("Informe o valor de C: ");
		c=in.nextDouble();
		System.out.println("Informe o valor de D: ");
		d=in.nextDouble();
		System.out.println("Informe o valor de E: ");
		e=in.nextDouble();
		System.out.println("Informe o valor de F: ");
		f=in.nextDouble();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.println("Os valores de X e Y são: "+x+" e "+y);

	}

}
