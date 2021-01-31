package capitulo6.math;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		double x = 3;
		double pi = 4;
		int signo = -1;
		
		do {
			
			pi += signo * 4.0 / x;
			signo *= -1;
			x += 2;
			
		} while(Math.abs(Math.PI - pi) >= 0.00001);
		
		System.out.println(pi);

	}

}
