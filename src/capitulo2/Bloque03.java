package capitulo2;

import javax.swing.JOptionPane;

public class Bloque03 {

	private static void Ejercicio01() {

		// Realiza un ejercicio que califique la nota obtenida por un alumno/a en un
		// examen.
		// El ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla
		// su
		// traducción a nota de texto: muy deficiente, insuficiente, suficiente, bien,
		// notable
		// y sobresaliente. Debes realizar el ejercicio a través de una sentencia
		// switch, no de if anidados.

		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int nota = Integer.parseInt(cad);

		switch (nota) {
		case 1:
			System.out.println("La nota es un " + nota + ": Muy deficiente");
			break;

		case 2:
			System.out.println("La nota es un " + nota + ": Muy deficiente");
			break;

		case 3:
			System.out.println("La nota es un " + nota + ": Insuficiente");
			break;

		case 4:
			System.out.println("La nota es un " + nota + ": Insuficiente");
			break;

		case 5:
			System.out.println("La nota es un " + nota + ": Suficiente");
			break;

		case 6:
			System.out.println("La nota es un " + nota + ": Bien");
			break;

		case 7:
			System.out.println("La nota es un " + nota + ": Notable");
			break;

		case 8:
			System.out.println("La nota es un " + nota + ": Notable");
			break;

		case 9:
			System.out.println("La nota es un " + nota + ": Sobresaliente");
			break;

		case 10:
			System.out.println("La nota es un " + nota + ": Sobresaliente");
			break;
		}

	}

	private static void Ejercicio02() {

		// Realiza una calculadora avanzada, pero con la particularidad de que las
		// operaciones deben ser raices, potencias y el módulo de la división.

		String cad;

		// Creamos el Menú de nuestra calculadora
		cad = JOptionPane.showInputDialog(
				"Menú de la calculadora: \n" + "1. Raíz \n" + "2. Potencia \n" + "3. Módulo de división \n");
		int var = Integer.parseInt(cad);

		switch (var) {

		// Raiz
		case 1:
			String cad1;
			cad1 = JOptionPane.showInputDialog("Introduce el radicando: ");
			float radicando = Float.parseFloat(cad1);
			cad1 = JOptionPane.showInputDialog("Introduce el indice: ");
			float indice = Float.parseFloat(cad1);

			float resultado = 1 / indice;
			float raiz = (float) Math.pow(radicando, resultado);

			System.out.println("El resultado de la Raiz de " + radicando + " de índice " + indice + " es: " + raiz);
			break;

		// Potencia
		case 2:
			cad1 = JOptionPane.showInputDialog("Introduce el base: ");
			int base = Integer.parseInt(cad1);
			cad1 = JOptionPane.showInputDialog("Introduce el exponente: ");
			int exponente = Integer.parseInt(cad1);

			int potencia = (int) Math.pow(base, exponente);
			System.out.println("El resultado de la potencia es: " + potencia);
			break;

		// Módulo de división
		case 3:
			cad1 = JOptionPane.showInputDialog("Introduce el dividendo: ");
			int dividendo = Integer.parseInt(cad1);
			cad1 = JOptionPane.showInputDialog("Introduce el divisor: ");
			int divisor = Integer.parseInt(cad1);

			int division = dividendo % divisor;
			System.out.println("El resultado del módulo: " + division);
			break;
		}

	}

	private static void Ejercicio03() {

		// Realiza un programa que resuelva lo siguientes puntos:
		/*
		 * Que muestre un menú en pantalla con opciones para: 1. Cálculo de la
		 * hipotenusa de un triángulo. 2. Cálculo de la superficie de una
		 * circunferencia. 3. Cálculo del perímetro de una circunferencia. 4. Cálculo
		 * del área de un rectángulo. 5. Cálculo del área de un triángulo. 0. Salir de
		 * la aplicación.
		 */

		String cad;

		// Creamos el Menú de nuestro programa
		cad = JOptionPane.showInputDialog("Menú del programa: \n" + "1. Cálculo de la hipotenusa de un triángulo \n"
				+ "2. Cálculo de la superficie de un círculo \n" + "3. Cálculo del perímetro de una circunferencia \n"
				+ "4. Cálculo del área de un rectángulo \n" + "5. Cálculo del área de un triánulo \n"
				+ "0. Salir de la aplicación");
		int var = Integer.parseInt(cad);

		switch (var) {
		case 1:
			cad = JOptionPane.showInputDialog("Introduce el valor de un cateto: ");
			float cateto = Float.parseFloat(cad);
			cad = JOptionPane.showInputDialog("Introduce el valor de otro cateto: ");
			float cateto2 = Float.parseFloat(cad);

			float hipotenusa = (float) Math.pow(cateto, 2) + (float) Math.pow(cateto2, 2);
			System.out.println("El valor de la hipotenusa es: " + Math.pow(hipotenusa, 2));
			break;

		case 2:
			cad = JOptionPane.showInputDialog("Introduce el valor del radio: ");
			float radio = Float.parseFloat(cad);

			float area = (float) Math.PI * (float) Math.pow(radio, 2);
			System.out.println("El área del círculo es: " + area);
			break;

		case 3:
			cad = JOptionPane.showInputDialog("Introduce el valor del radio: ");
			radio = Float.parseFloat(cad);

			float perimetro = (float) Math.PI * radio * 2;
			System.out.println("El área del círculo es: " + perimetro);
			break;

		case 4:
			cad = JOptionPane.showInputDialog("Introduce el valor de la base: ");
			float base = Float.parseFloat(cad);
			cad = JOptionPane.showInputDialog("Introduce el valor de la altura: ");
			float altura = Float.parseFloat(cad);

			System.out.println("El valor del área del rectángulo es : " + base * altura);
			break;

		case 5:
			cad = JOptionPane.showInputDialog("Introduce el valor de la base: ");
			base = Float.parseFloat(cad);
			cad = JOptionPane.showInputDialog("Introduce el valor de la altura: ");
			altura = Float.parseFloat(cad);

			System.out.println("El valor del área del rectángulo es : " + (base * altura) / 2);
			break;

		case 0:
			break;
		}

	}

	public static void main(String[] args) {
		Ejercicio01();
		Ejercicio02();
		Ejercicio03();

	}

}
