package importantCodeSnippets;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LetterFrequency {
	public static void main(String[] args) {
		String str = "picture perfect".toLowerCase();
		int[] freq = new int[str.length()];
		char s[] = str.toCharArray();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;
			int x = freq[i];
			for (int j = i + 1; j < str.length(); j++) {
				if (s[i] == s[j]) {
					x = freq[i] + 1;					
					s[j] = '0'; // Set string[j] to 0 to avoid printing visited character
				}
				if (String.valueOf(s[i]) != null && String.valueOf(s[i]).matches("[a-z]+")) {
					hm.put(String.valueOf(s[i]), x);
				}
			}
		}
		for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		//java 8 way
		Stream.of(str.toLowerCase().split(""))
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e->e!=null && !e.toString().contains(" "))
        .map(e -> e.getKey()+e.getValue()+" ")
        .forEach(System.out::print);
	}
}
