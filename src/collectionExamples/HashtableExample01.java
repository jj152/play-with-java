package collectionExamples;

import java.util.Hashtable;

public class HashtableExample01 {

	public static void main(String[] args) {
		Hashtable<hashtableHelper, String> h = new Hashtable<hashtableHelper, String>();
		h.put(new hashtableHelper(5), "A");
		h.put(new hashtableHelper(2), "B");
		h.put(new hashtableHelper(6), "C");
		h.put(new hashtableHelper(15), "D");
		h.put(new hashtableHelper(23), "E");
		h.put(new hashtableHelper(16), "F");
		//h.put(new hashtableHelper(3), null); // RE : NPE
		System.out.println(h);
	}

}

class hashtableHelper{
	int i;
	public hashtableHelper(int i) {
		super();
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}
