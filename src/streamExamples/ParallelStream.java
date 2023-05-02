package streamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] wordsArr = { "hello", "world", "functional", "programming", "is","as", "cool", "as", "oop" };
		List<String> words = new ArrayList<>(Arrays.asList(wordsArr));
		System.out.println("Original - " + words);
		// using parallel stream
		List<String> processedWords = words.parallelStream().map((word) -> {
			System.out.println("uppercasing : " + word);
			return word.toUpperCase();
		}).map((word) -> {
			System.out.println("adding ! : " + word);
			return word.concat("!");
		}).collect(Collectors.toList());
		System.out.println("Modified - " + processedWords);
		System.out.println("-----------------------------------------");
		System.out.println("Original - " + words);
		// using stream
		List<String> processedWords1 = words.stream().map((word) -> {
			System.out.println("uppercasing : " + word);
			return word.toUpperCase();
		}).map((word) -> {
			System.out.println("adding ! : " + word);
			return word.concat("!");
		}).collect(Collectors.toList());
		System.out.println("Modified - " + processedWords1);
	}

}
//o/p ->
//Original - [hello, world, functional, programming, is, as, cool, as, oop]
//uppercasing : as
//adding ! : AS
//uppercasing : is
//adding ! : IS
//uppercasing : as
//uppercasing : oop
//uppercasing : world
//uppercasing : functional
//adding ! : WORLD
//uppercasing : cool
//uppercasing : hello
//adding ! : OOP
//adding ! : AS
//adding ! : HELLO
//adding ! : COOL
//uppercasing : programming
//adding ! : FUNCTIONAL
//adding ! : PROGRAMMING
//Modified - [HELLO!, WORLD!, FUNCTIONAL!, PROGRAMMING!, IS!, AS!, COOL!, AS!, OOP!]
//-----------------------------------------
//Original - [hello, world, functional, programming, is, as, cool, as, oop]
//uppercasing : hello
//adding ! : HELLO
//uppercasing : world
//adding ! : WORLD
//uppercasing : functional
//adding ! : FUNCTIONAL
//uppercasing : programming
//adding ! : PROGRAMMING
//uppercasing : is
//adding ! : IS
//uppercasing : as
//adding ! : AS
//uppercasing : cool
//adding ! : COOL
//uppercasing : as
//adding ! : AS
//uppercasing : oop
//adding ! : OOP
//Modified - [HELLO!, WORLD!, FUNCTIONAL!, PROGRAMMING!, IS!, AS!, COOL!, AS!, OOP!]
