package gestionVentaCoches.Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionVentaCoches.Coche;

public class ControladorCoche {

	private static ControladorCoche instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCoche getInstance () {
		if (instance == null) {
			instance = new ControladorCoche();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorCoche() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Coche findPrimero () {
		Coche c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.coche order by id limit 1");
			if (rs.next()) {
				c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idfabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Coche findUltimo () {
		Coche c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.coche order by id desc limit 1");
			if (rs.next()) {
				c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idFabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Coche findSiguiente (int idActual) {
		Coche c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.coche where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idFabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Coche findAnterior (int idActual) {
		Coche c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.coche where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idFabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	
	/**
	 * 
	 * @return
	 */
	public int modificar (Coche c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 
			
			registrosAfectados = s.executeUpdate ("update coche set idFabricante=" + c.getIdFabricante() + ", " +
					" bastidor='" + c.getBastidor() + "', modelo='" + c.getModelo() + "', color='" + c.getColor() + "' where id=" + c.getId() + ";");
		  
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Coche c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into coche values(" + idNuevoRegistro + ", " +
			"'" + c.getIdFabricante() + "', '" +c.getBastidor() +  "', '" +c.getModelo() + "', '" +c.getColor() +"');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches.coche";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from coche where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}
	/**
	 * 
	 * @return
	 */
	public List<Coche> findAll () {
		List<Coche> coches= new ArrayList<Coche>();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.coche");
			while (rs.next()) {
				Coche c = new Coche();
				c = new Coche();
				c.setId(rs.getInt("id"));
				c.setIdFabricante(rs.getInt("idFabricante"));
				c.setBastidor(rs.getString("bastidor"));
				c.setModelo(rs.getString("modelo"));
				c.setColor(rs.getString("color"));
				// Agrego el fabricante a la lista
				coches.add(c);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return coches;
	}

}
