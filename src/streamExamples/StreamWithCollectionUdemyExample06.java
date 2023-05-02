package streamExamples;

public class StreamWithCollectionUdemyExample06 {
    private static boolean isDirection(int ch) {
        switch(ch) {
            case 'N':
            case 'E':
            case 'W':
            case 'S':
                return true;
        }
        return false;
    }
 
    public static void main(String[] args) {
        String str = "North East West South";
        str.chars().filter(StreamWithCollectionUdemyExample06::isDirection)
                .forEach(c -> System.out.print((char)c));
    }
}