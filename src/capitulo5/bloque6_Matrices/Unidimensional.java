package capitulo5.bloque6_Matrices;

public class Unidimensional {

	public static void main(String[] args) {
		/*
		 * Crea un método que construya un array unidimensional con todos los elementos
		 * de la matriz. El método recibirá una matriz y devolverá un array.
		 */
		
		int matriz[][] = new int[3][3];
		RellenaMatriz.rellenaMatriz(matriz);
		ImprimeMatriz.imprimeMatriz(matriz);
		
		System.out.println();
		
		unidimensional(matriz);

	}
	
	public static int[] unidimensional(int matriz[][]) {
		int numValores = 0;
		
		//Contamos el número de valores que tiene la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				numValores++;
			}
		}
		
		int array[] = new int[numValores];
		
		//Le asignamos a el array los valores de la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				array[i] = matriz[i][j];
				System.out.print(array[i] + " ");
			}
		}
		
		return array;
	}

}
