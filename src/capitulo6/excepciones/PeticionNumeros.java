package capitulo6.excepciones;

import javax.swing.JOptionPane;

public class PeticionNumeros {

	// Implementa un programa que contenga una clase llamada "PeticionNumeros", con
	// un método "pideNumeroPar()". Desde un método "main()" llama al método
	// anterior. Dentro del método "pideNumeroPar()" debes crear todo lo necesario
	// para disparar una Exception, creada por ti, cuando el número introducido no
	// sea un número par.

	public static boolean pideNumeroPar(int num, boolean fin) throws ExcepcionPropia1 {

		if (num % 2 != 0) {
			throw new ExcepcionPropia1("\n\n  ¡EXCEPCIÓN! \n\nEl número pedido es impar");

		} else {
			System.out.println("El número introducido es par " + num);
			return fin = true;
		}

	}

	public static void main(String[] args) {

		boolean fin = true;
		
		try {
			do {
				int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
				pideNumeroPar(num, fin);
			} while (fin == true);
		} catch (ExcepcionPropia1 e) {
			System.out.println(e.getMessage());
		}

	}

}
