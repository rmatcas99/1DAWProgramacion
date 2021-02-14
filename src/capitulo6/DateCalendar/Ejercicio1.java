package capitulo6.DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// - Crea un programa en Java que pida al usuario la introducción de una fecha a
		// través de JOptionPane. El usuario te especificará un dato de tipo String y tú
		// debes convertirlo a un objeto de tipo java.util.Date utilizando
		// SimpleDateFormat. A continuación realiza las siguientes acciones
		// - Con el objeto java.util.Date, crea un objeto de tipo Calendar y que
		// represente la misma fecha que ha introducido el usuario.
		// - Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y
		// segundo. Cada campo debe aparecer en una línea de la consola. Debes obtener
		// cada campo desde el objeto java.util.Date y desde el objeto Calendar. Es
		// decir, cada campo debe ser obtenido dos veces en pantalla.
		// - Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas
		// en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.

		
		
		String date = JOptionPane.showInputDialog("Introduce una fecha (dias/mes/año)");
		Date fecha = null;
		try {
			fecha = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			System.out.println("El formato de la fecha es incorrecta");
		}
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fecha);
		
		System.out.println(fecha.toString());
		System.out.println("Año " + fecha.getYear() + "\nMes " + fecha.getMonth() + "\nDia " + fecha.getDay() + "\nHora " + fecha.getHours() + "\nMinutos " + fecha.getMinutes() + "\nSegundos " + fecha.getSeconds());
		
		calendario.add(Calendar.DAY_OF_MONTH, 2);
		
		System.out.println("Calendario mas 2 dias " + calendario.getTime());
		
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_MONTH, -14);
		
		System.out.println("Calendario menos 14 dias " + calendario.getTime());
		
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_MONTH, 300);
		
		System.out.println("Calendario mas 300 dias " + calendario.getTime());
		
		calendario.setTime(fecha);
		calendario.add(Calendar.DAY_OF_MONTH, 365 * 4);
		
		System.out.println("Calendario mas 4 años " + calendario.getTime());
	}

}
