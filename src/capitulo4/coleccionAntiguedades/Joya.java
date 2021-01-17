package capitulo4.coleccionAntiguedades;

public class Joya extends Antigüedad {

	private String material;
	
	public Joya() {
	}

	public Joya(int año_fabricacion, String origen, double precio, String material) {
		super();
		this.año_fabricacion = año_fabricacion;
		this.origen = origen;
		this.precio = precio;
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya [material=" + material + ", año_fabricacion=" + año_fabricacion + ", origen=" + origen
				+ ", precio=" + precio + "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
}
