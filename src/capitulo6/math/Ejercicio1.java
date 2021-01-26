package capitulo6.math;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de a: "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de b: "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de c: "));
		
		System.out.println("a vale: " + a + "\nb vale: " + b + "\nc vale: " + c);
		
		double x = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
		
		System.out.println(x);
		
		x = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
		
		System.out.println(x);
		

	}

}
