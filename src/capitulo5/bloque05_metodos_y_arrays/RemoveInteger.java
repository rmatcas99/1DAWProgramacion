package capitulo5.bloque05_metodos_y_arrays;

public class RemoveInteger {

	public static void main(String[] args) {
		/*
		 * Realiza un método llamado "removeInteger", que reciba: - Un array de números
		 * enteros. - Un valor entero. Si el valor entero recibido como segundo
		 * parámetro existe dentro del array recibido como primer parámetro, debes
		 * conseguir que ese valor desaparezca del array. Puedes seguir la siguiente
		 * guía: - Utiliza el método del ejercicio 4 para saber cuántas veces aparece el
		 * valor entero (segundo parámetro) dentro del array (primer parámetro). - Crea
		 * un nuevo array, que tenga la dimensión del array recibido como primer
		 * parámetro menos la cantidad de veces que el valor entero del segundo
		 * parámetro aparezca en dicho array. - Copia todos los elementos del array
		 * recibido como primer parámetro, dentro del nuevo array creado por ti en el
		 * método. Lógicamente no debes copiar en el array los valores del primer array
		 * que coincidan con el valor introducido como segundo parámetro. - Devuelve el
		 * nuevo array. El método debe devolver "int[]". El método main debe recoger el
		 * nuevo array creado e imprimir en consola.
		 */

		int array[] = new int[10];

		int num = (int) Math.round(Math.random() * 10);
		System.out.println("El número que se va a eliminar es: " + num);
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		array = removeInteger(array, num);
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static int[] removeInteger(int array[], int num) {
		int veces = CountOccurrences.countOccurrences(array, num);

		int remove[] = new int[array.length - veces];

		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				aux++;
			} else {
				remove[i - aux] = array[i];
			}
		}

		return remove;
	}

}
