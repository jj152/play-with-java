package importantCodeSnippets;

public class reverseWordsAndString {
	public static void main(String[] args) {
		System.out.println("Happy Coding :)");
		String str = "qwerty asdf zxc";
		System.out.println("original string - " + str);
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " "; 
		}
		System.out.println("Each word is reversed but the string is not - " + reverseWord);
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1)
				reverseString = words[i] + reverseString;
			else
				reverseString = " " + words[i] + reverseString;
		}
		System.out.println("The string is reversed but the words are not - " + reverseString);
		String reverseStringAndWord = "";
		for (int i = 0; i < words.length; i++) {
			StringBuilder sb = new StringBuilder(words[i].toString());
			sb.reverse();
			if (i == words.length - 1)
				reverseStringAndWord = sb.toString() + reverseStringAndWord;
			else
				reverseStringAndWord = " " + sb.toString() + reverseStringAndWord;
		}
		System.out.println("The string and the words are reversed - " + reverseStringAndWord);
	}

}
