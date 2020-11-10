package capitulo5;

import javax.swing.JOptionPane;

public class Bloque01 {

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre 0 y 100. Debes mostrar el array en pantalla y obtener la suma, la
	 * media, el menor y el mayor de todos los números que aparecen en el array.
	 */

	private static void Ejercicio00() {
		int suma = 0, media = 0;
		int numMenor = 100;
		int numMayor = 0;
		int array[] = new int[150];
		for (int i = 0; i < array.length; i++) {
			int aux = (int) Math.round(Math.random() * 100);

			System.out.println(array[i] = aux);
			suma = suma + array[i];
			media = suma / 150;
			if (array[i] < numMenor) {
				numMenor = array[i];
			} else {
				if (array[i] > numMayor) {
					numMayor = array[i];
				}
			}
		}
		System.out.println("El numero mayor es = " + numMayor + "" + "\n El numero menor es = " + numMenor + ""
				+ "\n La suma es = " + suma + "" + "\n La media es = " + media);
	}

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre un límite inferior y uno superior que debe especificar el usuario.
	 * Debes mostrar el array en pantalla para comprobar el funcionamiento
	 */

	private static void Ejercicio01() {
		int limSup = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite superior: "));
		int limInf = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite inferior: "));
		int array[] = new int[150];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (limSup - limInf) + limInf);
			System.out.print(array[i] + " ");
		}
	}

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre 0 y 100. Después de su inicialización debéis imprimir el array en orden
	 * inverso.
	 */

	private static void Ejercicio02() {
		int array[] = new int[150];

		for (int i = array.length - 1; i > 0; i--) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.println(array[i]);
		}
	}

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre 0 y 100. A continuación pedirás al usuario un valor y buscarás dicho
	 * valor en el array. Si lo encuentras, debes indicar al usuario la posición del
	 * array en que se encuenta. En caso de que no encuentres el valor buscado,
	 * debes indicárselo también al usuario.
	 */

	private static void Ejercicio03() {
		int array[] = new int[150];
		int cont = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			if (num == array[i]) {
				System.out.println(i);
				cont += 1;
			}
		}

		while (cont == 0) {
			System.out.println("No se encuentra el valor introducido en el array");
			cont += 1;
		}
	}

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre 0 y 100. Debes obtener la suma de los números pares y los impares en
	 * variables separadas.
	 */

	private static void Ejercicio04() {
		int array[] = new int[150];
		int numPar = 0;
		int numImpar = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			if (array[i] % 2 == 0) {
				numPar += array[i];
			} else {
				numImpar += array[i];
			}
		}

		System.out.println("La suma de los números pares es " + numPar + ", la suma de los impares es " + numImpar);
	}

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre 0 y 100. Debes mostrar al usuario la suma de los elementos cuyo índice
	 * sea par.
	 */

	private static void Ejercicio05() {
		int array[] = new int[150];
		int numPar = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);

			if (array[i] % 2 == 0) {
				numPar += array[i];
			}
		}
		
		System.out.println("La suma de los números pares es " + numPar);
	}

	public static void main(String[] args) {
		// Ejercicio00();
		 Ejercicio01();
		// Ejercicio02();
		// Ejercicio03();
		// Ejercicio04();
		// Ejercicio05();

	}

}
