package exceptionExamples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ThrowExample2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new ThrowExample2().dostuff();
	}
	
	public void dostuff() throws IOException {
		domorestuff();
	}
	public void domorestuff() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("D:\\Personal_Docz\\BDS_MDS\\abc.txt");
		pw.write("Hello world");
		pw.close();
	}

}
