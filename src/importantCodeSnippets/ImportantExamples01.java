package importantCodeSnippets;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ImportantExamples01 {

	public static void main(String[] args) {
		listFileTree1();

		// Print the lines in a file, then "done"
		Path dir = Paths.get("D:\\AIIPL7003-233\\JEFFERSON\\Healthnickecl\\misc\\error_ph4_sp11.txt");
		try (Stream<String> lines = Files.lines(dir.toAbsolutePath())) {
			(lines.onClose(() -> System.out.println("done"))).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			listFilesSortByMdfDt();
			System.out.println("||||||||||||||||||||||||||");
			sortByLastModified();
			System.out.println("||||||||||||||||||||||||||");
			sortByLatestModified();
			System.out.println("||||||||||||||||||||||||||");
			readAllWordsFromFile();
			System.out.println("||||||||||||||||||||||||||");
			calculateVat();
			System.out.println("||||||||||||||||||||||||||");
			Optional<String> s = changeCase(null);
			System.out.println(s);
			System.out.println(LocalDateTime.now());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Traversing File Tree using Stream API
	public static void listFileTree1() {
		Path dir = Paths.get("D:\\Personal_Docz\\Study\\Certificates");
		System.out.printf("%nThe file tree for %s%n", dir.toAbsolutePath());
		try (Stream<Path> fileTree = Files.walk(dir)) {
			fileTree.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// List Files of a directory sorted by Last Modified Date
	public static void listFilesSortByMdfDt() throws IOException {
		Files.list(Paths.get("D:\\Personal_Docz\\Study\\Certificates")).map(Path::toFile)
				.sorted(Comparator.comparing(File::lastModified)).map(File::getName)
				.forEachOrdered(System.out::println);
	}

	// List Files of a directory sorted by Last Modified Date - same as previous
	public static void sortByLastModified() throws IOException {
		Files.list(Paths.get("D:\\Personal_Docz\\Study\\Certificates"))
				.sorted(Comparator.comparingLong(s -> s.toFile().lastModified())).map(Path::getFileName)
				.forEachOrdered(System.out::println);
	}

	// List Files of a directory sorted by Last Modified Date - reversed order
	public static void sortByLatestModified() throws IOException {
		Files.list(Paths.get("D:\\Personal_Docz\\Study\\Certificates"))
				.sorted((Comparator.comparingLong((Path s) -> s.toFile().lastModified())).reversed())
				.map(Path::getFileName).forEachOrdered(System.out::println);
	}

	// Parallel Sort contents [words] of a Big file
	public static void readAllWordsFromFile() throws IOException {
		String contents = null;
		try {
			contents = new String(
					Files.readAllBytes(
							Paths.get("D:\\AIIPL7003-233\\JEFFERSON\\Healthnickecl\\misc\\error_ph4_sp11.txt")),
					StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] words = contents.split("[\\P{L}]+"); // Split along nonletters
		Arrays.parallelSort(words);
		Stream<String> strm = Stream.of(words);
		strm.forEach(item -> System.out.println(item));
	}

	// Apply 12% VAT on the purchase items and calculate the Bill
	public static void calculateVat() {
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		double bill = costBeforeTax.stream().map((cost) -> cost + 0.12 * cost).reduce((sum, cost) -> sum + cost).get();
		System.out.println("Total : " + bill);
	}

	// Use of optional
	public static Optional<String> changeCase(String word) {
		if (word != null && word.startsWith("A")) {
			return Optional.of(word.toUpperCase());
		} else {
			return Optional.ofNullable(word); // someString can be null
		}
	}

}
