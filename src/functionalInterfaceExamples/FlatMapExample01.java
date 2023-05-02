package functionalInterfaceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FlatMapExample01 {
	public static void main(String[] args) {
		//List<String> alphabet = List.of("alfa", "bravo", "charlie", "delta");

	    List<String> sonnet = List.of(
	            "From fairest creatures we desire increase,",
	            "That thereby beauty's rose might never die,",
	            "But as the riper should by time decease,",
	            "His tender heir might bear his memory:",
	            "But thou contracted to thine own bright eyes,",
	            "Feed'st thy light's flame with self-substantial fuel,",
	            "Making a famine where abundance lies,",
	            "Thy self thy foe, to thy sweet self too cruel:",
	            "Thou that art now the world's fresh ornament,",
	            "And only herald to the gaudy spring,",
	            "Within thine own bud buriest thy content,",
	            "And, tender churl, mak'st waste in niggarding:",
	            "Pity the world, or else this glutton be,",
	            "To eat the world's due, by the grave and thee.");
	    Pattern pattern = Pattern.compile(" +");
	    List<String> words = sonnet.stream().flatMap(pattern::splitAsStream).collect(Collectors.toList());
	    System.out.println(words);
	    System.out.println("words size - "+words.size());
	    List<String> words1 = sonnet.stream().flatMap(line -> Arrays.stream(line.split(" +"))).collect(Collectors.toList());
	    System.out.println(words1);
	    System.out.println("words1 size - "+words1.size());
	}
}
