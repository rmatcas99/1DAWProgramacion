package métodos;

import javax.swing.JOptionPane;

public class Ejercicios {

	/*
	 * Método que reciba como parámetros de entrada tres valores enteros y uno
	 * flotante. El método se llamará "media" y debe devolver la media aritmética de
	 * los cuatro valores. El valor devuelto debe ser flotante. El método "main"
	 * debe llamar a este otro método, con valores inventados por ti, e imprimir el
	 * valor de la media en la consola de salida.
	 */

	public static float media(int num1, int num2, int num3, float num4) {
		float resultado = (num1 + num2 + num3 + num4) / 4;
		return resultado;
	}

	/*
	 * Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos
	 * valores enteros: un valor mínimo y un valor máximo. El método debe pedir un
	 * numero al usuario. El método examinará el número introducido por el usuario
	 * y, si dicho número no está entre el valor mínimo y el máximo que se ha
	 * indicado, seguirá pidiendo números al usuario hasta que se obtenga uno
	 * válido. Finalmente se debe devolver dicho valor del usuario al método main,
	 * que lo imprimirá en la consola.
	 */

	public static int obtenerEntreMinimoYMaximo(int Min, int Max) {
		int num = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		} while (num < Min || num > Max);

		return num;
	}

	/*
	 * Método llamado "maximo" que devuelva el valor máximo de dos números enteros
	 * recibidos como argumentos de entrada. El método main pedirá dos números al
	 * usuario y los enviará a este nuevo método. Finalmente imprimirá en consola el
	 * valor devuelto por el método.
	 */

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

	/*
	 * Método llamado "numeroImparEntreLimites" que devuelva un número entero
	 * aleatorio, impar y comprendido entre dos límites recibidos como parámetros de
	 * entrada. "main" debe llamar a este método e imprimir el valor devuelto.
	 */

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

	/*
	 * Realiza un método que reciba un valor entero, del 1 al 10, como argumento de
	 * entrada y devuelva un String, con dicho número escrito en palabras. Llama a
	 * este método "getStringFromEntero".
	 */

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

	/*
	 * Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros como
	 * argumentos de entrada. Debe imprimir dichos valores en orden de menor a
	 * mayor.
	 */

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

	/*
	 * La serie de Fibonacci es una serie numérica que comienza en los números 1, 1
	 * y continua de forma infinita, calculando cada mienbro de la serie como la
	 * suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza 1,
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un método llamado
	 * "fibonacci". Recibirá un argumento de entrada, de tipo entero. El método debe
	 * devolver un array con la serie de Fibonacci. El parámetro de entrada del
	 * método determinará la longitud del array a devolver. El método main recibirá
	 * el array y lo imprimirá en la consola.
	 */

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

	/*
	 * Método que imprima en pantalla un array, recibirá un array como parámetro de
	 * entrada y lo mostrará en consola. Main debe enviar el array al método,
	 * llamado "imprimeArray".
	 */

	public static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/*
	 * Método que "recorte" un array. El método recibirá un array, un "primerIndice"
	 * y un "ultimoIndice" y debe devolver un array, formado con los elementos del
	 * array recibido, cuyos índices estén dentro del intervalo cerrado formado por
	 * los dos índices recibidos.
	 */

	public static void recorte(int array[], int primer, int ultimo) {
		int diferencia = ultimo - primer;
		int recortado[] = new int[diferencia + 1];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		int aux = (array.length - 1) - ultimo;
		int x = (array.length - 1) - aux;
		for (int i = primer; i <= x; i++) {
			int j = 0;
			recortado[j] = array[i];
			System.out.print(recortado[j] + " ");
			j++;
		}
	}

	/*
	 * Método que muestre en pantalla los números del 1 al 100. El único requisito
	 * para esto es que debe hacerse utilizando la recursividad.
	 */

	public static void recursividad(int num) {
		if (num >= 1) {
			recursividad(num - 1);
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {

		// Ejercicio1
		System.out.println(media(5, 6, 7, 36.5f));

		// Ejercicio2
		int Min = Integer.parseInt(JOptionPane.showInputDialog("Introduce un mínimo: "));
		int Max = Integer.parseInt(JOptionPane.showInputDialog("Introduce un máximo: "));
		System.out.println(obtenerEntreMinimoYMaximo(Min, Max));

		// Ejercicio3
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
		System.out.println(maximo(num1, num2));

		// Ejercicio4
		int limInf = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite inferior: "));
		int limSup = Integer.parseInt(JOptionPane.showInputDialog("Introduce el límite superior: "));
		System.out.println(numeroImparEntreLimites(limInf, limSup));

		// Ejercicio5
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		System.out.println(getStringFromEntero(num));

		// Ejercicio6
		int num10 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
		int num20 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
		int num30 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
		imprimeMinimoAMaximo(num10, num20, num30);

		// Ejercicio7
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Determina la longitud del array: "));
		fibonacci(longitud);

		// Ejercicio8
		int array[] = new int[] { 3, 4, 5 };
		imprimeArray(array);

		// Ejercicio9
		int primerIndice = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer indice: "));
		int ultimoIndice = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ultimo indice: "));
		int array2[] = new int[10];
		recorte(array2, primerIndice, ultimoIndice);

		// Ejercicio10
		recursividad(100);

	}

}
