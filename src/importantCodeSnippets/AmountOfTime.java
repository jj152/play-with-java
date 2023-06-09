package importantCodeSnippets;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AmountOfTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculat();
	}
	public static void calculat() {
		
		LocalTime start = LocalTime.of(1, 0, 0); // hour, minute, second
		LocalTime end = LocalTime.of(2, 10, 20); // hour, minute, second

		long halfDays1 = start.until(end, ChronoUnit.HALF_DAYS); // 0
		long halfDays2 = ChronoUnit.HALF_DAYS.between(start, end); // 0

		long hours1 = start.until(end, ChronoUnit.HOURS); // 1
		long hours2 = ChronoUnit.HOURS.between(start, end); // 1		
		System.out.println(hours1 + " ---- " + hours2);

		long minutes1 = start.until(end, ChronoUnit.MINUTES); // 70
		long minutes2 = ChronoUnit.MINUTES.between(start, end); // 70		
		System.out.println(minutes1 + " ---- " + minutes2);

		long seconds1 = start.until(end, ChronoUnit.SECONDS); // 4220
		long seconds2 = ChronoUnit.SECONDS.between(start, end); // 4220		
		System.out.println(seconds1 + " ---- " + seconds2);

		long millisecs1 = start.until(end, ChronoUnit.MILLIS); // 4220000
		long millisecs2 = ChronoUnit.MILLIS.between(start, end); // 4220000
		System.out.println(millisecs1 + " ---- " + millisecs2 );
		
		long microsecs1 = start.until(end, ChronoUnit.MICROS); // 4220000000
		long microsecs2 = ChronoUnit.MICROS.between(start, end); // 4220000000
		System.out.println(microsecs1 + " ---- " + microsecs2 );
		
		long nanosecs1 = start.until(end, ChronoUnit.NANOS); // 4220000000000
		long nanosecs2 = ChronoUnit.NANOS.between(start, end); // 4220000000000		
		System.out.println(nanosecs1 + " ---- " + nanosecs2 );

		// Using others ChronoUnit will be thrown UnsupportedTemporalTypeException.
		// The following methods are examples thereof.
		long days1 = start.until(end, ChronoUnit.DAYS);
		long days2 = ChronoUnit.DAYS.between(start, end);		
		System.out.println(days1 + " ---- " + days2);
	}
}
