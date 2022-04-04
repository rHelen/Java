package LacoRepeticao;

import java.util.Scanner;

public class Ex6Multiplode3 {

	public static void main(String[] args) {
		int media,somaMultiplo=0,qnt=0;
		float num;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Informe o número: ");
			num=in.nextFloat();
			if(num%3==0) {
				somaMultiplo+=num;
				qnt++;
			}
		}
		while(num!=0);
		System.out.println("A media dos Múltiplos de 3 é: "+(somaMultiplo/(qnt-1)));
	}

}
