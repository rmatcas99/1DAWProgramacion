package métodos;

import javax.swing.JOptionPane;

public class Ejercicios {

	public static float media(int num1, int num2, int num3, float num4) {
		float resultado = (num1 + num2 + num3 + num4) / 4;
		return resultado;
	}

	public static int obtenerEntreMinimoYMaximo(int Min, int Max) {
		int num = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		} while (num < Min || num > Max);

		return num;
	}

	public static int maximo(int numero1, int numero2) {
		int max = 0;
		if (numero1 > numero2) {
			max = numero1;
			return max;
		} else {
			max = numero2;
		}
		return max;
	}

	public static int numeroImparEntreLimites(int limInf, int limSup) {
		boolean fin = false;
		int aux;
		do {
			aux = (int) Math.round(Math.random() * 100);
			if (aux > limInf && aux < limSup) {
				if (aux % 2 != 0) {
					fin = true;
					return aux;
				}
			}
		} while (fin = true);
		return aux;
	}

	public static String getStringFromEntero(int num) {
		String numero = "El número no está entre 1 y 10";
		switch (num) {
		case 1: {
			numero = "Uno";
			break;
		}
		case 2: {
			numero = "Dos";
			break;
		}
		case 3: {
			numero = "Tres";
			break;
		}
		case 4: {
			numero = "Cuatro";
			break;
		}
		case 5: {
			numero = "Cinco";
			break;
		}
		case 6: {
			numero = "Seis";
			break;
		}
		case 7: {
			numero = "Siete";
			break;
		}
		case 8: {
			numero = "Ocho";
			break;
		}
		case 9: {
			numero = "Nueve";
			break;
		}
		case 10: {
			numero = "Diez";
			break;
		}
		}
		return numero;
	}

	public static void imprimeMinimoAMaximo(int num, int num2, int num3) {
		int pequeño = 0, mediano = 0, grande = 0;

		if (num < num2 && num < num3) {
			if (num2 < num3) {
				pequeño = num;
				mediano = num2;
				grande = num3;
			} else {
				pequeño = num;
				mediano = num3;
				grande = num2;
			}
		}
		if (num2 < num && num2 < num3) {
			if (num < num3) {
				pequeño = num2;
				mediano = num;
				grande = num3;
			} else {
				pequeño = num2;
				mediano = num3;
				grande = num;
			}
		}
		if (num3 < num2 && num3 < num) {
			if (num < num2) {
				pequeño = num3;
				mediano = num;
				grande = num2;
			} else {
				pequeño = num3;
				mediano = num2;
				grande = num;
			}
		}

		System.out.println(pequeño + " " + mediano + " " + grande);
	}

	public static void fibonacci(int num) {
		int array[] = new int[num];

		for (int i = 2; i < array.length; i++) {
			// Asignamos como ayuda a las dos primeras posiciones el valor 1
			array[0] = 1;
			array[1] = 1;
			// Hacemos la sucesión
			array[i] = array[i - 2] + array[i - 1];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void recursividad(int num) {
		if (num >= 1) {
			recursividad(num - 1);
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {

		// Ejercicio1
		// System.out.println(media(5, 6, 7, 36.5f));

		// Ejercicio2
//		int Min = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mínimo: "));
//		int Max = Integer.parseInt(JOptionPane.showInputDialog("Introduce un máximo: "));
//		System.out.println(obtenerEntreMinimoYMaximo(Min, Max));

		// Ejercicio3
//		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
//		System.out.println(maximo(num1, num2));

		// Ejercicio4
//		int limInf = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite inferior: "));
//		int limSup = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite superior: "));
//		System.out.println(numeroImparEntreLimites(limInf, limSup));

		// Ejercicio5
//		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
//		System.out.println(getStringFromEntero(num));

		// Ejercicio6
//		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
//		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
//		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
//		imprimeMinimoAMaximo(num, num2, num3);

		// Ejercicio7
//		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Determina la longitud del array: "));
//		fibonacci(longitud);

		// Ejercicio8
//		int array[] = new int[] {3, 4, 5};
//		imprimeArray(array);

		// Ejercicio9

		// Ejercicio10
		recursividad(100);

	}

}
