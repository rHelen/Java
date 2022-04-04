package LacoRepeticao;

import java.util.Scanner;

public class Ex2PareImpar {

	public static void main(String[] args) {
		int somaPar=0,somaImpar=0,x,num;
		Scanner in = new Scanner(System.in);

		for(x=1;x<=10;x++) {
		
		System.out.println("Informe o "+x+"° valor: ");
		num=in.nextInt();
		
		if(num%2==0) {
			somaPar++;
		} else {
			somaImpar++;
		}
	}
		System.out.println("A quantidade de números par e ímpar foi de: "+somaPar+" e "+somaImpar);
	}

}
