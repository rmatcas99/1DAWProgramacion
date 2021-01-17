package capitulo4.coleccionAntiguedades;

public class ColeccionAntiguedades {

	public static void main(String[] args) {
		
		Libro libro = new Libro(2020, "Casa de Libro", 2000, "Luna de Plutón");
		Joya perla = new Joya(2020, "Océano", 2000, "Perla");
		Vinilo aBBA = new Vinilo(2020, "Suecia", 2000, "ABBA Gold");
		Recreativa spaceInvadres = new Recreativa(1975, "Riot", 2000, 1978);
		
		System.out.println(libro.toString());
		System.out.println(perla.toString());
		System.out.println(aBBA.toString());
		System.out.println(spaceInvadres.toString());

	}

}
