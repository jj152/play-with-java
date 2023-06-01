package lambdaExamples;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayWithCurrencyConverter {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, 11, 5);
		CurrencyConverter converter = CurrencyConverter.of(date).from("EUR").to("GBP");
		double euros = 1d;
        double convertedEuros = converter.convert(euros);
        double gbps = 0.87749d;
        System.out.println(convertedEuros);
	}
}

interface CurrencyConverter {
	double convert(double amount);
	
	interface BiFunction {
		Double convert(Double amount, String toCurrency);
		
		default CurrencyConverter to(String toCurrency) {
			return amount -> convert(amount, toCurrency);
		}
	}	
	interface triFunction {
		Double convert(Double amount, String fromCurrency, String toCurrency);
		
		default BiFunction from(String fromCurrency) {
			return (amount, toCurrency) -> convert(amount, fromCurrency, toCurrency);
		}
	}
	static triFunction of(LocalDate date) {
		return (amount, fromCurrency, toCurrency) -> {
			Path path = Paths.get("D:\\Personal_Docz\\Study\\eclipse_workspace\\play-with-java\\src\\lambdasAndStreamsMasterClass\\currency.txt");
			try (Stream<String> lines = Files.lines(path)) {
				Map<String, Double> convertedMap = lines.skip(1L)
						.collect(Collectors.toMap(line -> line.substring(1, 3), line -> Double.parseDouble(line.substring(4))));
				return amount * (convertedMap.get(toCurrency) / convertedMap.get(fromCurrency));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return amount;
		};
	}
}