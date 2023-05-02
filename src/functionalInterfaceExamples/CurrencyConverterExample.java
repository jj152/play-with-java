package functionalInterfaceExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CurrencyConverterExample {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2022, 12, 16);
        try (Stream<String> lines = Files.lines(Paths.get("currency.txt")); Scanner myObj = new Scanner(System.in)) {
        	List<String> result = lines.skip(1L).map(line->line.substring(0,3)).collect(Collectors.toList());
        	System.out.println("available currencies - ");
        	System.out.println(result);
        	System.out.print("From currency. Enter something listed above - ");
        	String fromCurrency = myObj.next().toUpperCase();
        	System.out.print("Enter amount(only number) - ");
			double fromAmount = myObj.nextDouble();
        	System.out.print("To currency. Enter something listed above - ");
        	String toCurrency = myObj.next().toUpperCase();
        	if(!result.contains(fromCurrency) || !result.contains(toCurrency))
        		throw new MyExp();
        	else {
        		CurrencyConverter converter = CurrencyConverter.of(date).from(fromCurrency).to(toCurrency);
        		System.out.println("converted from "+ fromAmount+fromCurrency+ " to "+converter.convert(fromAmount)+toCurrency);
        	} 	        
        } catch (MyExp|InputMismatchException|IOException e) {
        	if (e instanceof MyExp)
        		System.out.println("From/to currency not listed. Try with different currency..");
        	else if (e instanceof InputMismatchException)
        		System.out.println("Enter only number..");
        	else
        		System.out.println("Something went wrong..");
        }        
	}
}

class MyExp extends RuntimeException{
	private static final long serialVersionUID = 1L;
	MyExp(){
		super();
	}
}
