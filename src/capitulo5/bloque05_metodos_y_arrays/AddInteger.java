package capitulo5.bloque05_metodos_y_arrays;

public class AddInteger {

	public static void main(String[] args) {

		/*
		 * Realiza un método llamado "addInteger", que reciba: 
		 * - Un array de números enteros. 
		 * - Un valor entero.
		 * 
		 * Dentro del método debes:
		 * 
		 * - Crear un nuevo array, cuya longitud sea la del array recibido como primer
		 * parámetro + 1. 
		 * - Copiar el array del primer parámetro en el array creado dentro del método, 
		 * elemento tras elemento. 
		 * - Agregar el nuevo elemento al final del nuevo array. 
		 * - Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo 
		 * array creado en el interior del método. 
		 * - El método debe devolver un array de tipo entero. Main debe recoger el array
		 * devuelto e imprimirlo en consola.
		 */
		
		int array[] = new int[5];
		
		int num = (int) Math.round(Math.random() * 10);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("El valor último será: " + num);
		
		array = addInteger(array, num);
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static int[] addInteger(int array[], int num) {
		int ampliado[] = new int[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			ampliado[i] = array[i];
		}
		
		ampliado[ampliado.length - 1] = num;
		
		return ampliado;
	}

}
