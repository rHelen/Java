package Arrays;

import java.util.Scanner;

public class Matriz1 {

	public static void main(String[] args) {
		int[] A = new int[9];
		int x=0,cont=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Informe 6 n�meros: ");
		do {
			A[x]=in.nextInt();
			if(A[x]>10) {
				cont++;
			} x++;
		} while(x<6);
	
		System.out.println("A quantidade de n�meros maiores que 10 � de: "+cont);
	}

}
