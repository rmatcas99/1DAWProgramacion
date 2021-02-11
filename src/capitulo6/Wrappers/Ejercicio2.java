package capitulo6.Wrappers;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Crear un programa que pida al usuario una contraseña con los siguientes
		// requisitos:
		// - Al menos una mayúscula.
		// - Al menos una minúscula.
		// - Al menos un dígito
		// - Al menos un carácter no alfanumérico.
		// El programa no terminará hasta que el usuario no introduzca la contraseña con
		// estos requisitos.

		boolean mayuscula = false;
		boolean minuscula = false;
		boolean digito = false;
		boolean noAlfanumerico = false;

		String contraseña = JOptionPane.showInputDialog("Escriba a contraseña");
		char[] cadena = contraseña.toCharArray();
		for (int i = 0; i < cadena.length; i++) {

			if (digito == false) {
				digito = Character.isDigit(cadena[i]);
			}
			if (mayuscula == false) {
				mayuscula = Character.isUpperCase(cadena[i]);
			}
			if (minuscula == false) {
				minuscula = Character.isLowerCase(cadena[i]);
			}
			if (noAlfanumerico == false) {
				noAlfanumerico = Character.isLetterOrDigit(cadena[i]);
			}

			System.out.println("Contraseña incorrecta");
		}
		while (digito == false || noAlfanumerico == false || minuscula == false || mayuscula == false)
			;

		System.out.println("Contraseña correcta");

	}
}
