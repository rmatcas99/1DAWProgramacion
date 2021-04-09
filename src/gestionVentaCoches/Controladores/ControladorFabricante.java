package gestionVentaCoches.Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionVentaCoches.Fabricante;




public class ControladorFabricante {
	
	private static ControladorFabricante instance = null;
	public Connection conn = null;
	
	
	/**
	 * 
	 * @return
	 */
	public static ControladorFabricante getInstance() {
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorFabricante() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Fabricante buscaPrimero() { // findPrimero
		
		Fabricante f = null;
		
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery ("select * from fabricante order by id limit 1");
			
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public Fabricante buscaUltimo() { // findPrimero
		
		Fabricante f = null;
		
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery ("select * from fabricante order by id desc limit 1");
			
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public Fabricante buscaSiguiente(int idActual) { // findPrimero
		
		Fabricante f = null;
		
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery ("select * from fabricante where id >" +  idActual +" order by id limit 1");
			
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public Fabricante buscaAnterior(int idActual) { // findPrimero
		
		Fabricante f = null;
		
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs = s.executeQuery ("select * from fabricante where id <" +  idActual +" order by id desc limit 1");
			
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	
	/**
	 * 
	 * @return
	 */
	public int modificar(Fabricante f) {
		
		int registrosAfectados = 0;
		
		try {
			Statement s = (Statement)  this.conn.createStatement();
			registrosAfectados = s.executeUpdate("update fabricante set cif='" +f.getCif() +"' , nombre='"+ f.getNombre() +"'" );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return registrosAfectados;
		
	}
	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Fabricante f) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into fabricante values(" + idNuevoRegistro + ", " +
			"'" + f.getCif() + "', '" + f.getNombre() + "');");
		   	
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

		String sql = "select max(id) from tutorialjavacoches.fabricante";
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

			registrosAfectados = s.executeUpdate ("delete from fabricante where id=" + id + ";");
			
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
	public List<Fabricante> findAll () {
		List<Fabricante> fabricantes = new ArrayList<Fabricante>();
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.fabricante");
			while (rs.next()) {
				Fabricante f = new Fabricante();
				f.setId(rs.getInt("id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
				// Agrego el fabricante a la lista
				fabricantes.add(f);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return fabricantes;
	}
	

}
