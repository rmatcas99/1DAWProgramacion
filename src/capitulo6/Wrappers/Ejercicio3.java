package capitulo6.Wrappers;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Realizar un programa que imprima los 100 primeros números enteros en código
		// hexadecimal.

		int[] num = new int[100];
		for (int i = 1; i <= num.length; i++) {
			String hex = Integer.toHexString(i);
			System.out.println("El valor hexadesimal de " + i + " es: " + hex);
		}

	}

}
