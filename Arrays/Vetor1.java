package Arrays;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		int[] A = {1,0,5,-2,-5,7}; // modified: new int[6]
		int x,soma;
		Scanner in = new Scanner(System.in);
		
		//for(x=0;x<6;x++) {
			//System.out.println("Informe um número: ");
			//A[x]=in.nextInt();
			//if(A[x]==0 || A[x]==1 || A[x]==5) {
				//soma+=A[x];
			//}
		soma=A[0]+A[1]+A[5]; // modified : remove this line
		
		A[3]=100;
		for(x=0;x<6;x++) {
				System.out.println(A[x]);
		}
	}

}
