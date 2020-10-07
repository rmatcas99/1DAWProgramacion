package Capitulo2.Bloque03;

import javax.swing.JOptionPane;

public class Bloque03Ejercicio01 {

	public static void main(String[] args) {
		//Realiza un ejercicio que califique la nota obtenida por un alumno/a en un examen. 
		//El ejercicio pedirá al usuario la nota numérica, y se imprimirá en pantalla su 
		//traducción a nota de texto: muy deficiente, insuficiente, suficiente, bien, notable 
		//y sobresaliente. Debes realizar el ejercicio a través de una sentencia switch, no de if anidados.
		
		String cad;
		cad = JOptionPane.showInputDialog("Introduce un número: ");
		int nota = Integer.parseInt(cad);
		
		switch (nota) {
			case 1: 
				System.out.println("La nota es un " + nota + ": Muy deficiente");
			break;
			
			case 2: 
				System.out.println("La nota es un " + nota + ": Muy deficiente");
			break;
			
			case 3: 
				System.out.println("La nota es un " + nota + ": Insuficiente");
			break;
			
			case 4: 
				System.out.println("La nota es un " + nota + ": Insuficiente");
			break;
			
			case 5: 
				System.out.println("La nota es un " + nota + ": Suficiente");
			break;
			
			case 6: 
				System.out.println("La nota es un " + nota + ": Bien");
			break;
			
			case 7: 
				System.out.println("La nota es un " + nota + ": Notable");
			break;
			
			case 8: 
				System.out.println("La nota es un " + nota + ": Notable");
			break;
			
			case 9: 
				System.out.println("La nota es un " + nota + ": Sobresaliente");
			break;
			
			case 10: 
				System.out.println("La nota es un " + nota + ": Sobresaliente");
			break;
		}

	}

}
