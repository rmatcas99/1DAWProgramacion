package capitulo5;

public class Bloque02 {

	/*
	 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar
	 * entre -100 y 100. Debes conseguir que todos los números pares del array
	 * cambien de signo, los positivos deben pasar a negativos y viceversa.
	 */

	private static void Ejercicio01() {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * (100 - -100) + -100);
			System.out.print(" " + array[i]);			
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < array.length; i ++) { 
			
			if (array[i] % 2 == 0) {
				array[i] = array[i] * -1;
			}
			System.out.print(" " + array[i]);
		}
			
	}

	public static void main(String[] args) {
		Ejercicio01();

	}

}
