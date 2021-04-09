package gestionVentaCoches;

public class Fabricante {

	private int id;
	private String cif;
	private String nombre;
	
	
	public Fabricante() {
		
		// TODO Auto-generated constructor stub
	}

	public Fabricante(int id, String cif, String nombre) {
		super();
		this.id = id;
		this.cif = cif;
		this.nombre = nombre;
	}
	
	

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * 
	 * @param cif
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}


	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

}
