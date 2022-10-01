package lista04;

public class L4Ex12a {

	public static void bandeiraVazia(char bandeira[][], int linha, int coluna, char caractere) {

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				bandeira[i][j] = caractere;
			}
		}
	}

	public static void duasDiagonaisBR(char bandeira[][], int linha, int coluna, char caractere) {
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (i == j + 3 || j == i + 3) {
					bandeira[i][j] = caractere;
				}
			}
		}
	}

	public static void maisDuasDiagonaisBR(char bandeira[][], int linha, int coluna, char caractere) {
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				if (i == j + 3 || j == i + 3) {
					bandeira[i][j] = caractere;
				}
			}
		}
	}

	public static void main(String[] args) {

		int linha = 10;
		int coluna = 9;
		char bandeira[][] = new char[linha][coluna];

		bandeiraVazia(bandeira, linha, coluna, '*');
		duasDiagonaisBR(bandeira, linha, coluna, '&');

		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(bandeira[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
