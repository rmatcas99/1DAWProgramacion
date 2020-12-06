package examenes;

import javax.swing.JOptionPane;

public class OpciónA_Bolos {

	public static void main(String[] args) {
		int opcion;
		int bolos[] = new int[10];
		int punTotales = 0;
		int valor = 10;
		int bolosTirados = 0;

		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(
				"\n¡Bienvenido!" + "\n1.- Iniciar el juego" + "\n0.- Salir" + "\n\nIntroduce una opción: "));

		if (opcionUsuario == 1) {
				
			generarBolos(bolos);
			
			do {
				opcion = menu();

				switch (opcion) {
				case 1:
					System.out.println(valor);
					probabilidad(bolos);
					bolosTirados = bolosEnPie(bolos, bolosTirados);
					System.out.println("Bolos en pie " + bolosTirados);
					imprimeBolos(bolos);
					punTotales += puntuacion(bolos, valor, bolosTirados, punTotales);
					System.out.println("LLevas " + punTotales + " puntos");
					valor = valor/2;
					
					
					break;
				case 2:
					imprimeBolos(bolos);
					break;
				default:
					break;
				}
			} while (opcion != 0 && bolosEnPie(bolos));

		} else {
			if(opcionUsuario == 0) System.out.println("Se abandonó el programa");
			else System.out.println("Se ha introducido un valor que no se pedía, se abandonó el programa");
		}
	}

	public static int menu() {
		// Pido una opción
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(
				"\n¡Bienvenido!" + "\n1.- Tirar bolos" + "\n2.- Ver bolos" + "\n0.- Salir del programa" + "\n\nIntroduce una opción: "));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	public static void generarBolos(int bolos[]) {
		// Generamos los bolos con valor 1
		for (int i = 0; i < bolos.length; i++) {
			bolos[i] = 1;
		}

		System.out.println("Se han generado los bolos");
	}
	
	public static void imprimeBolos(int bolos[]) {
		//Hacemos el dibujo de los bolos
		
		System.out.println();
		System.out.println(bolos[0] + "\t" + bolos[1] + "\t" + bolos[2] + "\t" + bolos[3] + "\n");
		System.out.println("    " + bolos[4] + "       " + bolos[5] + "       " + bolos[6] + "\n");
		System.out.println("        " + bolos[7] + "       " + bolos[8] + "\n");
		System.out.println("            " + bolos[9]);
	}
	
	public static void probabilidad(int bolos[]) {
		//Calculamos el porcentaje de cada bolo y si lo supera le cambiamos el valor a 0
		for (int i = 0; i < bolos.length; i++) {
			int porcentaje = (int) Math.round(Math.random() * 100);
			if (porcentaje <= 50) {
				bolos[i] = 0;
			}
		}
	}
	
	public static int puntuacion(int bolos[], int valor, int bolosTirados, int punTotales) {
		int bolosCaidos = 10 - bolosTirados;
		
		punTotales = valor * bolosCaidos;
		return punTotales;
	}
	
	public static boolean bolosEnPie(int bolos[]) {
		//Comprobamos si siguen habiendo bolos en pie
		
		for (int i = 0; i < bolos.length; i++) {
			if (bolos[i] == 1) return true;
		}
		
		return false;
	}
	
	public static int bolosEnPie(int bolos[], int bolosTirados){
		int contador = 0;
		for (int i = 0; i < bolos.length; i++) {
			if (bolos[i] == 1) {
				contador++;
			}
		}
		
		int bolosEnPie = contador + bolosTirados;
		return bolosEnPie;
	}

}
