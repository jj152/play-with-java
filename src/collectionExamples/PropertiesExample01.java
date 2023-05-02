package collectionExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesExample01 {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Personal_Docz\\Study\\STS_WORKSPACE\\play-with-java\\abc.properties");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("user");
		System.out.println(s);
		p.setProperty("qwerty", "tce6u7v8b");
		FileOutputStream fos = new FileOutputStream("D:\\Personal_Docz\\Study\\STS_WORKSPACE\\play-with-java\\abc.properties");
		p.store(fos, "has been updated");
		p.load(fis);
		System.out.println(p);
		p.setProperty("user", "j");
		p.store(fos, "has been updated again");
		p.load(fis);
		System.out.println(p);
	}
}
