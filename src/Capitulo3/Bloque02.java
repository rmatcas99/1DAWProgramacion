package Capitulo3;

import javax.swing.JOptionPane;

public class Bloque02 {

	/*
	 * Media de una cantidad de números introducidos por el usuario. El usuario
	 * especificará una cantidad de números, tras lo cual se le deben pedir tantos
	 * como este haya indicado. Al final se debe imprimir la media.
	 */

	private static void Ejercicio01() {
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos valores se van a introducir: "));
		int total = 0;
		for (int i = 0; i < var; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor "));
			total += num;
		}

		System.out.println("La media de los números introducidos es: " + total / var);
	}

	/*
	 * Mayor y menor de una cantidad de números dada por el usuario. El usuario
	 * introducirá una cantidad de números, tras lo cual se le deben pedir tantos
	 * como este haya indicado. Al final se debe imprimir el mayor y el menor de
	 * todos los introducidos.
	 */

	private static void Ejercicio02() {
		int mayor = 0, menor = 0;
		int var = Integer.parseInt(JOptionPane.showInputDialog("Introduce cuantos valores se van a introducir: "));

		for (int i = 0; i < var; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor: "));

			if (i == 0) {
				mayor = num;
				menor = num;
			} else {
				if (num > mayor) {
					mayor = num;
				}
				if (num < menor) {
					menor = num;
				}
			}

		}
		System.out.println("El número mayor de los introducidos es: " + mayor + " y el menor: " + menor);
	}

	/*
	 * Ejercicio que obtenga todos los múltiplos de un número introducido por el
	 * usuario. Se imprimirán todos los múltiplos menores de 100, este será el
	 * límite.
	 */

	private static void Ejercicio03() {
		int var = Integer.parseInt(
				JOptionPane.showInputDialog("Introduce un valor el cual se calcularan sus multiplos hasta el 100"));
		for (int i = 0; i < 100; i++) {
			if (i % var == 0) {
				System.out.println(i);
			}
		}
	}

	/*
	 * Reforma el ejercicio anterior, para que el límite sea también introducido por
	 * el usuario.
	 */

	private static void Ejercicio04() {
		int tope = Integer.parseInt(JOptionPane.showInputDialog("Introduce un tope: "));
		int var = Integer.parseInt(
				JOptionPane.showInputDialog("Introduce un valor el cual se calcularan sus multiplos hasta el " + tope));
		
		for (int i = 0; i < tope; i++) {
			if (i % var == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// Ejercicio01();
		// Ejercicio02();
		// Ejercicio03();
		// Ejercicio04();
	}

}
