package capitulo5.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro variables necesarias
		int opcion;
		List<String> fichero = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa esté finalizado
		fichero.add("Primera línea");
		fichero.add("Segunda línea");
		fichero.add("Tercera línea");

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("Adios!");
				break;
			case 1:
				agregarLista(fichero);
				break;
			case 2:
				int num = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce la línea en la que quieres introducirla: "));
				insertarLineaPosicion(fichero, num);
				break;
			case 3:
				num = Integer.parseInt(JOptionPane.showInputDialog("Introduce la línea que quieres borrar "));
				editarLinea(fichero, num);
				break;
			case 4:
				num = Integer.parseInt(JOptionPane.showInputDialog("Introduce la línea que quieres editar "));
				fichero.remove(num);
				break;
			case 5:
				int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce inicio del corte "));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce fin del corte "));
				cortarConjunto(portapapeles, fichero, num1, num2);
				break;
			case 6:
				num = Integer.parseInt(
						JOptionPane.showInputDialog("Introduce en que linea deseas pegar el conjunto de lineas "));
				pegarConjunto(portapapeles, fichero, num);
				break;
			case 7: // Ha elegido visualizar el fichero
				visualizaLista(fichero);
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Agregar una línea"
				+ "\n2.- Insertar una línea en una posición" + "\n3.- Editar una línea" + "\n4.- Eliminar una línea"
				+ "\n5.- Cortar un conjunto de líneas" + "\n6.- Pegar un conjunto de líneas"
				+ "\n7.- Visualizar el fichero" + "\n\nIntroduzca su opción: ";
		// Muestro el menú
		System.out.println(strMenu);
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción: "));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaLista(List<String> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}

	public static void agregarLista(List<String> lista) {
		String str = JOptionPane.showInputDialog("Añade una línea");
		lista.add(str);
	}

	public static void insertarLineaPosicion(List<String> lista, int num) {
		String str = JOptionPane.showInputDialog("Introduce el valor de la línea");
		lista.add(num, str);
	}

	public static void editarLinea(List<String> lista, int num) {
		lista.remove(num);
		String str = JOptionPane.showInputDialog("Añade el nuevo texto de la linea");
		lista.add(num, str);
	}

	public static void cortarConjunto(List<String> portapapeles, List<String> lista, int num, int num2) {
		for (int i = num; i < num2; i++) {
			portapapeles.add(lista.get(i));
			lista.remove(num);
		}
	}

	public static void pegarConjunto(List<String> portapapeles, List<String> lista, int num) {
		for (int i = num; i < portapapeles.size(); i++) {
			lista.add(num, portapapeles.get(i));
			portapapeles.remove(0);
		}
	}

}
