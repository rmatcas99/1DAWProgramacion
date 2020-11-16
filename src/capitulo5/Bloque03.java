package capitulo5;

public class Bloque03 {

	private static void Burbuja() {

		int array[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 20);

			System.out.print(array[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < (array.length - 1); i++) {
			if (array[i] > array[i + 1]) {
				int aux = array[i + 1];
				array[i + 1] = array[i];
				array[i] = aux;
			}
		}
	}

	public static void main(String[] args) {
		Burbuja();

	}

}
