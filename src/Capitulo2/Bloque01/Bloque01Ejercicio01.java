package Capitulo2.Bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio01 {

	public static void main(String[] args) {
		
		/*Realiza un ejercicio que pida dos variables al usuario, 
		tras lo cual, muestre en pantalla el número mayor de los dos introducidos.*/
		
		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		float num2 = Float.parseFloat(cad);
		
		if (num1 > num2) {
			System.out.println("El primer número es el mayor: " + num1);
		} else {
			System.out.println("El segundo número es el mayor: " + num2);
		}

	}

}
