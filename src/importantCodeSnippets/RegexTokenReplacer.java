package importantCodeSnippets;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * We can use java regex to find and replace special tokens from a given text.
 * We can switch on case insensitiveness of pattern by providing Pattern.CASE_INSENSITIVE in the Pattern.compile() method.
*/
public class RegexTokenReplacer {
	private Pattern pattern = Pattern.compile("\\{(.+?)\\}", Pattern.CASE_INSENSITIVE);

	public String replaceTokens(String text, Map<String, String> replacements) {
		Matcher matcher = pattern.matcher(text);
		StringBuffer buffer = new StringBuffer();
		while (matcher.find()) {
			String replacement = replacements.get(matcher.group(1).toLowerCase());
			if (replacement != null) {
				matcher.appendReplacement(buffer, "");
				buffer.append(replacement);
			}
		}
		matcher.appendTail(buffer);
		return buffer.toString();
	}

	public static void main(String[] args) {
		RegexTokenReplacer tokenReplacer = new RegexTokenReplacer();
		Map<String, String> props = new HashMap<>();
		props.put("name", "Ranadip");
		props.put("contact", "+91808066XX");
		String replaceTokens = tokenReplacer.replaceTokens("my name is {Name}, {name}'s contact is {contact}", props);
		System.out.println(replaceTokens);
	}

}
