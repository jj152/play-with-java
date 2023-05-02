package importantCodeSnippets;

import java.time.*;
import java.time.format.*;

public class DateTimeFormatJavaTimeAPI {

	public static void main(String[] args) {
		formatMethod();
	}
	
	public static void formatMethod() {
		//Parsing
		 String pattern = "d-MM-yyyy HH:mm";
		 DateTimeFormatter dtF1 = DateTimeFormatter.ofPattern(pattern);
		 
		 LocalDateTime ldp1 = LocalDateTime.parse("2014-03-25T01:30"), //Default format
		 ldp2 = LocalDateTime.parse("15-05-2016 13:55",dtF1); //Custom format
		 
		 System.out.println(ldp1 + "\n" + ldp2); //Will be printed in Default format
		 
		 //Formatting
		 DateTimeFormatter dtF2 = DateTimeFormatter.ofPattern("EEE d, MMMM, yyyy HH:mm");		 
		 DateTimeFormatter dtF3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		 
		 LocalDateTime ldtf1 = LocalDateTime.now();
		 System.out.println(ldtf1.format(dtF2) +"\n"+ldtf1.format(dtF3));
		 
		 System.out.println( LocalDate.of(1974, 6, 2));
		 System.out.println(LocalDate.now().withMonth(6));
		 System.out.println(LocalDate.now().plusDays(1).plusYears(1));
	}

}
