package capitulo5;

import javax.swing.JOptionPane;

public class Bloque02 {

	private static void Ejercicio01() {

		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre -100 y 100. Debes conseguir que todos los números pares del array
		 * cambien de signo, los positivos deben pasar a negativos y viceversa.
		 */

		int array[] = new int[150];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - -100) + -100);
			System.out.print(" " + array[i]);
		}

		System.out.println("\n");

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				array[i] = array[i] * -1;
			}
			System.out.print(" " + array[i]);
		}

	}

	private static void Ejercicio02() {

		/*
		 * Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al
		 * azar entre 0 y 100. Debes crear un tercer array, compuesto de la siguiente
		 * forma: en los elementos de índice impar del tercer array debes copiar los
		 * elementos de índice impar del primer array; en los elementos de índice par
		 * del tercer array debes copiar los elementos de índice par del segundo array.
		 */

		int array[] = new int[150];
		int array2[] = new int[150];
		int array3[] = new int[150];

		// Genera el array1 y lo muestra
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
		}

		System.out.println();

		// Genera el aaray2 y lo muestra
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array2[i] + " ");
		}

		System.out.println();

		// Coge los impares impares del array1 y los pares del array2 y se los asigna a
		// array3
		for (int i = 0; i < array3.length; i++) {

			if (array[i] % 2 == 0) {
				array3[i] = array[i];
			} else {
				array3[i] = array2[i];
			}

			System.out.print(array3[i] + " ");
		}

	}

	private static void Ejercicio03() {

		/*
		 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
		 * entre 0 y 100. Debes conseguir multiplicar cada uno de los elementos del
		 * array por un número determinado, pedido al usuario.
		 */

		int array[] = new int[150];
		int num = Integer.parseInt(JOptionPane
				.showInputDialog("Introduce un número por el cual cada elemento del array será multiplicado: "));

		// Genera el array y lo muestra
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
		}

		System.out.println();

		// Hace la multiplicación del array por el número introducido y lo muestra
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * num;

			System.out.print(array[i] + " ");
		}

	}

	private static void Ejercicio04() {

		/*
		 * Realiza un ejercicio en que inicialice un array de 5 elementos enteros al
		 * azar entre 0 y 100. Debes conseguir que se desplacen los números un lugar a
		 * su derecha, de manera que el desplazamiento sea circular, si un número sale
		 * por la derecha volverá a entrar por la izquierda. Ejemplo: 1 2 3 4 5 pasa a
		 * ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
		 */

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
		}

		System.out.println();

		int aux = array[array.length - 1];

		for (int i = array.length - 1; i > 0; i--) {

			array[i] = array[i - 1];
		}

		array[0] = aux;

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		// A continuación 1 a la izquierda

//		int aux = array[0];
//
//		for (int i = 1; i < array.length; i++) {
//
//			array[i - 1] = array[i];
//		}
//
//		array[array.length - 1] = aux;
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}

		System.out.println();

	}

	private static void Ejercicio05() {

		/*
		 * Realiza un ejercicio igual al anterior, pero en el que el usuario pueda
		 * indicar la cantidad de posiciones que deseamos desplazar.
		 */

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
		}

		System.out.println();

		// Repetir el bucle tantas veces como quiera el usuario

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantas posiciones quieres desplazar: "));

		for (int j = 0; j < num; j++) {

			int aux = array[array.length - 1];

			for (int i = array.length - 1; i > 0; i--) {

				array[i] = array[i - 1];
			}

			array[0] = aux;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	private static void Ejercicio06() {

		/*
		 * Realiza un ejercicio igual al anterior, en el que el usuario también pueda
		 * deteminar la dirección del movimiento.
		 */

		int array[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			System.out.print(array[i] + " ");
		}

		int num = Integer.parseInt(JOptionPane
				.showInputDialog("Introduce hacia qué dirección quieres ir: " + "\n 1. Derecha" + "\n 2. Izquierda"));

		System.out.println();

		if (num == 1) {

			int numDer = Integer
					.parseInt(JOptionPane.showInputDialog("Introduce cuantas posiciones quieres desplazar: "));
			for (int j = 0; j < numDer; j++) {

				int aux = array[array.length - 1];

				for (int i = array.length - 1; i > 0; i--) {

					array[i] = array[i - 1];
				}

				array[0] = aux;

			}

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}

			System.out.println();
		} else {

			int numIzq = Integer
					.parseInt(JOptionPane.showInputDialog("Introduce cuantas posiciones quieres desplazar: "));

			for (int j = 0; j < numIzq; j++) {

				int aux = array[0];

				for (int i = 1; i < array.length; i++) {

					array[i - 1] = array[i];
				}

				array[array.length - 1] = aux;
			}

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		// Ejercicio01();
		// Ejercicio02();
		// Ejercicio03();
		// Ejercicio04();
		// Ejercicio05();
		Ejercicio06();

	}

}
