package capitulo4.bloque01_PrimerosObjetos;

import java.util.ArrayList;
import java.util.List;

public class Cromos {

	public static void main(String[] args) {
		CromoBaloncesto jugador1 = new CromoBaloncesto("Jesus", 187, 90, 10);
		CromoBaloncesto jugador2 = new CromoBaloncesto("Antonio", 190, 95, 25.4f);
		CromoBaloncesto jugador3 = new CromoBaloncesto("Zuli", 191, 93, 5.9f);
		CromoBaloncesto jugador4 = new CromoBaloncesto("Ruben", 185, 90, 11);
		CromoBaloncesto jugador5 = new CromoBaloncesto("Flores", 184, 85, 6);
		
		List<CromoBaloncesto> lista = new ArrayList<CromoBaloncesto>();
		
		lista.add(jugador1); lista.add(jugador2); lista.add(jugador3);
		lista.add(jugador4); lista.add(jugador5);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString() + "\n");
		}
	}

}
