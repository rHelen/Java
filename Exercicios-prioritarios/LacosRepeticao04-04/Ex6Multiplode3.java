package LacoRepeticao;

import java.util.Scanner;

public class Ex6Multiplode3 {

	public static void main(String[] args) {
		int media,somaMultiplo=0,qnt=0;
		float num;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Informe o n�mero: ");
			num=in.nextFloat();
			if(num%3==0) {
				somaMultiplo+=num;
				qnt++;
			}
		}
		while(num!=0);
		System.out.println("A media dos M�ltiplos de 3 �: "+(somaMultiplo/(qnt-1)));
	}

}
