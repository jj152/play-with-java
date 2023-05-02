package importantCodeSnippets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sudarshan1 {

	private String convertUICapacityDate(String inputString) {
	    Date sourceFormat;
			String targetFormat = null;
			try {
				sourceFormat = new SimpleDateFormat("MM-dd-yyyy").parse(inputString);
				targetFormat = new SimpleDateFormat("yyyy-MM-dd").format(sourceFormat);			
			} catch (ParseException e) {
				e.getMessage();
			}
	    return (targetFormat != null ? targetFormat : "error while parsing");
	}
	
	public static void main(String[] args) {
		//Input=04-08-2022 and Output=2022-04-08			
		System.out.println(new sudarshan1().convertUICapacityDate("04-08-2022"));
	}

}
