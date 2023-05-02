package basicsOfJavaExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIntDoubleInString {

	static void countIndividualDataType(String sentence) {
		int intCount = 0;
		int doubleCount = 0;
		int stringCount = 0;
		String intRegex = "[+-]?[0-9]+";
		String doubleRegex = "[+-]?\\d[0-9]*\\.\\d[0-9]*";
		Pattern intPattern = Pattern.compile(intRegex);
		Pattern doublePattern = Pattern.compile(doubleRegex);
		for (String word : sentence.split(" ")) {
			if (word.substring(word.length() - 1).equals(","))
				word = word.substring(0, word.length() - 1);
			Matcher intMatcher = intPattern.matcher(word);
			Matcher doubleMatcher = doublePattern.matcher(word);
			if (intMatcher.find() && intMatcher.group().equals(word))
				intCount++;
			else if (doubleMatcher.find() && doubleMatcher.group().equals(word))
				doubleCount++;
			else
				stringCount++;
		}
		System.out.println(" Integer: " + intCount);
		System.out.println(" Double: " + doubleCount);
		System.out.println(" String: " + stringCount);
	}

	public static void main(String[] args) {
		String sentence = "give me 232346783456.76, 0.673453456874, -00.98, 1000000000, 00.00, -1.0 and 10 dollars";
		countIndividualDataType(sentence);
	}
}
