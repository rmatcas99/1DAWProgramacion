package capitulo6.DateCalendar;

import java.util.Calendar;
import java.util.TimeZone;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Obtén la hora actual en Roma (Italia), también la hora actual en Sidney (Australia) y calcula la diferencia horaria entre las dos ciudades.		
	
		
		Calendar horaEnRoma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Italy"));
		Calendar horaEnSidnei = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));
		
		System.out.println("Roma " + horaEnRoma.get(Calendar.HOUR_OF_DAY));
		System.out.println("Sidney " + horaEnSidnei.get(Calendar.HOUR_OF_DAY));
		System.out.println("Diferencia Horaria: " + Math.abs(horaEnSidnei.get(Calendar.HOUR_OF_DAY)-horaEnRoma.get(Calendar.HOUR_OF_DAY)) + " horas.");
	}

}
