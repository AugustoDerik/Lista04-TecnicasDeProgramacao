package lista04;

import java.util.Scanner;

public class L4Ex06 {

	public static void calcularTempo(int s) {
		int h = s / 3600;
		int resto = s % 3600;
		int m = resto / 60;
		s = resto % 60;
		if (h != 0)
			System.out.println(h + " horas " + m + " minutos e " + s + " segundos");
		else if (h == 0 && m != 0)
			System.out.println(m + " minutos e " + s + " segundos");
		else if (h == 0 && m == 0)
			System.out.println(s + " segundos");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Massa inicial do material radioativo em gramas: ");
		float massa = scan.nextFloat();

		int meiaVida = 0;

		while (massa >= 0.5) {
			meiaVida++;
			massa /= 2;
		}

		int segundos = 50 * meiaVida;

		System.out.print("\nMassa final decorridas " + meiaVida + " meias vidas: " + massa);
		System.out.print("\nTempo: ");
		calcularTempo(segundos);

		scan.close();
	}

}
