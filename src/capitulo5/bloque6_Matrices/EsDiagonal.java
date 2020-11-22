package capitulo5.bloque6_Matrices;

public class EsDiagonal {

	public static void main(String[] args) {
		/*
		 * Crea un método que compruebe si la matriz es diagonal (Todos los elementos
		 * que no están en la diagonal principal son nulos).
		 */

		int matriz[][] = { { 1, 1, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };

		ImprimeMatriz.imprimeMatriz(matriz);

		System.out.println();

		System.out.println("¿La matriz es diagonal? " + esDiagonal(matriz));

	}

	public static boolean esDiagonal(int matriz[][]) {
		boolean diagonal = true;

		int verdad[] = new int[3];
		int falso[] = new int[6];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					if (matriz[i][j] == 1) {
						verdad[i] = matriz[i][j];
					}
				}

				if (i != j) {
					if (matriz[i][j] == 0) {
						falso[i] = matriz[i][j];
					} else {
						falso[i] = 2;
					}
				}
			}
		}

		int sumTrue = 0;
		for (int i = 0; i < verdad.length; i++) {
			sumTrue += verdad[i];
		}

		int sumFalse = 0;
		for (int i = 0; i < falso.length; i++) {
			sumFalse += falso[i];
		}

		if (sumTrue < 3 && sumFalse == 0) {
			diagonal = true;
		} else {
			diagonal = false;
		}

		return diagonal;
	}

}
