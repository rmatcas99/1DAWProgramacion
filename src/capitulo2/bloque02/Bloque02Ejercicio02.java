package capitulo2.bloque02;

import javax.swing.JOptionPane;

public class Bloque02Ejercicio02 {

	public static void main(String[] args) {
		//Realiza un ejercicio igual al anterior, pero con las dos siguientes diferencias: 
		//no existe la categoría de números negativos, por tanto si el usuario introduce un negativo, 
		//el programa debe terminar; la otra diferencia es que, al acabar, el programa no debe mostrar 
		//la suma de los números, sino cuantos han entrado en cada categoría. A esto se llema contadores, 
		//a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.
		
		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num1 = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num2 = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num3 = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num4 = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num5 = Integer.parseInt(cad);

		int numBajo = 0;
		int numMedio = 0;
		int numGrande = 0;

		if (num1 < 0 || num2 < 0 || num3 < 0 || num4 < 0 || num5 < 0) {
			System.out.println("Se ha introducido un número negativo, el programa no se ejecutará");
		} else {
			// Comprobamos si los números son Bajos (0-25)
			if (0 <= num1 && num1 <= 25) {
				numBajo = numBajo + 1;
			}
			if (0 < num2 && num2 < 25) {
				numBajo = numBajo + 1;
			}
			if (0 < num3 && num3 < 25) {
				numBajo = numBajo + 1;
			}
			if (0 < num4 && num4 < 25) {
				numBajo = numBajo + 1;
			}
			if (0 < num5 && num5 < 25) {
				numBajo = numBajo + 1;
			}

			// Comprobamos si los números son Medios (26-250)
			if (26 <= num1 && num1 <= 250) {
				numMedio = numMedio + 1;
			}
			if (26 <= num2 && num2 <= 250) {
				numMedio = numMedio + 1;
			}
			if (26 <= num3 && num3 <= 250) {
				numMedio = numMedio + 1;
			}
			if (26 <= num4 && num4 <= 250) {
				numMedio = numMedio + 1;
			}
			if (26 <= num5 && num5 <= 250) {
				numMedio = numMedio + 1;
			}

			// Comprobamos si los números son Grandes (>250)
			if (num1 > 250) {
				numGrande = numGrande + 1;
			}
			if (num2 > 250) {
				numGrande = numGrande + 1;
			}
			if (num3 > 250) {
				numGrande = numGrande + 1;
			}
			if (num4 > 250) {
				numGrande = numGrande + 1;
			}
			if (num5 > 250) {
				numGrande = numGrande + 1;
			}

			System.out.println("La suma de números bajos es: " + numBajo);
			System.out.println("La suma de números medios es: " + numMedio);
			System.out.println("La suma de números grandes es: " + numGrande);
		}
	}

}
