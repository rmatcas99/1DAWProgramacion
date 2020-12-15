package examenes.baraja;

import java.util.Arrays;

public class Poker {
	
	Jugador jugadores[] = new Jugador[5];

	public Poker() {
		super();
	}

	public Poker(Jugador[] jugadores) {
		super();
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Poker [jugador=" + Arrays.toString(jugadores) + "]";
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	
}
