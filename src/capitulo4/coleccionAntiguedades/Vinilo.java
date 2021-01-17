package capitulo4.coleccionAntiguedades;

public class Vinilo extends Antigüedad {

	private String titulo_album;
	
	public Vinilo() {
	}

	public Vinilo(int año_fabricacion, String origen, double precio, String titulo_album) {
		super();
		this.año_fabricacion = año_fabricacion;
		this.origen = origen;
		this.precio = precio;
		this.titulo_album = titulo_album;
	}

	@Override
	public String toString() {
		return "Vinilo [titulo_album=" + titulo_album + ", año_fabricacion=" + año_fabricacion + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}

	public String getTitulo_album() {
		return titulo_album;
	}

	public void setTitulo_album(String titulo_album) {
		this.titulo_album = titulo_album;
	}

}
