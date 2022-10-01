package lista04;

import java.util.Scanner;

public class L4Ex02 {

	public static float preçoDesconto(float preço) {
		preço -= (preço * 0.4);
		return preço;
	}

	public static float ferramentaNova(float preço) {
		preço += (preço * 0.15);
		return preço;
	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o dia da semana:");
		String dia = teclado.nextLine();
		System.out.println("Informe o preço do aluguel:");
		float preço = teclado.nextFloat();
		System.out.println("A ferramenta é nova?");
		String simNao = teclado.next();

		if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quinta")) {
			if (simNao.equals("sim")) {
				System.out.println(preçoDesconto(ferramentaNova(preço)));
			} else {
				System.out.println("Preço:" + preçoDesconto(preço));
			}
		}
		if (dia.equals("quarta") || dia.equals("sexta") || dia.equals("sabado") || dia.equals("domingo")) {
			if (simNao.equals("sim")) {
				System.out.println(ferramentaNova(preço));
			} else {
				System.out.println("Preço:" + preço);
			}
		}

		teclado.close();
	}

}
