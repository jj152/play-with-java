package importantCodeSnippets;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.stream.IntStream;

public class sudarshan {
	
	public static void main(String[] args) {
		
		String[] allTime = new String[] {"09.00 PM-10.00 PM","09.00 PM-10.00 PM","09.00 PM-10.00 PM"};
		String[] allTime1 = new String[allTime.length];
		String[] allTime2 = new String[allTime.length];
		String[] allTime3 = new String[allTime.length];
		
		IntStream.range(0, allTime.length)
        .forEach(index -> {
        		String time = allTime[index];
		        String[] times = time.split("-");
		
		        SimpleDateFormat sourceFormat = new SimpleDateFormat("hh.mm aa");
		        SimpleDateFormat targetFormat = new SimpleDateFormat("HHmm");
		
		        String formattedTime1 = null;
		        String formattedTime2 = null;
		
		        try {
		            formattedTime1 = targetFormat.format(sourceFormat.parse(times[0].trim()));
		            formattedTime2 = targetFormat.format(sourceFormat.parse(times[1].trim()));
		        } catch (ParseException e) {
		            e.printStackTrace();
		        }
		        //o/p format 1
		        String newTime = MessageFormat.format("[\"{0} - {1}\"]", formattedTime1, formattedTime2);
		        allTime1[index] = newTime.toString();
		        //o/p format 2
		        String newTime1 = MessageFormat.format("\"{0} - {1}\"", formattedTime1, formattedTime2);
		        allTime2[index] = newTime1.toString();
		        //o/p format 3
		        String newTime2 = MessageFormat.format("{0} - {1}", formattedTime1, formattedTime2);      
		        allTime3[index] = newTime2.toString();
        });
		System.out.println(Arrays.toString(allTime1)); // o/p format 1
		System.out.println(Arrays.toString(allTime2)); // o/p format 2
		System.out.println(Arrays.toString(allTime3)); // o/p format 3
	}
}






