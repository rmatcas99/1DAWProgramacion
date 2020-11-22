package capitulo5.bloque6_Matrices;

public class MatrizPositiva {

	public static void main(String[] args) {
		/*
		 * Crea un método que compruebe si la matriz es positiva. (Todos sus elementos
		 * mayores o iguales a cero). El método recibirá una matriz y devolver un valor
		 * "boolean", indicando si la matriz es o no es positiva.
		 */

		int matriz[][] = new int[3][3];

		System.out.println("¿La matriz es positiva? " + matrizPositiva(matriz));
	}

	public static boolean matrizPositiva(int matriz[][]) {
		boolean positiva = true;
		RellenaMatriz.rellenaMatriz(matriz);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j] <= 0) {
					positiva = false;
				}
			}
		}
		
		ImprimeMatriz.imprimeMatriz(matriz);

		return positiva;
	}

}
