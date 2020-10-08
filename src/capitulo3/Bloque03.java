package capitulo3;

import javax.swing.JOptionPane;

public class Bloque03 {

	/*
	 * Realiza un ejercicio que pida números al usuario. El programa debe detenerse
	 * cuando el usuario introduzca el número 0 (cero), que no debe tenerse en
	 * cuenta para ninguna operación aritmética, simplemente para salir de la
	 * aplicación. Cuando el programa haya terminado, se debe sacar en pantalla el
	 * valor de la suma de todos los números.
	 */

	private static void Ejercicio01() {
		int suma = 0;
		int num;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
			suma += num;
		} while (num != 0);

		System.out.println("El valor de la suma de todos los números es: " + suma);
	}

	/*
	 * Realiza un ejercicio igual al anterior, con la particularidad de imprimir la
	 * media al final del ejercicio, no la suma.
	 */

	private static void Ejercicio02() {
		int num, suma = 0, cont = 0;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
			suma += num;
			cont += 1;
		} while (num != 0);

		System.out.println("El valor de la media de todos los números es: " + suma / cont);

	}

	/*
	 * Realiza un ejercicio que pida números al usuario hasta que este introduzca el
	 * 0 (cero). Al finalizar el ejercicio se debe imprimir en pantalla el valor
	 * mayor introducido. El valor 0 (cero) no debe tenerse en cuenta.
	 */

	private static void Ejercicio03() {
		int num;
		int mayor = 0;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

			if (num > mayor) {
				mayor = num;
			}
		} while (num != 0);

		System.out.println("El mayor de los numeros introducidos es: " + mayor);
	}

	/*
	 * Realiza un ejercicio que pida números al usuario hasta que este introduzca el
	 * 0 (cero). Al finalizar el ejercicio se debe imprimir en pantalla el valor
	 * menor introducido. El valor 0 (cero) no debe tenerse en cuenta.
	 */

	private static void Ejercicio04() {
		int num;
		int menor = 0;

		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

			if (num != 0) {

				if (num < menor) {
					menor = num;
				}

			}
		} while (num != 0);

		System.out.println("El menor de los numeros introducidos es: " + menor);
	}

	/*
	 * Realiza un ejercicio parecido a los dos anteriores, dónde se imprima el mayor
	 * valor y el menor de todos los introducidos.
	 */

	private static void Ejercicio05() {
		int num = -1;
		int mayor = 0, menor = 0;
		boolean valorMenor = true;

		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

			if (valorMenor == true) {
				menor = num;
				valorMenor = false;
			}

			if (num > mayor) {
				mayor = num;
			}

			if (menor < num && num != 0) {
				menor = num;
			}
		}

		System.out.println("El valor mayor es " + mayor + ", el menor es " + menor);
	}

	/*
	 * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea
	 * 0 (cero). Para cada número introducido se debe mostrar en pantalla su tabla
	 * de multiplicar, desde el 0 (cero) hasta el 10.
	 */

	private static void Ejercicio06() {
		int num = -1;
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
			System.out.println("0 * " + num + " = " + 0 * num);
			System.out.println("1 * " + num + " = " + 1 * num);
			System.out.println("2 * " + num + " = " + 2 * num);
			System.out.println("3 * " + num + " = " + 3 * num);
			System.out.println("4 * " + num + " = " + 4 * num);
			System.out.println("5 * " + num + " = " + 5 * num);
			System.out.println("6 * " + num + " = " + 6 * num);
			System.out.println("7 * " + num + " = " + 7 * num);
			System.out.println("8 * " + num + " = " + 8 * num);
			System.out.println("9 * " + num + " = " + 9 * num);
			System.out.println("10 * " + num + " = " + 10 * num);
		}
	}

	/*
	 * Realiza un ejercicio que pida números al usuario, hasta que uno de ellos sea
	 * 0 (cero). Al finalizar se debe imprimir en pantalla cuantos son positivos y
	 * cuantos negativos. No debes tener en cuenta el 0 (cero).
	 */
	
	private static void Ejercicio07() {
		int num = -1;
		int numPos = 0, numNeg = 0;
		
		while (num != 0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));
			if (num > 0) {
				numPos += 1;
			}
			
			if (0 < num) {
				numNeg += 1;
			}
		}
		System.out.println("Se han introducido " + numPos + " positivos y " + numNeg + " negativos");
	}

	public static void main(String[] args) {
		// Ejercicio01();
		// Ejercicio02();
		// Ejercicio03();
		// Ejercicio04();
		// Ejercicio05();
		// Ejercicio06();
		// Ejercicio07();
	}

}
