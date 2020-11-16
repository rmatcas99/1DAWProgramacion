package capitulo5.bloque05_metodos_y_arrays;

public class StringFromArray {

	public static void main(String[] args) {
		/*
		 * Un método llamado "stringFromArray", que reciba un array de números enteros y
		 * devuelva una cadena de caracteres. El método debe recorrer el array, de la
		 * misma forma en la que harías para mostrarlo en consola, pero en lugar de
		 * imprimir en consola debes construir un objeto String. Finalmente debes
		 * devolver el String e imprimirlo en el método "main".
		 */
		
		int array[] = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 40);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		System.out.println(stringFromArray(array));

	}
	
	public static String stringFromArray(int array[]) {
		String str = "";
		
		for (int i = 0; i < array.length; i++) {
			str += array[i] + " ";
		}
		
		return str;
	}

}
