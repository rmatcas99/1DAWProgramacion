package capitulo4.ventanaConCanvas;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuadro extends Canvas {
	
	public static final int WIDTH = 700;
	public static final int HEIGHT = 700;
	
	JFrame ventana = new JFrame("Ejercicio4");
	
	public Cuadro() {
		
		JPanel panel = (JPanel) ventana.getContentPane();
		ventana.setBounds(0, 0, WIDTH, HEIGHT);
		panel.setLayout(new BorderLayout());
		panel.add(this, BorderLayout.CENTER);
		ventana.setVisible(true);
	}
	
	public void paint(Graphics g) {

		g.setColor(Color.RED);
		g.fillRect(50, 50, 130, 120);
		
		g.setColor(Color.GREEN);
		g.fillOval(500, 500, 120, 120);
		
		g.setColor(Color.RED);
	}

}
