package examenes.baraja;

import java.util.Arrays;

public class Baraja {

	Carta baraja[] = new Carta[52];
	int contadorDadas = baraja.length-1;

	public Baraja() {
		super();

		int i = 0;

		for (int j = 0; j < 13; j++) {
			baraja[i] = new Carta(j + 1, "Picas", i);
			i++;
		}

		for (int j = 0; j < 13; j++) {
			baraja[i] = new Carta(j + 1, "Diamantes", i);
			i++;
		}

		for (int j = 0; j < 13; j++) {
			baraja[i] = new Carta(j + 1, "Tréboles", i);
			i++;
		}

		for (int j = 0; j < 13; j++) {
			baraja[i] = new Carta(j + 1, "Corazones", i);
			i++;
		}
	}

	public Baraja(Carta[] baraja) {
		super();
		this.baraja = baraja;
	}

	@Override
	public String toString() {
		return "Baraja [baraja=" + Arrays.toString(baraja) + "]";
	}

	public Carta[] getBaraja() {
		return baraja;
	}

	public void setBaraja(Carta[] baraja) {
		this.baraja = baraja;
	}

//	public void generarBaraja() {
//
//		int i = 0;
//
//		for (int j = 0; j < 13; j++) {
//			baraja[i] = new Carta(j + 1, "Picas", i);
//			i++;
//		}
//
//		for (int j = 0; j < 13; j++) {
//			baraja[i] = new Carta(j + 1, "Diamantes", i);
//			i++;
//		}
//
//		for (int j = 0; j < 13; j++) {
//			baraja[i] = new Carta(j + 1, "Tréboles", i);
//			i++;
//		}
//
//		for (int j = 0; j < 13; j++) {
//			baraja[i] = new Carta(j + 1, "Corazones", i);
//			i++;
//		}
//	}

	public void imprimeBaraja() {

		for (int i = 0; i < baraja.length; i++) {
			System.out.println(baraja[i].toString());
		}
	}

	public void primeraPorUltima() {

		Carta aux = baraja[0];

		for (int i = 1; i < baraja.length; i++) {

			baraja[i - 1] = baraja[i];
		}

		baraja[baraja.length - 1] = aux;
	}
	
	public void ultimaPorPrimera() {

		Carta aux = baraja[baraja.length - 1];

		for (int i = baraja.length - 1; i > 0; i--) {

			baraja[i] = baraja[i - 1];
		}

		baraja[0] = aux;
	}

	public void mezclarBaraja() {

		for (int i = 0; i < 100; i++) {
			int num1 = (int) Math.round(Math.random() * 51);
			int num2 = (int) Math.round(Math.random() * 51);

			Carta aux = baraja[num1];
			baraja[num1] = baraja[num2];
			baraja[num2] = aux;
		}
	}

	public void ordenarBaraja() {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			
			for (int i = 0; i < baraja.length - 1; i++) {
				if (baraja[i + 1].getId() < baraja[i].getId()) {
					
					Carta aux = baraja[i + 1];
					baraja[i + 1] = baraja[i];
					baraja[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios == true);
	}
	
	public void mano(Jugador jugador) {
		
		Carta mano[] = new Carta[5];
		
		for (int i = 0; i < mano.length; i++) {
			mano[i] = baraja[contadorDadas];
			contadorDadas--;
		}
		
		jugador.setMano(mano);
	}
}
