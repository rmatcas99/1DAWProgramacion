package capitulo5.bloque6_Matrices;

public class EsDispersa {

	public static void main(String[] args) {
		/*
		 * Crea un método que compruebe si la matriz es dispersa. (Todos las filas y
		 * todas las columnas contienen al menos un elemento nulo).
		 */

		int matriz[][] = new int[3][3];
		RellenaMatriz.rellenaMatriz(matriz);
		ImprimeMatriz.imprimeMatriz(matriz);

		System.out.println();

		System.out.println("¿La matriz es dispersa? " + esDispersa(matriz));

	}

	public static boolean esDispersa(int matriz[][]) {
		boolean dispersa = true;
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] == 0) {
					count++;
				}
			}
			if (count >= 1) {
				count = 0;
			} else {
				dispersa = false;
			}
		}
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[j][i] == 0) {
					count ++;
				}
			}
			
			if (count >= 1) {
				count = 0;
			} else {
				dispersa = false;
			}
			
		}

		return dispersa;
	}

}
