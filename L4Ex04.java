package lista04;

import java.util.Scanner;

public class L4Ex04 {

	public static void verificaVogal(String[] frase) {

		for (int i = 0; i < frase.length; i++) {
			System.out.println("Vogais da frase: " + frase[i]);
			for (int j = i; j < frase[i].length(); j++) {
				if (frase[i].charAt(j) == 'a')
					System.out.print("a  ");
				else if (frase[i].charAt(j) == 'e')
					System.out.print("e  ");
				else if (frase[i].charAt(j) == 'i')
					System.out.print("i  ");
				else if (frase[i].charAt(j) == 'o')
					System.out.print("o  ");
				else if (frase[i].charAt(j) == 'u')
					System.out.print("u  ");
			}
			System.out.println();
		}
	}

	public static void verificaConsoante(String[] frase) {

		for (int i = 0; i < frase.length; i++) {
			System.out.println("Consoantes da frase: " + frase[i]);
			for (int j = i; j < frase[i].length(); j++) {
				if (frase[i].charAt(j) == 'b')
					System.out.print("b  ");
				else if (frase[i].charAt(j) == 'c')
					System.out.print("c  ");
				else if (frase[i].charAt(j) == 'd')
					System.out.print("d  ");
				else if (frase[i].charAt(j) == 'f')
					System.out.print("f  ");
				else if (frase[i].charAt(j) == 'g')
					System.out.print("g  ");
				else if (frase[i].charAt(j) == 'h')
					System.out.print("h  ");
				else if (frase[i].charAt(j) == 'j')
					System.out.print("j  ");
				else if (frase[i].charAt(j) == 'k')
					System.out.print("k  ");
				else if (frase[i].charAt(j) == 'l')
					System.out.print("l  ");
				else if (frase[i].charAt(j) == 'm')
					System.out.print("m  ");
				else if (frase[i].charAt(j) == 'n')
					System.out.print("n  ");
				else if (frase[i].charAt(j) == 'p')
					System.out.print("p  ");
				else if (frase[i].charAt(j) == 'q')
					System.out.print("q  ");
				else if (frase[i].charAt(j) == 'r')
					System.out.print("r  ");
				else if (frase[i].charAt(j) == 's')
					System.out.print("s  ");
				else if (frase[i].charAt(j) == 't')
					System.out.print("t  ");
				else if (frase[i].charAt(j) == 'v')
					System.out.print("v  ");
				else if (frase[i].charAt(j) == 'w')
					System.out.print("w  ");
				else if (frase[i].charAt(j) == 'x')
					System.out.print("x  ");
				else if (frase[i].charAt(j) == 'y')
					System.out.print("y  ");
				else if (frase[i].charAt(j) == 'z')
					System.out.print("z  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase[] = new String[3];
		System.out.println("Digite três frase:");

		for (int i = 0; i < frase.length; i++) {
			frase[i] = teclado.nextLine();
		}

		verificaVogal(frase);
		verificaConsoante(frase);

		teclado.close();

	}

}
