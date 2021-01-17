package capitulo4.articuloComestibles;

public class Perecedero extends Comestible {
	
	private int fecha_cad;	

	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecedero(int codigo, String nombre, float precio, int fecha) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.fecha_cad = fecha;
	}

	@Override
	public String toString() {
		return "Perecedero [fecha_cad=" + fecha_cad + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio
				+ "]";
	}

	public int getFecha_cad() {
		return fecha_cad;
	}

	public void setFecha_cad(int fecha_cad) {
		this.fecha_cad = fecha_cad;
	}	
	
}
