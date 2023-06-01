package consAndMethodRefExamples;

interface Creator5<T, R> {
    R create(T t);
}
 
class Log {
    Log() {
        System.out.println(1);
    }
    
    Log(String name) {
        System.out.println(2);
    }
}
 
public class MethodRefUdemy14 {
    public static void main(String[] args) {
        Creator5<String, Log> obj = Log::new;
    }
}
