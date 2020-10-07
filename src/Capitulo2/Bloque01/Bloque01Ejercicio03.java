package Capitulo2.Bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio03 {

	public static void main(String[] args) {
		
		// Realizar un ejercicio en C que pida un número al usuario e 
		// indique en pantalla si se trata de un número par o impar. 
		// Recuerda que un número par es aquel cuyo resto de su división 
		// entre dos sea siempre cero, y recuerda que un número impar es 
		// aquel cuyo resto de su división entre dos sea siempre uno.
				
		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int num1 = Integer.parseInt(cad);
		int resto = num1 % 2;
				
		if (resto == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

	}

}
