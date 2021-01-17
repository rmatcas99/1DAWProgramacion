package capitulo4.articuloComestibles;

public class Tienda {

	public static void main(String[] args) {
		
		Perecedero leche = new Perecedero(3, "Leche", 4.59f, 2019);
		Comestible galletas = new Comestible(2, "Galletas", 2.99f);
		
		System.out.println(leche.toString());
		System.out.println(galletas.toString());

	}

}
