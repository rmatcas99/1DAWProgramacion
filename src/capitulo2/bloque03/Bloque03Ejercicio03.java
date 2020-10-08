package capitulo2.bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio03 {

	public static void main(String[] args) {
		// Realiza un programa que resuelva lo siguientes puntos:
		/*
		 * Que muestre un menú en pantalla con opciones para: 
		 * 1. Cálculo de la hipotenusa de un triángulo. 
		 * 2. Cálculo de la superficie de una circunferencia. 
		 * 3. Cálculo del perímetro de una circunferencia. 
		 * 4. Cálculo del área de un rectángulo. 
		 * 5. Cálculo del área de un triángulo. 
		 * 0. Salir de la aplicación.
		 */

		String cad;

		// Creamos el Menú de nuestro programa
		cad = JOptionPane.showInputDialog(
				"Menú del programa: \n" + 
						"1. Cálculo de la hipotenusa de un triángulo \n" + 
						"2. Cálculo de la superficie de un círculo \n" + 
						"3. Cálculo del perímetro de una circunferencia \n" + 
						"4. Cálculo del área de un rectángulo \n" + 
						"5. Cálculo del área de un triánulo \n" + 
						"0. Salir de la aplicación");
		int var = Integer.parseInt(cad);
		
		switch (var) {
			case 1:
				cad = JOptionPane.showInputDialog("Introduce el valor de un cateto: ");
				float cateto = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce el valor de otro cateto: ");
				float cateto2 = Float.parseFloat(cad);
				
				float hipotenusa = (float) Math.pow(cateto, 2) + (float) Math.pow(cateto2, 2);
				System.out.println("El valor de la hipotenusa es: " + Math.pow(hipotenusa, 2));
			break;
			
			case 2:
				cad = JOptionPane.showInputDialog("Introduce el valor del radio: ");
				float radio = Float.parseFloat(cad);
				
				float area = (float) Math.PI * (float) Math.pow(radio, 2);
				System.out.println("El área del círculo es: " + area);
			break;
				
			case 3:
				cad = JOptionPane.showInputDialog("Introduce el valor del radio: ");
				radio = Float.parseFloat(cad);
				
				float perimetro = (float) Math.PI * radio * 2;
				System.out.println("El área del círculo es: " + perimetro);
			break;
			
			case 4:
				cad = JOptionPane.showInputDialog("Introduce el valor de la base: ");
				float base = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce el valor de la altura: ");
				float altura = Float.parseFloat(cad);
				
				System.out.println("El valor del área del rectángulo es : " +  base * altura);
			break;
			
			case 5:
				cad = JOptionPane.showInputDialog("Introduce el valor de la base: ");
				base = Float.parseFloat(cad);
				cad = JOptionPane.showInputDialog("Introduce el valor de la altura: ");
				altura = Float.parseFloat(cad);
				
				System.out.println("El valor del área del rectángulo es : " +  (base * altura) / 2);
			break;
			
			case 0:
			break;
		}

	}

}
