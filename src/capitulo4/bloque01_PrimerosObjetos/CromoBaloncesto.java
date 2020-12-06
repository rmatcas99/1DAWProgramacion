package capitulo4.bloque01_PrimerosObjetos;

public class CromoBaloncesto {

	private String nombreJugador;
	private int alturaCm;
	private int pesoKg;
	private float puntosMediosPorpartido;

	public CromoBaloncesto() {
	}

	public CromoBaloncesto(String nombreJugador, int alturaCm, int pesoKg, float puntosMediosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}

	public String toString() {
		return "El nombre de jugador es " + nombreJugador + "\nLa altura del jugador es " + alturaCm
				+ "\nEl peso del jugador es " + pesoKg + "\nLos puntos medios por partido del jugador son "
				+ puntosMediosPorpartido;
	}
	
	
	//Getters y Setters
	
	public String getNombre() {
		return nombreJugador;
	}
	
	public void setNombre(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	public int getAlturaCm() {
		return alturaCm;
	}
	
	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	public int getPesoKg() {
		return pesoKg;
	}
	
	public void setPesoKg(int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	public float getPuntosMediosPorpartido() {
		return puntosMediosPorpartido;
	}
	
	public void setPuntosMediosPorpartido(float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
}
