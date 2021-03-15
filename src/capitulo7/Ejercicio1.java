package capitulo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	private static Connection conexion = null;

	public static void main(String[] args) {

		try {
			conexion = getConexion();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
		}

		menu();

	}

	private static void menu() {

		int opcionUsuario = -1;

		do {

			System.out.println("\n\t FABRICANTES");

			System.out.println("\n 1 - Listado Fabricantes.");
			System.out.println("\n 2 - Añadir Fabricantes.");
			System.out.println("\n 3 - Borrar Fabricantes.");
			System.out.println("\n 4 - Cambiar Fabricantes.");
			System.out.println("\n 0 - Salir.");

			opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce una opcion"));

			switch (opcionUsuario) {

			case 0:
				break;
			case 1:
				try {
					mostrarFabricantes();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					crearFabricantes();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					borrarFabricantes();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					cambiarFabricantes();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			}

		} while (opcionUsuario != 0);

		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void mostrarFabricantes() throws SQLException {
		Statement s = (Statement) conexion.createStatement();
		ResultSet rs = s.executeQuery("select * from fabricante");

		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();

		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("INT")) {
					System.out.print(rs.getInt(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("VARCHAR")) {
					System.out.print(rs.getString(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("DATETIME")) {
					System.out.print(rs.getDate(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("TINYINT")) {
					System.out.print(rs.getBoolean(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("FLOAT")) {
					System.out.print(rs.getFloat(rsmd.getColumnLabel(i)) + "\t");
				}

			}
			System.out.println("\n");
		}

		rs.close();
		s.close();
	}

	public static void borrarFabricantes() throws SQLException {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id"));

		mostrarFabricantes();
		Statement s = (Statement) conexion.createStatement();
		String sql = "delete from tutorialjavacoches.fabricante where id= " + id;
		s.executeUpdate(sql);

		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();

		s.close();
	}

	public static void crearFabricantes() throws SQLException {

		String CIF = JOptionPane.showInputDialog("Introduce el CIF");
		String nombre = JOptionPane.showInputDialog("Introduce el nombre");

		int id = maxIdEnTabla(conexion, "fabricante");

		Statement s = (Statement) conexion.createStatement();
		String sql = "insert into tutorialjavacoches.fabricante (id, CIF, nombre) values ( " + (id + 1) + ", '" + CIF
				+ "', '" + nombre + "')";
		s.executeUpdate(sql);

		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();

		s.close();
	}

	public static void cambiarFabricantes() throws SQLException {
		mostrarFabricantes();
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el id del que quieres cambiar"));
		
		String CIF = JOptionPane.showInputDialog("Introduce el nuevo CIF");
		String nombre = JOptionPane.showInputDialog("Introduce el nuevo nombre");

		Statement s = (Statement) conexion.createStatement();
		String sql = "UPDATE tutorialjavacoches.fabricante SET cif='" + CIF + "', + nombre='" + nombre + "' where id=" + id;
		s.executeUpdate(sql);

		System.out.println();
		System.out.println("--------------------------------------------------------------");
		System.out.println();

		s.close();
	}

	public static Connection getConexion() throws SQLException {
		// Si es la primera vez que accedemos a la conexi�n, debemos instanciarla
		if (conexion == null) {
			conectar();
		}
		// Compruebo si la conexi�n sigue estando activa
		while (!conexion.isValid(5)) {
			conectar();
		}

		return conexion;
	}

	private static void conectar() throws SQLException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
		}
	}

	private static int maxIdEnTabla(Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1;
		if (rs.next()) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}

}
