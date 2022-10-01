package lista04;

import java.util.Scanner;

public class L4Ex07 {

	public static void inverter(String frase) {

		char invertida[] = new char[frase.length()];

		for (int i = 0; i < frase.length(); i++)
			invertida[i] = frase.charAt(frase.length() - (i + 1));

		StringBuilder fraseFinal = new StringBuilder();
		System.out.print("Resultado:\n" + fraseFinal.append(invertida));
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma frase para ser invertida:");
		String frase = scan.nextLine();

		inverter(frase);

		scan.close();
	}

}
