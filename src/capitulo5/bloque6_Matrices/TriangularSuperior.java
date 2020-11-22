package capitulo5.bloque6_Matrices;

public class TriangularSuperior {

	public static void main(String[] args) {
		/*
		 * Crea un método que compruebe si la matriz es triangular superior. (Todos los
		 * elementos que están por debajo de la diagonal principal son nulos).
		 */

		int matriz[][] = { { 1, 2, 3 }, { 0, 1, 2 }, { 0, 0, 1 } };

		ImprimeMatriz.imprimeMatriz(matriz);

		System.out.println();

		System.out.println("¿La matriz es triangular superior? " + triangularSuperior(matriz));
	}

	public static boolean triangularSuperior(int matriz[][]) {
		boolean trian_sup = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < i; j++) {
				if (matriz[i][j] != 0) {
					return trian_sup = false;
				}
			}
		}
		return trian_sup;
	}

}
