package lista04;

import java.util.Scanner;

public class L4Ex09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int h = entrada.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int j = h - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("*");
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		entrada.close();
	}

}
