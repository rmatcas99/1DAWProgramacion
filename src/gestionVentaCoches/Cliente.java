package gestionVentaCoches;

import java.util.Date;

public class Cliente {


	private int id;
	private boolean activo;
	private String nombre;
	private String apellidos;
	private String localidad;
	private Date fechaNacimiento;
	private String dniNIE;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, boolean activo, String nombre, String apellidos, String localidad, Date fechaNacimiento,
			String dniNIE) {
		super();
		this.id = id;
		this.activo = activo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.localidad = localidad;
		this.fechaNacimiento = fechaNacimiento;
		this.dniNIE = dniNIE;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDniNIE() {
		return dniNIE;
	}

	public void setDniNIE(String dniNIE) {
		this.dniNIE = dniNIE;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return dniNIE;
	}
	
	
	
}
