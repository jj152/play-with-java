package lambdaExamples;

//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1
{
	int x = 0;
 // default method
 default void show()
 {
     System.out.println("Default TestInterface1");
 }
}

interface TestInterface2
{
	 int x = 13;
 // Default method
 default void show()
 {
     System.out.println("Default TestInterface2");
 }
}

//Implementation class code
class DefaultMethodMultipleInheritence implements TestInterface1, TestInterface2
{
 // Overriding default show method
 public void show()
 {
	 int x = 69;
     // use super keyword to call the show
     // method of TestInterface1 interface
     TestInterface1.super.show();
     //TestInterface1.x = 12;
     System.out.println(x);
     //System.out.println(this.x);
     System.out.println(TestInterface1.x);
     System.out.println(TestInterface2.x);

     // use super keyword to call the show
     // method of TestInterface2 interface
     TestInterface2.super.show();
 }

 public static void main(String args[])
 {
	 DefaultMethodMultipleInheritence d = new DefaultMethodMultipleInheritence();
     d.show();
 }
}
