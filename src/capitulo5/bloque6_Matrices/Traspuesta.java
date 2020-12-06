package capitulo5.bloque6_Matrices;

public class Traspuesta {

	public static void main(String[] args) {
		/*
		 * Crea un método que realice la matriz traspuesta de la que recibe. El método
		 * recibe una matriz y devuelve otra matriz, la traspuesta.
		 */

		int matriz[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };

		ImprimeMatriz.imprimeMatriz(matriz);

		System.out.println("La traspuesta de la matriz pasada es:  " + "\n");

		matriz = traspuesta(matriz);

		ImprimeMatriz.imprimeMatriz(matriz);

	}

	public static int[][] traspuesta(int matriz[][]) {
		int traspuesta[][] = new int[matriz.length][matriz.length];

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				traspuesta[i][j] = matriz[j][i];
			}
		}
		return traspuesta;
	}

}
