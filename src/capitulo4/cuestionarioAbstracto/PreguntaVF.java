package capitulo4.cuestionarioAbstracto;

public class PreguntaVF extends Pregunta {

	
	
	public PreguntaVF() {
	}

	public PreguntaVF(String enunciado) {
		super(enunciado);
	}

	@Override
	public void muestraPantalla() {
		
	}

	@Override
	public boolean esCorrecta() {
		return false;
	}

}
