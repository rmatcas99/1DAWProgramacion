package capitulo5.bloque6_Matrices;

public class Opuesta {

	public static void main(String[] args) {
		/*
		 * Crea un método que realice la matriz opuesta de la que recibe. El método
		 * recibe una matriz y devuelve otra, la opuesta.
		 */
		
		int matriz[][] = new int [3][3];
		RellenaMatriz.rellenaMatriz(matriz);

		ImprimeMatriz.imprimeMatriz(matriz);

		System.out.println("La opuesta de la matriz pasada es:  " + "\n");

		matriz = opuesta(matriz);

		ImprimeMatriz.imprimeMatriz(matriz);

	}
	
	public static int[][] opuesta(int matriz[][]){
		int opuesta[][] = new int [matriz.length][matriz.length];
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				opuesta[i][j] = matriz[i][j] * -1;
			}
		}
		
		return opuesta;
	}

}
