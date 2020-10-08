package capitulo2.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio04 {

	public static void main(String[] args) {
		// Repetir el ejercicio 3º de este bloque de ejercicios, 
		// pero mostrando el menor valor de los cinco introducidos por el usuario.
				
		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num1 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num2 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num3 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num4 = Float.parseFloat(cad);
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		Float num5 = Float.parseFloat(cad);
			
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("El número mayor es : " + num1);
		}
		if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("El número mayor es : " + num2);
		}
		if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			System.out.println("El número mayor es : " + num3);
		}
		if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			System.out.println("El número mayor es : " + num4);
		}
		if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
			System.out.println("El número mayor es : " + num5);
		}

	}

}
