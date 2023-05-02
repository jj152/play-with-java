package importantCodeSnippets;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class TimeZoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		 ZoneId zone2 = ZoneId.of("Brazil/East");
		 LocalTime now = LocalTime.now();
		 LocalTime now1 = LocalTime.now(zone1);
		 LocalTime now2 = LocalTime.now(zone2);
		 
		 System.out.println("Current Time : " + now);
		 System.out.println("Berlin Time : " + now1);
		 System.out.println("Brazil Time : " + now2);
		 
		 long minutesBetween = ChronoUnit.MINUTES.between(now2, now1);
		 System.out.println("Minutes Between Berlin and Brazil : " + minutesBetween +"mins");
	}

}
