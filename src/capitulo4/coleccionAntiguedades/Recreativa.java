package capitulo4.coleccionAntiguedades;

public class Recreativa extends Antigüedad {

	private int año_salida;
	
	public Recreativa() {
	}

	public Recreativa(int año_fabricacion, String origen, double precio, int año_salida) {
		super();
		this.año_fabricacion = año_fabricacion;
		this.origen = origen;
		this.precio = precio;
		this.año_salida = año_salida;
	}

	@Override
	public String toString() {
		return "Recreativa [año_salida=" + año_salida + ", año_fabricacion=" + año_fabricacion + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}

	public int getAño_salida() {
		return año_salida;
	}

	public void setAño_salida(int año_salida) {
		this.año_salida = año_salida;
	}
	

}
