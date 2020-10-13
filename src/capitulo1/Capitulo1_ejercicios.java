package capitulo1;

import javax.swing.JOptionPane;

public class Capitulo1_ejercicios {

	private static void Ejercicio01() {

		// Realiza un programa que pida al usuario tres números: uno de tipo entero,
		// otro de tipo flotante y otro de tipo doble. A continuación se tienen que
		// mostrar en pantalla los tres números en una sola fila de la consola de
		// salida.

		String numEntero;
		numEntero = JOptionPane.showInputDialog("Introduce un número entero: ");
		String numFlotante;
		numFlotante = JOptionPane.showInputDialog("Introduce un número flotante: ");
		String numDouble;
		numDouble = JOptionPane.showInputDialog("Introduce un número double: ");

		System.out.println("El numero entero es : " + numEntero + "\nEl numero flotante es : " + numFlotante
				+ "\nEl numero double es : " + numDouble);

	}

	private static void Ejercicio02() {
		// Realiza un programa igual al anterior, con la particularidad de que ahora
		// se debe mostrar cada número justo a continuación del momento en que ha sido
		// introducido.

		String numEntero;
		numEntero = JOptionPane.showInputDialog("Introduce un número entero: ");
		String numFlotante;
		numFlotante = JOptionPane.showInputDialog("Introduce un número flotante: ");
		String numDouble;
		numDouble = JOptionPane.showInputDialog("Introduce un número double: ");

		System.out.println("El numero entero es : " + numEntero + ", El numero flotante es : " + numFlotante
				+ ", El numero double es : " + numDouble);
	}

	private static void Ejercicio03() {
		// Realiza un programa que pida al usuario tres números y calcule y muestre en
		// pantalla la suma de los tres.

		String cad;
		cad = JOptionPane.showInputDialog("Introdce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introdce un segundo número: ");
		float num2 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introdce un tercer número: ");
		float num3 = Float.parseFloat(cad);

		float suma = num1 + num2 + num3;
		System.out.println("La suma de los tres números es: " + suma);
	}

	private static void Ejercicio04() {
		// Realiza un programa que muestre la media de tres números introducidos.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un segundo número: ");
		float num2 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un tercer número: ");
		float num3 = Float.parseFloat(cad);

		float suma = num1 + num2 + num3;
		float media = suma / 3;

		System.out.println("El primer número introducido es: " + num1);
		System.out.println("El segundo número introducido es: " + num2);
		System.out.println("El tercer número introducido es: " + num3);

		System.out.println("La media es: " + media);
	}

	private static void Ejercicio05() {
		// Realiza un programa en C que pida dos variables al usuario,
		// intercambie los valores de las dos variables y las muestre en pantalla
		// ANTES y DESPUéS del intercambio de valores.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce otro número: ");
		float num2 = Float.parseFloat(cad);

		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);

		float aux = num1;
		num1 = num2;
		num2 = aux;

		System.out.println("Se han cambiado los número");
		System.out.println("El primer número es: " + num1);
		System.out.println("El segundo número es: " + num2);
	}

	private static void Ejercicio06() {
		// Realiza un ejercicio en C para el cálculo de la cuota mensual de una hipóteca
		// (tema tan importante hoy día)

		// Se deben pedir al usuario los datos de Euribor (float), Diferencial (float),
		// Capital (float) y Número de plazos
		// mensuales para pagar la hipoteca (int). A partir de esos datos se debe
		// calcular y mostrar al usuario el importe
		// de la cuota mensual.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce el valor del Euribor: ");
		float euribor = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce el valor del Diferencial: ");
		float diferencial = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce el valor del Capital: ");
		float capital = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce el valor del Número de plazos mensuales para pagar la hipoteca: ");
		int numPlazosMensuales = Integer.parseInt(cad);

		float interesAnual = euribor + diferencial;

		float interesMensual = (interesAnual / 12) / 100;

		// var_ayuda va a tener el valor de (1 + InteresMensual) elevado a
		// numPlazosMensuales

		float var_ayuda = (float) Math.pow((1 + interesMensual), numPlazosMensuales);

		float numerador = interesMensual * var_ayuda;
		float denominador = var_ayuda - 1;

		float cuotaMensual = capital * (numerador / denominador);

		System.out.println("El valor de la Cuota Mensual es: " + cuotaMensual);
	}

	private static void Ejercicio07() {

	}

	private static void Ejercicio08() {
		// Realiza un programa en C que pida al usuario tres números enteros,
		// y localice e imprima en pantalla el mayor y el menor de los tres
		// introducidos.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce el primer número: ");
		int num1 = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog("Introduce un segundo número: ");
		int num2 = Integer.parseInt(cad);
		cad = JOptionPane.showInputDialog("Introduce un tercer número: ");
		int num3 = Integer.parseInt(cad);

		if (num1 > num2 && num1 > num3) {
			System.out.println("El mayor es: " + num1);

			if (num2 > num3) {
				System.out.println("El menor es: " + num3);
			} else {
				System.out.println("El menor es: " + num2);
			}
		}

		if (num2 > num1 && num2 > num3) {
			System.out.println("El mayor es: " + num2);

			if (num1 > num3) {
				System.out.println("El menor es: " + num3);
			} else {
				System.out.println("El menor es: " + num1);
			}
		}

		if (num3 > num1 && num3 > num2) {
			System.out.println("El mayor es: " + num3);

			if (num2 > num1) {
				System.out.println("El menor es: " + num1);
			} else {
				System.out.println("El menor es: " + num2);
			}
		}
	}

	public static void main(String[] args) {
		Ejercicio01();
		Ejercicio02();
		Ejercicio03();
		Ejercicio04();
		Ejercicio05();
		Ejercicio06();
		Ejercicio07();
		Ejercicio08();
	}

}
