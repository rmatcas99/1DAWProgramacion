package capitulo5.bloque07_Listas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();
		int opcion;

		do {

			opcion = menu();

			switch (opcion) {
			case 1:
				int lon = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud de la nueva lista: "));
				int min = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo que contendrá la lista: "));
				int max = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo que contendrá la lista: "));

				listaAleatoriaValores(lista, lon, min, max);
				break;

			case 2:
				calcular(lista);
				break;

			case 3:
				int nuevos = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce cuántos valores nuevos se añadirán: "));
				int posicion = Integer.parseInt(
						JOptionPane.showInputDialog("Introduce la posicion en la que empezarán a añadirse: "));
				min = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo que contendrá la lista: "));
				max = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo que contendrá la lista: "));
				añadirValores(lista, nuevos, posicion, min, max);
				break;

			case 4:
				min = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el valor mínimo del intervalo a eliminar: "));
				max = Integer
						.parseInt(JOptionPane.showInputDialog("Introduce el valor máximo del intervalo a eliminar: "));
				eliminarIntervalo(lista, min, max);
				break;

			case 5:
				mostrarLista(lista);
				break;
			default:
				System.out.println("No has introducido un valor de las opciones");
				break;
			}

		} while (opcion != 0);
	}

	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Abandonar el programa" + "\n1.- Crear aleatoriamente la lista de valores"
				+ "\n2.- Calcular suma, media, mayor y menor" + "\n3.- Agregar una cantidad de nuevos valores"
				+ "\n4.- Eliminar elementos cuyo valor esté en un intervalo" + "\n5.- Imprimir la lista\""
				+ "\n\nIntroduzca su opción: ";

		// Muestro el menú
		System.out.println(strMenu);
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opción: "));
		// Devuelvo la opción seleccionada
		return opcionUsuario;

	}

	public static List<Integer> listaAleatoriaValores(List<Integer> lista, int lon, int min, int max) {
		// Primero borramos los valores de la lista
		for (int i = 0; i < lista.size(); i++) {
			lista.remove(0);
		}

		// Asignamos valores aleatorios
		for (int i = 0; i < lon; i++) {
			lista.add((int) Math.round(Math.random() * (max - min) + min));
		}

		return lista;
	}

	public static void mostrarLista(List<Integer> lista) {
		System.out.println("\n\nContenido de la lista");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(i + "- \t" + lista.get(i));
		}
	}

	public static void calcular(List<Integer> lista) {
		System.out.println("La suma de los valores es " + suma(lista));
		System.out.println("La media de los valores es " + media(lista));
		System.out.println("El mayor de los valores es " + mayor(lista));
		System.out.println("El menor de los valores es " + menor(lista));
	}

	public static int suma(List<Integer> lista) {
		int suma = 0;

		for (int i = 0; i < lista.size(); i++) {
			suma += lista.get(i);
		}
		return suma;
	}

	public static int media(List<Integer> lista) {
		int media;
		return media = suma(lista) / lista.size();
	}

	public static int mayor(List<Integer> lista) {
		int mayor = -500000;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > mayor)
				mayor = lista.get(i);
		}
		return mayor;
	}

	public static int menor(List<Integer> lista) {
		int menor = 500000;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < menor)
				menor = lista.get(i);
		}
		return menor;
	}

	public static List<Integer> añadirValores(List<Integer> lista, int nuevos, int posicion, int min, int max) {
		List<Integer> lista2 = new ArrayList<Integer>();

		for (int i = 0; i < nuevos; i++) {
			lista2.add((int) Math.round(Math.random() * (max - min) + min));
		}

		for (int i = posicion; i < lista.size(); i++) {
			lista.add(i, lista2.get(i));
		}

		return lista;
	}
	
	public static List<Integer> eliminarIntervalo(List<Integer> lista, int min, int max){
		for (int i = min; i <= max; i++) {
			lista.remove(min);
		}
		
		return lista;
	}

}
