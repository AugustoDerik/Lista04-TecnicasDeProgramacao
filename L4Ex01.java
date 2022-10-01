package lista04;

import java.util.Scanner;

public class L4Ex01 {

	public static void CalcularImpostoDeRenda(float salarioMin, int depend, float salarioFun, float impostoNormal) {

		System.out.println("CALCULAR IMPOSTO DE RENDA");

		float impostoRenda = 0;
		float impostoTotal = 0;

		if (salarioFun / salarioMin >= 12) {
			impostoRenda = (float) (salarioFun * 0.2);
		} else if (salarioFun / salarioMin > 5) {
			impostoRenda = (float) (salarioFun * 0.08);
		}

		impostoRenda += (impostoRenda * 0.04);
		impostoTotal = impostoRenda + (salarioFun * impostoNormal);

		for (int i = 0; i <= depend; i++) {
			impostoTotal -= (impostoTotal * 0.02);
		}

		System.out.println("Total de impostos: " + impostoTotal);
		System.out.println("Salário restante: " + (salarioFun - impostoTotal));
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do salário mínimo:");
		float salarioMin = scan.nextFloat();
		System.out.println("Informe o número de dependentes do funcionário:");
		int depend = scan.nextInt();
		System.out.println("Informe o salário do funcionário:");
		float salarioFun = scan.nextFloat();
		System.out.println("Informe a taxa de imposto normal:");
		float impostoNormal = scan.nextFloat();

		CalcularImpostoDeRenda(salarioMin, depend, salarioFun, impostoNormal);

		scan.close();
	}

}
