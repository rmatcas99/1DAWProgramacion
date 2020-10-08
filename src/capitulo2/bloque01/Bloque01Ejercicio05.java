package capitulo2.bloque01;

import javax.swing.JOptionPane;

public class Bloque01Ejercicio05 {

	public static void main(String[] args) {
				//Pedir al usuario cinco números, e imprimir posteriormente el mayor valor introducido y el menor valor introducido.
		
				String cad;
				cad = JOptionPane.showInputDialog("Introduce un primer número: ");
				float num1 = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce un segundo número: ");
				float num2 = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce un tercer número: ");
				float num3 = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce un cuarto número: ");
				float num4 = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce un quinto número: ");
				float num5 = Float.parseFloat(cad);
				
				//Mayor
				if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
					System.out.println("El número mayor es: " + num1);
				}
				
				if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
					System.out.println("El número mayor es: " + num2);
				}
				
				if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) {
					System.out.println("El número mayor es: " + num3);
				}
				
				if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {
					System.out.println("El número mayor es: " + num4);
				}
				
				if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1) {
					System.out.println("El número mayor es: " + num5);
				}
				
				
				//Menor
				if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
					System.out.println("El número menor es: " + num1);
				}
				
				if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
					System.out.println("El número menor es: " + num2);
				}
				
				if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
					System.out.println("El número menor es: " + num3);
				}
				
				if (num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
					System.out.println("El número menor es: " + num4);
				}
				
				if (num5 < num2 && num5 < num3 && num5 < num4 && num5 < num1) {
					System.out.println("El número menor es: " + num5);
				}

	}

}
