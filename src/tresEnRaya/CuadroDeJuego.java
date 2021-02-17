package tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;

public class CuadroDeJuego {

	private int xTablero, yTablero;
	private int esquinaSuperiorX, esquinaSuperiorY;
	private int ancho, alto;
	
	private int estado = 0;
	
	public CuadroDeJuego(int xTablero, int yTablero) {
		super();
		this.xTablero = xTablero;
		this.yTablero = yTablero;
	}
	
	public void paint(Graphics g) {
		
		ancho = TresEnRaya.getInstance().getWidth() / 3;
		alto = TresEnRaya.getInstance().getHeight() / 3;
		
		esquinaSuperiorX = this.xTablero * ancho;
		esquinaSuperiorY = this.yTablero * alto + 2;

		g.setColor(Color.WHITE);
		g.drawRect(esquinaSuperiorX, esquinaSuperiorY, ancho, alto);

		if (estado == 1) {
			g.setColor(Color.GREEN);
			g.drawOval(esquinaSuperiorX, esquinaSuperiorY, ancho, alto);
			
		}

		if (estado == 2) {

			g.setColor(Color.BLUE);
			g.drawLine(esquinaSuperiorX, esquinaSuperiorY, esquinaSuperiorX + ancho, esquinaSuperiorY + alto);
			g.drawLine(esquinaSuperiorX + ancho, esquinaSuperiorY, esquinaSuperiorX, esquinaSuperiorY + alto);
		}
	}
	
	public boolean clicEnCuadro(int clicX, int clicY) {

		if (clicX > this.esquinaSuperiorX && clicX < (this.esquinaSuperiorX + this.ancho) && clicY > this.esquinaSuperiorY
				&& clicY < (this.esquinaSuperiorY + this.alto)) {
			return true;

		}
		return false;
	}

	public void clic() {
		int turno = TresEnRaya.getInstance().getTurno();
		if (TresEnRaya.getInstance().entradaTablero(xTablero, yTablero)) {
			if (turno == 1) {
				this.estado = 1;
			}
			if (turno == 2) {
				this.estado = 2;
			}
		}
	}

	public int getxTablero() {
		return xTablero;
	}

	public void setxTablero(int xTablero) {
		this.xTablero = xTablero;
	}

	public int getyTablero() {
		return yTablero;
	}

	public void setyTablero(int yTablero) {
		this.yTablero = yTablero;
	}

	public int getEsquinaSuperiorX() {
		return esquinaSuperiorX;
	}

	public void setEsquinaSuperiorX(int esquinaSuperiorX) {
		this.esquinaSuperiorX = esquinaSuperiorX;
	}

	public int getEsquinaSuperiorY() {
		return esquinaSuperiorY;
	}

	public void setEsquinaSuperiorY(int esquinaSuperiorY) {
		this.esquinaSuperiorY = esquinaSuperiorY;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
