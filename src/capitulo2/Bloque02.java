package capitulo2;

import javax.swing.JOptionPane;

public class Bloque02 {

	private static void Ejercicio01() {

		// Realiza un ejercicio que acumule cinco números introducidos por el usuario,
		// es decir, que sume las cantidades introducidas, pero realizando cuatro
		// categorías:
		// números negativos, números bajos (entre 0 y 25, ambos inclusive), números
		// medios
		// (entre 26 y 250, ambos inclusie) y números grandes (mayores de 250). Al
		// finalizar
		// el programa, se debe mostrar el total de las sumas de los números
		// introducidos en cada una de las categorías.

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

		int numNeg = 0;
		int numBajo = 0;
		int numMedio = 0;
		int numGrande = 0;

		// Comrpobamos si los números son negativos
		if (num1 < 0) {
			numNeg = numNeg + num1;
		}
		if (num2 < 0) {
			numNeg = numNeg + num2;
		}
		if (num3 < 0) {
			numNeg = numNeg + num3;
		}
		if (num4 < 0) {
			numNeg = numNeg + num4;
		}
		if (num5 < 0) {
			numNeg = numNeg + num5;
		}

		// Comprobamos si los números son Bajos (0-25)
		if (0 <= num1 && num1 <= 25) {
			numBajo = numBajo + num1;
		}
		if (0 < num2 && num2 < 25) {
			numBajo = numBajo + num2;
		}
		if (0 < num3 && num3 < 25) {
			numBajo = numBajo + num3;
		}
		if (0 < num4 && num4 < 25) {
			numBajo = numBajo + num4;
		}
		if (0 < num5 && num5 < 25) {
			numBajo = numBajo + num5;
		}

		// Comprobamos si los números son Medios (26-250)
		if (26 <= num1 && num1 <= 250) {
			numMedio = numMedio + num1;
		}
		if (26 <= num2 && num2 <= 250) {
			numMedio = numMedio + num2;
		}
		if (26 <= num3 && num3 <= 250) {
			numMedio = numMedio + num3;
		}
		if (26 <= num4 && num4 <= 250) {
			numMedio = numMedio + num4;
		}
		if (26 <= num5 && num5 <= 250) {
			numMedio = numMedio + num5;
		}

		// Comprobamos si los números son Grandes (>250)
		if (num1 > 250) {
			numGrande = numGrande + num1;
		}
		if (num2 > 250) {
			numGrande = numGrande + num2;
		}
		if (num3 > 250) {
			numGrande = numGrande + num3;
		}
		if (num4 > 250) {
			numGrande = numGrande + num4;
		}
		if (num5 > 250) {
			numGrande = numGrande + num5;
		}

		System.out.println("La suma de números negativos es: " + numNeg);
		System.out.println("La suma de números bajos es: " + numBajo);
		System.out.println("La suma de números medios es: " + numMedio);
		System.out.println("La suma de números grandes es: " + numGrande);

	}

	private static void Ejercicio02() {

		// Realiza un ejercicio igual al anterior, pero con las dos siguientes
		// diferencias:
		// no existe la categoría de números negativos, por tanto si el usuario
		// introduce un negativo,
		// el programa debe terminar; la otra diferencia es que, al acabar, el programa
		// no debe mostrar
		// la suma de los números, sino cuantos han entrado en cada categoría. A esto se
		// llema contadores,
		// a diferencia del ejercicio anterior, que reciben el nombre de acumuladores.

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

	public static void main(String[] args) {
		Ejercicio01();
		Ejercicio02();

	}

}
