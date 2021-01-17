package capitulo4.articuloComestibles;

public class Comestible {
	
	protected int codigo;
	protected String nombre;
	protected float precio;
	
	public Comestible() {
		super();
	}

	public Comestible(int codigo, String nombre, float precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comestibles [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

}
