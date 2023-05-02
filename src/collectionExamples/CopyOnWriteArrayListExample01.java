package collectionExamples;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample01 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<String>();
		l.add("A");
		System.out.println("--- addIfAbsent() demo ---");
		System.out.println("l - "+l);		
		l.add("A");		
		System.out.println("l after l.add(\"A\") - "+l);
		l.addIfAbsent("A");
		System.out.println("l after l.addIfAbsent(\"A\") - "+l);// difference b/w add() and addIfAbsent(). Existing element(e.g., A) won't be added for addIfAbsent().
		l.addIfAbsent("B");		
		System.out.println("l after l.addIfAbsent(\"B\") - "+l);// difference b/w add() and addIfAbsent(). Non-existing element(e.g., B) will be added for addIfAbsent().
		
		System.out.println("--- addAllAbsent() demo ---");
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("C");
		al.add("X");
		System.out.println("al - "+al);
		System.out.println("l - "+l);
		al.addAll(l);		
		System.out.println("al after al.addAll(l) - "+al);
		System.out.println("l - "+l);
		System.out.println("al - "+al);
		l.addAllAbsent(al);// difference b/w addAll() and addAllAbsent(). Existing element(e.g., A/B) won't be added for addAllAbsent().		
		System.out.println("l after l.addAllAbsent(al) - "+l);
		
	}
}
