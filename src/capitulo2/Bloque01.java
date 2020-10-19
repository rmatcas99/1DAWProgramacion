package capitulo2;

import javax.swing.JOptionPane;

public class Bloque01 {

	private static void Ejercicio01() {

		/*
		 * Realiza un ejercicio que pida dos variables al usuario, tras lo cual, muestre
		 * en pantalla el número mayor de los dos introducidos.
		 */

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num2 = Float.parseFloat(cad);

		if (num1 > num2) {
			System.out.println("El primer número es el mayor: " + num1);
		} else {
			System.out.println("El segundo número es el mayor: " + num2);
		}

	}

	private static void Ejercicio02() {

		// Repetir el ejercicio anterior para mostrar el número menor de los dos
		// introducidos.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce otro número: ");
		float num2 = Float.parseFloat(cad);

		if (num1 < num2) {
			System.out.println("El número menor es: " + num1);
		} else {
			System.out.println("El número menor es: " + num2);
		}

	}

	private static void Ejercicio03() {

		// Realizar un ejercicio en C que pida un número al usuario e
		// indique en pantalla si se trata de un número par o impar.
		// Recuerda que un número par es aquel cuyo resto de su división
		// entre dos sea siempre cero, y recuerda que un número impar es
		// aquel cuyo resto de su división entre dos sea siempre uno.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num1 = Integer.parseInt(cad);
		int resto = num1 % 2;

		if (resto == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}

	private static void Ejercicio04() {

		// Repetir el ejercicio 3º de este bloque de ejercicios,
		// pero mostrando el menor valor de los cinco introducidos por el usuario.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num2 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num3 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num4 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num5 = Float.parseFloat(cad);

		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("El número mayor es : " + num1);
		}
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("El número mayor es : " + num2);
		}
		if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.println("El número mayor es : " + num3);
		}
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			System.out.println("El número mayor es : " + num4);
		}
		if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
			System.out.println("El número mayor es : " + num5);
		}

	}

	private static void Ejercicio05() {

		// Pedir al usuario cinco números, e imprimir posteriormente el mayor valor
		// introducido y el menor valor introducido.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un primer número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un segundo número: ");
		float num2 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un tercer número: ");
		float num3 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un cuarto número: ");
		float num4 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un quinto número: ");
		float num5 = Float.parseFloat(cad);

		// Mayor
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("El número mayor es: " + num1);
		}

		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("El número mayor es: " + num2);
		}

		if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) {
			System.out.println("El número mayor es: " + num3);
		}

		if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {
			System.out.println("El número mayor es: " + num4);
		}

		if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1) {
			System.out.println("El número mayor es: " + num5);
		}

		// Menor
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("El número menor es: " + num1);
		}

		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("El número menor es: " + num2);
		}

		if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
			System.out.println("El número menor es: " + num3);
		}

		if (num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
			System.out.println("El número menor es: " + num4);
		}

		if (num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
			System.out.println("El número menor es: " + num5);
		}

	}

	private static void Ejercicio06() {

		// Realizar un ejercicio en C que pida un número al usuario e
		// indique en pantalla si se trata de un número par o impar.
		// Recuerda que un número par es aquel cuyo resto de su división
		// entre dos sea siempre cero, y recuerda que un número impar es
		// aquel cuyo resto de su división entre dos sea siempre uno.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num1 = Integer.parseInt(cad);
		int resto = num1 % 2;

		if (resto == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}

	public static void main(String[] args) {
		Ejercicio01();
		Ejercicio02();
		Ejercicio03();
		Ejercicio04();
		Ejercicio05();
		Ejercicio06();
	}

}
