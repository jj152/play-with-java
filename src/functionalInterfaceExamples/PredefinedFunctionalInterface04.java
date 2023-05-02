package functionalInterfaceExamples;

import java.util.Scanner;
import java.util.function.Predicate;

/* Valid user if username contains "admin" and password contains "1234" */
class User{
	String userName;	
	String pwd;
	
	public User(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}
}

public class PredefinedFunctionalInterface04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<User> p = user -> user.userName.contains("admin") && user.pwd.contains("1234");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username - ");
		String userName = sc.next();
		System.out.print("Enter password - ");
		String pwd = sc.next();
		sc.close();
		User u = new User(userName, pwd);
		if(p.test(u)) {
			System.out.println("valid user");
		} else {
			System.out.println("invalid user");
		}		
	}

}
