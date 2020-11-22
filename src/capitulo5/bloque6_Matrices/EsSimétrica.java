package capitulo5.bloque6_Matrices;

public class EsSimétrica {

	public static void main(String[] args) {
		/*
		 * Crea un método que compruebe si la matriz es simétrica. (Los elementos de la
		 * matriz (i, j) y (j, i), si existen, son iguales). El método recibirá una
		 * matriz y devolverá un boolean.
		 */

		int matriz[][] = { { 0, 1, 1 }, { 1, 0, 1 }, { 1, 1, 0 } };

		ImprimeMatriz.imprimeMatriz(matriz);

		System.out.println();

		System.out.println("¿La matriz es triangular superior? " + esSimétrica(matriz));
	}

	public static boolean esSimétrica(int matriz[][]) {
		boolean simetrica = true;

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < i; j++) {
				if (matriz[j][i] != matriz[i][j] && i != j) {
					return simetrica = false;
				}
			}
		}

		return simetrica;
	}

}
