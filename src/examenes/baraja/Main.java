package examenes.baraja;

public class Main {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();

		baraja.mezclarBaraja();
		baraja.imprimeBaraja();

		System.out.println();

		// baraja.ordenarBaraja();
		// baraja.imprimeBaraja();

		Poker poker = new Poker();

		Jugador jugadores[] = new Jugador[5];

		for (int i = 0; i < 5; i++) {
			Jugador jugador = new Jugador();
			jugador.setNombre("Jugador" + i);
			baraja.mano(jugador);
			
			jugadores[i] = jugador;
			jugadores[i].comprobarMano(jugador);
		}
		
		poker.setJugadores(jugadores);
		
		for (int i = 0; i < jugadores.length; i++) {
			System.out.println(jugadores[i].getNombre());
			for (int j = 0; j < jugadores[i].getMano().length; j++) {
				System.out.println("\t" + jugadores[i].getMano()[j].toString());
			}
		}
		
		System.out.println();

	}

}
