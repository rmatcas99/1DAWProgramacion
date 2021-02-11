package tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;

public class CuadroDeJuego {

	private int xTablero, yTablero;
	private int esquinaSuperiorX, esquinaSuperiorY;
	private int ancho, alto;
	
	public CuadroDeJuego(int xTablero, int yTablero) {
		super();
		this.xTablero = xTablero;
		this.yTablero = yTablero;
	}
	
	public void paint (Graphics g) {
		
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		
		esquinaSuperiorX = this.xTablero * ancho;
		esquinaSuperiorY = this.yTablero * alto + 2;
		
		g.setColor(Color.WHITE);
		g.drawRect(esquinaSuperiorX, esquinaSuperiorY, ancho, alto);
	}
	
}
