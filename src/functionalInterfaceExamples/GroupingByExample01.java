package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample01 {

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

		Map<String, List<String>> result = sonnet.stream().collect(Collectors.toMap(line -> line.substring(0, 1),
				line -> new ArrayList<>(Arrays.asList(line)), (line1, line2) -> {line1.addAll(line2); return line1;}));		
		System.out.println(result);
		
		// The above result can be achieved by groupingby
		result = sonnet.stream().collect(Collectors.groupingBy(line -> line.substring(0, 1)));
		System.out.println(result);
	}

}
