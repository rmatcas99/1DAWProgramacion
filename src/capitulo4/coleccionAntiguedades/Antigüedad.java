package capitulo4.coleccionAntiguedades;

public class Antigüedad {
	
	protected int año_fabricacion;
	protected String origen;
	protected double precio;
	
	public Antigüedad() {
		super();
	}

	public Antigüedad(int año_fabricacion, String origen, double precio) {
		super();
		this.año_fabricacion = año_fabricacion;
		this.origen = origen;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Antigüedad [año_fabricacion=" + año_fabricacion + ", origen=" + origen + ", precio=" + precio + "]";
	}

	public int getAño_fabricacion() {
		return año_fabricacion;
	}

	public void setAño_fabricacion(int año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
