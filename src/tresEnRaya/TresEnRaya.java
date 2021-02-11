package tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TresEnRaya extends Canvas {

	private static JFrame ventana = null;
	private static List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>();
	public static final int ANCHO = 600;
	public static final int ALTO = 600;
	public static TresEnRaya instancia = null;

	public TresEnRaya() {
		
		ventana = new JFrame("3 en Raya");
		ventana.setBounds(0, 0, ANCHO, ALTO);
		
		ventana.getContentPane().setLayout(new BorderLayout());
		ventana.getContentPane().add(this, BorderLayout.CENTER);
		
		creaCuadros();
		
		ventana.setResizable(false);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		this.requestFocus();
		
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		
	}
	
	public static List<CuadroDeJuego> creaCuadros() {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cuadros.add(new CuadroDeJuego(j, i));
			}
		}
		
		return cuadros;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Toolkit.getDefaultToolkit().sync();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for (CuadroDeJuego cuadroDeJuego : cuadros) {
			cuadroDeJuego.paint(g);			
		}
	}

	public static void main(String[] args) {
		TresEnRaya.getInstance();
	}

	public static TresEnRaya getInstance() {
		if (instancia == null) {
			instancia = new TresEnRaya();
		}
		return instancia;
	}
	
	private static void cerrarAplicacion() {
		String[] opciones = { "Aceptar", "Cancelar" };
		int eleccion = JOptionPane.showOptionDialog(ventana, "¿Desea cerrar la aplicación?", "Salir de la aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (eleccion == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

}
