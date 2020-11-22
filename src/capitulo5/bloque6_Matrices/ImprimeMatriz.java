package capitulo5.bloque6_Matrices;

public class ImprimeMatriz {

	public static void main(String[] args) {
		/*
		 * Crea un método que imprima la matriz en consola. El método recibirá la matriz
		 * y devolverá "void".
		 */

		int matriz[][] = new int[3][3];
		
		RellenaMatriz.rellenaMatriz(matriz);
		imprimeMatriz(matriz);
	}
	
	public static void imprimeMatriz(int matriz[][]) {
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}

}
