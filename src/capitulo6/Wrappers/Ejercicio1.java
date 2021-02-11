package capitulo6.Wrappers;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Realizar un programa que imprima una tabla con los límites máximo y mínimo
		// representables para los diferentes tipos primitivos en Java (byte, int,
		// short, long, float, double). En la tabla también deberá aparecer el número de
		// bytes que cada tipo usa para su representación.
		
		System.out.println("Valor máximo para un Byte: " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo para un Byte: " + Byte.MIN_VALUE);
		System.out.println("\nValor máximo para un Integer: " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo para un Integer: " + Integer.MIN_VALUE);
		System.out.println("\nValor máximo para un Short: " + Short.MAX_VALUE);
		System.out.println("Valor mínimo para un Short: " + Short.MIN_VALUE);
		System.out.println("\nValor máximo para un Long: " + Long.MAX_VALUE);
		System.out.println("Valor mínimo para un Long: " + Long.MIN_VALUE);
		System.out.println("\nValor máximo para un Float: " + Float.MAX_VALUE);
		System.out.println("Valor mínimo para un Float: " + Float.MIN_VALUE);
		System.out.println("\nValor máximo para un Double: " + Double.MAX_VALUE);
		System.out.println("Valor mínimo para un Double: " + Double.MIN_VALUE);
	}

}
