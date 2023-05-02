package functionalInterfaceExamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapExample01 {

	public static void main(String[] args) {
		List<String> sonnet = List.of("From fairest creatures we desire increase,",
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

		Map<String, String> result = sonnet.stream().collect(Collectors.toMap(line -> line.substring(0, 3),
				line -> line, (line1, line2) -> line1 + line2.substring(0, line2.length()-1)));
		
		System.out.println(result);

	}

}
