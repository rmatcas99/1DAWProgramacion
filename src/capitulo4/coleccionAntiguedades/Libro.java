package capitulo4.coleccionAntiguedades;

public class Libro extends Antigüedad {

	private String nombre;
	
	public Libro() {
	}

	public Libro(int año_fabricacion, String origen, double precio, String nombre) {
		super();
		this.año_fabricacion = año_fabricacion;
		this.origen = origen;
		this.precio = precio;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", año_fabricacion=" + año_fabricacion + ", origen=" + origen + ", precio="
				+ precio + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
