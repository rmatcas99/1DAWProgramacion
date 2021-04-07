package gestionVentaCoches;

import java.util.Date;

public class Cliente {

	private int id;
	private boolean activo;
	private String nombre;
	private String apellidos;
	private String localidad;
	private Date fechaNacimiento;
	private String dniNie;
	
	
	
	public Cliente(int id, boolean activo, String nombre, String apellidos, String localidad, Date fechaNacimiento,
			String dniNie) {
		super();
		this.id = id;
		this.activo = activo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.fechaNacimiento = fechaNacimiento;
		this.dniNie = dniNie;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDniNie() {
		return dniNie;
	}

	public void setDniNie(String dniNie) {
		this.dniNie = dniNie;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", activo=" + activo + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", localidad=" + localidad + ", fechaNacimiento=" + fechaNacimiento + ", dniNie=" + dniNie + "]";
	}

}
