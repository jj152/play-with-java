package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionInJava {

	public static void main(String[] args) {
		//List<String> alphabet = List.of("alfa", "bravo", "charlie", "delta", "ram", "shyam", "xfdf", "yyyyy");
		
		/*
		 * for(Iterator<String> it = alphabet.iterator();it.hasNext();) { String s =
		 * it.next(); if(s.startsWith("a")) it.remove(); }
		 */
		//alphabet.removeIf(s->s.startsWith("x"));
		/*
		 * System.out.println(alphabet); for(ListIterator<String> it =
		 * alphabet.listIterator();it.hasNext();) { it.set(it.next().toUpperCase()); }
		 * System.out.println(alphabet); alphabet.replaceAll(String::toLowerCase);
		 * System.out.println(alphabet);
		 */
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		  
        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(47);
        Numbers.add(63);
  
        // apply removeIf() method
        // we are going to remove numbers divisible by 3
        Numbers.removeIf(n -> (n % 3 == 0));
        
		for (Iterator<Integer> it = Numbers.iterator(); it.hasNext();) {
			Integer n = it.next();
			if (n % 4 == 0)
				it.remove();
		}
		
		Numbers.replaceAll(n->n*2);
  
        // print list
        for (int i : Numbers) {
            System.out.println(i);
        }
	}

}
