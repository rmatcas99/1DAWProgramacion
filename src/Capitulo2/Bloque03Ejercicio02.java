package Capitulo2;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio02 {

	public static void main(String[] args) {
		//Realiza una calculadora avanzada, pero con la particularidad de que las 
		//operaciones deben ser raices, potencias y el módulo de la división.
		
		String cad;
		
		//Creamos el Menú de nuestra calculadora
		cad = JOptionPane.showInputDialog("Menú de la calculadora: \n"
				+ "1. Raíz \n"
				+ "2. Potencia \n"
				+ "3. Módulo de división \n");
		int var = Integer.parseInt(cad);
		
		switch (var) {
			
			//Raiz
			case 1:
				String cad1;
				cad1 = JOptionPane.showInputDialog("Introduce el radicando: ");
				float radicando = Float.parseFloat(cad1);
				cad1 = JOptionPane.showInputDialog("Introduce el indice: ");
				float indice = Float.parseFloat(cad1);
				
				float resultado = 1 / indice;
				float raiz = (float) Math.pow(radicando, resultado);
				
				System.out.println("El resultado de la Raiz de " + radicando + " de índice " + indice + " es: " + raiz);
			break;
			
			//Potencia
			case 2:
				cad1 = JOptionPane.showInputDialog("Introduce el base: ");
				int base = Integer.parseInt(cad1);
				cad1 = JOptionPane.showInputDialog("Introduce el exponente: ");
				int exponente = Integer.parseInt(cad1);
				
				int potencia = (int) Math.pow(base, exponente);
				System.out.println("El resultado de la potencia es: " + potencia);
			break;
			
			//Módulo de división
			case 3:
				cad1 = JOptionPane.showInputDialog("Introduce el dividendo: ");
				int dividendo = Integer.parseInt(cad1);
				cad1 = JOptionPane.showInputDialog("Introduce el divisor: ");
				int divisor = Integer.parseInt(cad1);
				
				int division = dividendo % divisor;
				System.out.println("El resultado del módulo: " + division);
			break;
		}
	}

}
