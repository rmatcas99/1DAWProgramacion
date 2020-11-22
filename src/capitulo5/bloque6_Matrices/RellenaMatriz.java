package capitulo5.bloque6_Matrices;

import javax.swing.JOptionPane;

public class RellenaMatriz {

	public static void main(String[] args) {
		/*
		 * Crea un método que rellena la matriz con valores creados al azar. El método
		 * recibirá la matriz y devolverá "void".
		 */

		int matriz[][] = new int[3][3];
		
		rellenaMatriz(matriz);
	}
	
	public static void rellenaMatriz(int matriz[][]) {
		int max = Integer.parseInt(JOptionPane.showInputDialog("Introduce el máximo valor "));
		int min = Integer.parseInt(JOptionPane.showInputDialog("Introduce el mínimo valor "));
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * (max - min) + min);
			}
		}
	}

}
