package lambdaExamples;

import java.util.ArrayList;
import java.util.Collections;

class Emp{
	int id;
	String name;
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
}

public class SortWithLambdaExpObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(1, "a"));
		al.add(new Emp(26, "z"));
		al.add(new Emp(11, "k"));
		al.add(new Emp(2, "b"));
		//Collections.sort(al, (a,b)-> a.id>b.id?-1:b.id>a.id?1:0);
		Collections.sort(al, (a,b)-> a.id<b.id?-1:b.id<a.id?1:0);
		System.out.println(al); 
	}

}
