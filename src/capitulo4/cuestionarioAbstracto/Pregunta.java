package capitulo4.cuestionarioAbstracto;

public abstract class Pregunta {
	
	protected String enunciado;
	
	public Pregunta() {
		super();
	}
	
	public Pregunta(String enunciado) {
		super();
		this.enunciado = enunciado;
	}
	
	@Override
	public String toString() {
		return "Pregunta [enunciado=" + enunciado + "]";
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public abstract void muestraPantalla();
	public abstract boolean esCorrecta();
	
	

}
