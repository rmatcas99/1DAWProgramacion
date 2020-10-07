package Capitulo3;

import javax.swing.JOptionPane;

public class Bloque01 {

	/**
	 * Realiza un programa que pida al usuario cuatro números enteros, y calcule la
	 * suma solo de aquellos números introducidos por el usuario, que sean mayores
	 * de 10. Es decir, que si el usuario introduce el 5, el 15, el 6 y el 25, el
	 * programa debe calcular la suma solo de 15 más 25, ya que 5 y 6 son menores de
	 * 10.
	 */
	private static void Ejercicio01() {

		int suma = 0;

		// Realizamos el bucle el cual nos va a pedir 4 números
		for (int i = 0; i < 4; i++) {

			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

			// Si los números son mayores de 10 lo sumará a nuestro contador
			if (num > 10) {
				suma += num;
			}
		}
		System.out.println(suma);
	}

	/*
	 * Modifica el ejercicio anterior de manera que, en lugar de que el programa
	 * siempre pida cuatro números, sea el usuario el que decida cuantos números se
	 * van a pedir.
	 */
	private static void Ejercicio02() {

		int suma = 0;
		int var = Integer.parseInt(JOptionPane.showInputDialog("Indica cuántos números se van a introducir: "));

		// Realizamos el bucle el cual nos va a pedir 4 números
		for (int i = 0; i < var; i++) {

			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

			// Si los números son mayores de 10 lo sumará a nuestro contador
			if (num > 10) {
				suma += num;
			}
		}
		System.out.println(suma);
	}

	/*
	 * Realiza un ejercicio que pida números al usuario, tantos como indique el
	 * usuario, al final debe aparecer cuantos números positivos y negativos se han
	 * introducido.
	 */
	private static void Ejercicio03() {

		int contNeg = 0, contPos = 0;
		int var = Integer.parseInt(JOptionPane.showInputDialog("Indica cuántos números se van a introducir: "));

		for (int i = 0; i < var; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

			if (num > 0) {
				contPos += 1;
			} else {
				contNeg += 1;
			}
		}
		System.out.println("Se han introducido " + contNeg + " números negativos y " + contPos + " números positivos");
	}

	public static void main(String[] args) {
		// Ejercicio01();
		// Ejercicio02();
		// Ejercicio03();
	}

}
