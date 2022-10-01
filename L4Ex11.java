package lista04;

import java.util.Scanner;

public class L4Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int m[][]=new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j]=scan.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		int n[][]=new int[3][2];
		n[0][0]=m[0][0];
		n[1][0]=m[1][0];
		n[2][0]=m[2][0];
		n[0][1]=m[0][1];
		n[0][2]=m[0][2];
		n[1][1]=m[1][1];
		
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 2; i++) {
				System.out.print(n[j][i]+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
