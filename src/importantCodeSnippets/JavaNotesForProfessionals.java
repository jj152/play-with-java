package importantCodeSnippets;

import java.time.LocalDateTime;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class JavaNotesForProfessionals {
	public static void main(String[] args) {
		JavaNotesForProfessionals jnfp = new JavaNotesForProfessionals();
		System.out.println("call to NonNumericPrimitiveCasting() - ");
		jnfp.NonNumericPrimitiveCasting();
		System.out.println("call to ObjectCasting() - ");
		jnfp.ObjectCasting();
		System.out.println("call to checkDoublePrimitive() - ");
		jnfp.checkDoublePrimitive();
		System.out.println("call to stringTokenizerVsSplit() - ");
		jnfp.stringTokenizerVsSplit();
		for (int i = 0; i <= 26; i++) {
			char letter = (char) ('a' + i);
			System.out.println(letter);
		}
	}

	void NonNumericPrimitiveCasting() {
		// int badInt = (int) true; // Compiler error: incompatible types
		char char1 = (char) 65; // A
		byte byte1 = (byte) 'A'; // 65
		short short1 = (short) 'A'; // 65
		int int1 = (int) 'A'; // 65
		char char2 = (char) 8253; // ‽
		
		/* Error code starts here */
		// byte byte2 = (byte) '‽'; // 61 (truncated code-point into the ASCII range)
		// short short2 = (short) '‽'; // 8253
		// int int2 = (int) '‽'; // 8253
		// System.out.println(char1 + " " + byte1 + " " + short1 + " " + int1 + " " +
		// char2 + " " + byte2 + " " + short2
		// + " " + int2);
		/* Error code ends here */
	}

	void ObjectCasting() {
		Float floatVar = new Float(42.0f);
		Number n = floatVar; // Implicit (Float implements Number)
		Float floatVar2 = (Float) n; // Explicit
		// Double doubleVar = (Double) n; //Throws exception (the object is not Double)
		System.out.println(floatVar + " " + n + " " + floatVar2 + " ");
		// System.out.println(floatVar + " " + n+ " " + floatVar2+ " " + doubleVar);
	}

	void checkDoublePrimitive() {
		double d1 = 0d;
		double d2 = -0d;
		System.out.println(d1 == d2); // true
		System.out.println(1d / d1); // Infinity
		System.out.println(1d / d2); // -Infinity
		System.out.println(Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY); // NaN
	}

	void stringTokenizerVsSplit() {
		String str = "the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence the lazy fox jumped over the brown fence ";
		StringTokenizer tokenizer = new StringTokenizer(str);
		System.out.println(LocalDateTime.now());
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now());
		String[] arr = str.split(" ");
		for (String x : arr) {
			System.out.println(x);
		}
		System.out.println(LocalDateTime.now());
	}
}
