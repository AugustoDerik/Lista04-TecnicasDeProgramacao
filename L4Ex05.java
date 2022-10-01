package lista04;

import java.util.Random;

public class L4Ex05 {

	public static int soma(int vet[]) {

		int soma = 0;

		for (int i = 0; i < vet.length; i++)
			soma += vet[i];

		return soma;
	}

	public static int produto(int vet[]) {

		int produto = 1;

		for (int i = 0; i < vet.length; i++)
			produto *= vet[i];

		return produto;
	}

	public static float media(int vet[]) {

		float media = 0;

		media = soma(vet) / vet.length;

		return media;
	}

	public static void main(String[] args) {

		Random gerarElementos = new Random();

		int vet1[] = new int[10];
		int vet2[] = new int[10];
		int vet3[] = new int[10];

		for (int i = 0; i < vet3.length; i++) {
			vet1[i] = gerarElementos.nextInt(10);
			vet2[i] = gerarElementos.nextInt(10);
			vet3[i] = gerarElementos.nextInt(10);
		}

		System.out.println("Vetor 1:");
		for (int i = 0; i < vet3.length; i++)
			System.out.print(vet1[i] + " ");

		System.out.println("\nSoma dos elementos do 1° vetor: " + soma(vet1));
		System.out.println("Produto dos elementos do 1° vetor: " + produto(vet1));
		System.out.println("Média dos elementos do 1° vetor: " + media(vet1));

		System.out.println("\nVetor 2:");
		for (int i = 0; i < vet3.length; i++)
			System.out.print(vet2[i] + " ");

		System.out.println("\nSoma dos elementos do 2° vetor: " + soma(vet2));
		System.out.println("Produto dos elementos do 2° vetor: " + produto(vet2));
		System.out.println("Média dos elementos do 2° vetor: " + media(vet2));

		System.out.println("\nVetor 3:");
		for (int i = 0; i < vet3.length; i++)
			System.out.print(vet3[i] + " ");

		System.out.println("\nSoma dos elementos do 3° vetor: " + soma(vet3));
		System.out.println("Produto dos elementos do 3° vetor: " + produto(vet3));
		System.out.println("Média dos elementos do 3° vetor: " + media(vet3));

		int vetSoma[] = new int[3];
		int vetProduto[] = new int[3];
		float vetMedia[] = new float[3];

		vetSoma[0] = soma(vet1);
		vetSoma[1] = soma(vet2);
		vetSoma[2] = soma(vet3);

		vetProduto[0] = produto(vet1);
		vetProduto[1] = produto(vet2);
		vetProduto[2] = produto(vet3);

		vetMedia[0] = media(vet1);
		vetMedia[1] = media(vet2);
		vetMedia[2] = media(vet3);

		System.out.println("\nVetor com as somas:");
		for (int i = 0; i < vetMedia.length; i++)
			System.out.print(vetSoma[i] + " ");
		System.out.println("\nSoma do vetor que contém as somas: " + soma(vetSoma));

		System.out.println("\nVetor com os produtos:");
		for (int i = 0; i < vetMedia.length; i++)
			System.out.print(vetProduto[i] + " ");
		System.out.println("\nProduto do vetor que contém os produtos: " + produto(vetProduto));

		System.out.println("\nVetor com as médias:");
		for (int i = 0; i < vetMedia.length; i++)
			System.out.print(vetMedia[i] + " ");
		//System.out.println("\nMédia do vetor que contém as médias: " + media(vetMedia));

	}

}
