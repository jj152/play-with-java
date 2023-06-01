package innerClassExamples;

public class AnonymousClassesExample {	  
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {        
        // local class declaration
    	class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Local " + name);
            }
        }
    	HelloWorld englishGreeting = new EnglishGreeting();                
        // anonymous class declaration
    	HelloWorld englishGreetingAnother = new HelloWorld() {
        	String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Anonymous " + name);
            }
        };        
        englishGreeting.greet();
        englishGreeting.greetSomeone("Universe");
        englishGreetingAnother.greet();
        englishGreetingAnother.greetSomeone("Universe");        
    }

    public static void main(String... args) {
        new AnonymousClassesExample().sayHello();
    }            
}
