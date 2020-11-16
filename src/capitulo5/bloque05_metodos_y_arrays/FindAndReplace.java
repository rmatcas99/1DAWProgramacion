package capitulo5.bloque05_metodos_y_arrays;

public class FindAndReplace {

	public static void main(String[] args) {
		/*
		 * Un método llamado "findAndReplace", que reciba: - Un array de números
		 * enteros. - Un valor entero que debe buscarse en el array. - Un valor entero
		 * que debe servir para reemplazar.
		 * 
		 * El método buscará todas las ocasiones en las que el segundo parámetro
		 * aparezca dentro del array y reemplazará ese valor con el valor del tercer
		 * parámetro. El método main debe crear un array, imprimirlo en consola, llamar
		 * al método "findAndReplace" y volver a imprimir el array en consola.
		 */

		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
			System.out.print(array[i] + " ");
		}

		System.out.println();

		int buscar = (int) Math.round(Math.random() * 10);
		int reemplazar = (int) Math.round(Math.random() * 10);
		
		System.out.println();
		
		System.out.println("El número a buscar es: " + buscar);
		System.out.println("El número que remplazará será el: " + reemplazar);
		
		System.out.println();

		findAndReplace(array,buscar,reemplazar);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	public static void findAndReplace(int array[], int buscar, int reemplazar) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == buscar) {
				array[i] = reemplazar;
		}
	}

}

}
