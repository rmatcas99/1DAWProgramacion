package capitulo6.math;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		double y, x, y2;
		
		//x = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a: "));
		x = 0.00001;
		do {
			
			y = Math.sqrt(x);
			y2 = - Math.log(x);
			
			x += 0.00001;
			
		} while (Math.abs(y - y2) > 0.001);
		
		System.out.println(x + "\n" + y2);

	}

}
