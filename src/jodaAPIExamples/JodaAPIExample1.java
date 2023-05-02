package jodaAPIExamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class JodaAPIExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		int dd = dt.getDayOfMonth();
		int mm = dt.getMonthValue();
		int yyyy = dt.getYear();
		System.out.printf("%d-%d-%d", dd,mm,yyyy);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		int hr = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		int nsec = time.getNano();
		System.out.printf("%d:%d:%d.%d", hr,min,sec,nsec);
		System.out.println();
		
		LocalDateTime dtime = LocalDateTime.now();
		System.out.println(dtime);
		int dd1 = dtime.getDayOfMonth();
		int mm1 = dtime.getMonthValue();
		int yyyy1 = dtime.getYear();
		System.out.printf("%d-%d-%d", dd1,mm1,yyyy1);
		System.out.println();
		int hr1 = dtime.getHour();
		int min1 = dtime.getMinute();
		int sec1 = dtime.getSecond();
		int nsec1 = dtime.getNano();
		System.out.printf("\n%d:%d:%d.%d", hr1,min1,sec1,nsec1);
		
		LocalDateTime dtime1 = LocalDateTime.of(2022, 5, 25, 13, 00);
		System.out.println(dtime1);
		
		System.out.println("after 12 month " + dtime1.plusMonths(12));
		
		LocalDate bday = LocalDate.of(1991, 8, 18);
		LocalDate tday = LocalDate.now();
		Period p = Period.between(bday, tday);
		System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());
		LocalDate dday = LocalDate.of(1991+70, 8, 18);
		p = Period.between(tday,dday);
		System.out.println(p.getYears() + " " + p.getMonths() + " " + p.getDays());
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter year ");
			int n = sc.nextInt();
			Year y = Year.of(n);
			if(y.isLeap()) {
				System.out.println("Leap year");
			} else {
				System.out.println("not");
			}
		}
		ZoneId zd = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(zd);
		System.out.println(zdt);
	}

}
