package capitulo5.bloque05_metodos_y_arrays;

public class CountOccurrences {

	public static void main(String[] args) {
		/*
		 * Realiza un método llamado "countOccurrences", que reciba: - Un array de
		 * números enteros. - Un valor entero. El método debe devolver un valor entero,
		 * que corresponda con el número de veces que el valor entero recibido como
		 * segundo parámetro exista dentro del array recibido como primer parámetro.
		 */

		int array[] = new int[20];

		int num = (int) Math.round(Math.random() * 10);
		System.out.println("El número que se va a contar cuántas veces aparece es: " + num);
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		int veces = countOccurrences(array, num);

		System.out.println();

		System.out.println("Las veces repetidas el número pasado en el array son: " + veces);
	}

	public static int countOccurrences(int array[], int num) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				count++;
			}
		}

		return count;
	}

}
