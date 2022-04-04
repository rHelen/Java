package Logica;

import java.util.Scanner;

public class Ex8Carro {

	public static void main(String[] args) {
		double total,custo;
		float perDistri,perImpostos; //28% = Distributor, 45% = Impostor
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o custo de fábrica: ");
		custo=in.nextDouble();
		
		perDistri =28/100;
		perImpostos=45/100;
		total=custo+(perDistri*custo)+(perImpostos*custo);
		System.out.println(custo);
		System.out.println(perDistri+" e "+perImpostos);
		System.out.println("O custo para o consumidor é de: "+total);
	}

}
