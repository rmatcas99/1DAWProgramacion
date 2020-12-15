package examenes.baraja;

import java.util.Arrays;

public class Jugador {

	String nombre;
	Carta mano[] = new Carta[5];

	public Jugador() {
		super();
	}

	public Jugador(String nombre, Carta[] mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + Arrays.toString(mano) + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta[] getMano() {
		return mano;
	}

	public void setMano(Carta[] mano) {
		this.mano = mano;
	}

	public void comprobarMano(Jugador jugador) {

		for (int i = 0; i < mano.length; i++) {
			int cont = 0;
			for (int j = i; j < mano.length; j++) {
				if (mano[i].getValor() == mano[j].getValor()) {
					cont++;
				}
			}

			switch (cont) {
			case 2:
				System.out.println("El jugador " + jugador.getNombre() + " tiene una pareja");
				break;

			case 3:
				System.out.println("El jugador " + jugador.getNombre() + " tiene un trío");
				break;

			case 4:
				System.out.println("El jugador " + jugador.getNombre() + "  tiene un poker");
				break;

			default:
				break;
			}
		}
	}

}
