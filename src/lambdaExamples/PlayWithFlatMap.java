package lambdaExamples;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PlayWithFlatMap {

	public static void main(String[] args) {
		List<String> alphabet = Arrays.asList("alfa", "bravo", "charlie", "delta");

	    List<String> sonnet = Arrays.asList(
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
	    System.out.println(sonnet.stream().flatMap(line -> Arrays.stream(line.split(" +"))).collect(Collectors.toList()));
	    
	    BigInteger res = LongStream.rangeClosed(1,21).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
	    System.out.println(res);

	}

}
