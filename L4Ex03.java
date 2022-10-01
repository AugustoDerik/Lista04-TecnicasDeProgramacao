package lista04;

import java.util.Random;

public class L4Ex03 {

	public static int[] posMulti3(int vetor[]) {

		int posMulti3[] = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0 && vetor[i] % 3 == 0) {
				posMulti3[i] = vetor[i];
			}
		}

		return posMulti3;
	}

	public static int[] posNaoMulti3(int vetor[]) {

		int posNaoMulti3[] = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0 && vetor[i] % 3 != 0) {
				posNaoMulti3[i] = vetor[i];
			}
		}

		return posNaoMulti3;
	}

	public static int[] negMulti3(int vetor[]) {

		int negMulti3[] = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0 && vetor[i] % 3 == 0) {
				negMulti3[i] = vetor[i];
			}
		}

		return negMulti3;
	}

	public static int[] negNaoMulti3(int vetor[]) {

		int negNaoMulti3[] = new int[vetor.length];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0 && vetor[i] % 3 != 0) {
				negNaoMulti3[i] = vetor[i];
			}
		}

		return negNaoMulti3;
	}

	public static void main(String[] args) {

		Random random1 = new Random();
		Random random2 = new Random();

		int vetor[] = new int[100];

		System.out.println("Vetor inicial:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = random1.nextInt(100) - random2.nextInt(100);
			System.out.print(vetor[i] + "  ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Vetor de números positivos e múltiplos de 3:");
		for (int i = 0; i < posMulti3(vetor).length; i++) {
			if (posMulti3(vetor)[i] != 0)
				System.out.print(posMulti3(vetor)[i] + "  ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Vetor de números positivos e não múltiplos de 3:");
		for (int i = 0; i < posNaoMulti3(vetor).length; i++) {
			if (posNaoMulti3(vetor)[i] != 0)
				System.out.print(posNaoMulti3(vetor)[i] + "  ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Vetor de números negativos e múltiplos de 3:");
		for (int i = 0; i < negMulti3(vetor).length; i++) {
			if (negMulti3(vetor)[i] != 0)
				System.out.print(negMulti3(vetor)[i] + "  ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Vetor de números negativos e não múltiplos de 3:");
		for (int i = 0; i < negNaoMulti3(vetor).length; i++) {
			if (negNaoMulti3(vetor)[i] != 0)
				System.out.print(negNaoMulti3(vetor)[i] + "  ");
		}

	}

}
