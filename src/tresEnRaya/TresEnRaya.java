package tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TresEnRaya extends Canvas {

	private static JFrame ventana = null;
	private static List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>();
	public static final int ANCHO = 600;
	public static final int ALTO = 600;
	public static TresEnRaya instancia = null;
	private int turno = 1;
	private int [][] tablero = { { 0, 0, 0}, { 0, 0, 0}, { 0, 0, 0} };

	public TresEnRaya() {
		
		ventana = new JFrame("3 en Raya");
		
		JPanel panel = (JPanel) ventana.getContentPane();
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);
		
		ventana.setBounds(0, 0, ANCHO, ALTO);
		
		creaCuadros();
		
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				super.mouseClicked(e);
				repaint();

				if (e.getButton() == MouseEvent.BUTTON1) {

					for (CuadroDeJuego c : cuadros) {
						if (c.clicEnCuadro(e.getX(), e.getY())) {
							c.clic();
							resultado();
						}
					}

				}
			}

		});
		
		ventana.setResizable(false);
		
		this.requestFocus();
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
		ventana.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				cerrarAplicacion();
			}
		});
		
	}
	
	public void creaCuadros() {
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				CuadroDeJuego cuadro = new CuadroDeJuego(j, i);
				cuadros.add(cuadro);
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Toolkit.getDefaultToolkit().sync();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		for (CuadroDeJuego cuadroDeJuego : cuadros) {
			g.setColor(Color.WHITE);
			cuadroDeJuego.paint(g);		
			
		}
	}

	public static void main(String[] args) {
		TresEnRaya.getInstance().creaCuadros();
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
	
	public boolean entradaTablero(int x, int y) {

		boolean valida = true;

		for (int i = y; i < tablero.length; i++) {
			for (int j = x; j < tablero.length; j++) {
				if (tablero[i][j] != 0) {
					//JOptionPane.showMessageDialog(instancia, "Cuadro Ocupado");
					valida = false;
					break;
				}
				if (valida) {
					if (turno == 1) {
						tablero[i][j] = 1;
						turno = 2;
						break;
					}
					if (turno == 2) {
						tablero[i][j] = 2;
						turno = 1;
						break;
					}
				}
			}
			break;
		}

		return valida;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	private static int getGanadorDelTablero(int tablero[][]) {
		
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
				return tablero[i][0]; 
			}
		}
		
		for (int i = 0; i < tablero[0].length; i++) {
			if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i]) {
				return tablero[0][i]; 
			}
		}
		
		if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
			return tablero[0][0]; 
		}
		
		if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
			return tablero[0][2]; 
		}
		
		boolean hayCasillasVacias = false;
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				if (tablero[i][j] == 0) {
					hayCasillasVacias = true;
				}
			}
		}

	
		if (hayCasillasVacias == true) {
			return 0; 
		} else {
			return -1;
		}
	}

	public void resultado() {
		int resultado = getGanadorDelTablero(tablero);

		if (resultado == -1) {
			JOptionPane.showMessageDialog(instancia, "No quedan mas cuadros libres");
		}
		if (resultado == 1) {
			JOptionPane.showMessageDialog(instancia, "Ha ganado el JUGADOR 1");
		}
		if (resultado == 2) {
			JOptionPane.showMessageDialog(instancia, "Ha ganado el JUGADOR 2");
		}
	}

}
