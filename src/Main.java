import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

import javax.sound.sampled.Line;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Imprime la fecha de hoy
		LocalDate fechaActual = LocalDate.now();
		System.out.println("La fecha de hoy es:" + fechaActual);

		// Imprime la hora actual
		LocalTime horaActual = LocalTime.now();
		System.out.println("La hora actual es:" + horaActual);

	
		System.out.println("La fecha y la hora actual es: "+fechaActual+" ---> "+horaActual);

		LocalDate fechaActual1 = LocalDate.now();	
		LocalDate fechanueva=fechaActual.plusMonths(3).plusDays(23);
		System.out.println(fechanueva);

		LocalTime horaActual1=horaActual.plusHours(14);
		System.out.println(fechanueva+" ---> "+horaActual1);

		LocalDate fechaActual2 = LocalDate.now();	
		LocalDate fechanueva1=fechaActual.minusMonths(43).minusDays(23);
		System.out.println(fechanueva1);

		LocalTime horaActual2=horaActual.plusHours(14);
		System.out.println(fechanueva1+" ---> "+horaActual2);

		LocalDate fechanueva2=fechaActual.plusYears(1);
		if(fechanueva2.getYear()%4==0)
		{
			System.out.println("Esto se ha cambiado desde git.");
			System.out.println("El año actual mas 1 es bisiesto.");
		}
		else
		{
			System.out.println("El año actual mas 1 no es bisiesto.");

		}
		LocalDate fechanueva3=fechaActual.plusYears(2);
		if(fechanueva3.getYear()%4==0)
		{
			System.out.println("El año actual mas 2 es bisiesto.");
		}
		else
		{
			System.out.println("El año actual mas 2 no es bisiesto.");

		}
		LocalDate fechanueva4=fechaActual.plusYears(3);
		if(fechanueva4.getYear()%4==0)
		{
			System.out.println("El año actual mas 3 es bisiesto.");
		}
		else
		{
			System.out.println("El año actual mas 3 no es bisiesto.");

		}

		LocalDate tiempo=fechaActual.plusMonths(3).plusDays(23);
		


		
		LocalDate tiempo1=fechaActual.minusMonths(43).minusDays(23);
		LocalDate tiempoPasado=fechaActual.minusMonths(46).minusDays(46);

		System.out.println("Ha pasado "+tiempo1.getMonth()+tiempo.getMonth()+" Meses "+tiempo1.getYear()+tiempo.getYear()+" años");
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		
		try {
			DateTimeFormatter formatoFechaCadena = DateTimeFormatter.ofPattern("MM yyyy, dd --> HH:mm:ss");
			String cadenaConFormato = fechaHoraActual.format(formatoFechaCadena);
			System.out.println(cadenaConFormato);
			
		}catch(DateTimeParseException infoExcepcion) {
			System.out.printf("La cadena %s no es formateable -> Corregir!");
			infoExcepcion.printStackTrace();
		}

		System.out.println();
		System.out.println();

		LocalTime horasalida=horaActual.plusHours(8).plusMinutes(16);



		double tiempopasado=horasalida.getMinute()+horasalida.getHour()*60;
		double precioparking=tiempopasado*0.021;

		System.out.println("El precio del aparcar aquí es de "+precioparking+" EUR");
		
  

	}

}
