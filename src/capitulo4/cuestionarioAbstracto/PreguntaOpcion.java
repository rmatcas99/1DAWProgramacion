package capitulo4.cuestionarioAbstracto;

import java.util.List;

public class PreguntaOpcion extends Pregunta {

	private List<String> respuestas;
	
	public PreguntaOpcion() {
		// TODO Auto-generated constructor stub
	}

	public PreguntaOpcion(String enunciado) {
		super(enunciado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void muestraPantalla() {

	}

	@Override
	public boolean esCorrecta() {
		// TODO Auto-generated method stub
		return false;
	}

}
