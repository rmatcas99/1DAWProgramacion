package capitulo6.math;

public class Ejercicio5 {

	public static void main(String[] args) {
		double x = 0.0001;
		double y, y1, y2, fin = 0;

//		y = x * Math.sin(x);
//		System.out.println(y);
//		y1 = (x - 0.0001) * Math.sin(x);
//		System.out.println(y1);
//		y2 = (x + 0.0001) * Math.sin(x);
//		System.out.println(y2);
		
		
		do {
			y = x * Math.sin(x);
			//System.out.println(y);
			y1 = (x - 0.0001) * Math.sin(x);
			//System.out.println(y);
			y2 = (x + 0.0001) * Math.sin(x);
			//System.out.println(y);

			if (y > y1 && y > y2) {
				System.out.println(y);
				fin++;
			}
			
			x += 0.001;

		} while (fin < 4);

	}

}
