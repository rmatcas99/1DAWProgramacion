package Capitulo2;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio02 {

	public static void main(String[] args) {
		//Repetir el ejercicio anterior para mostrar el número menor de los dos introducidos.
		
				String cad;
				cad = JOptionPane.showInputDialog("Introduce un número: ");
				float num1 = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce otro número: ");
				float num2 = Float.parseFloat(cad);
				
				if (num1 < num2) {
					System.out.println("El número menor es: " + num1);
				} else {
					System.out.println("El número menor es: " + num2);
				}

	}

}
