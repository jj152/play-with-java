package innerClassExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
class Point30 {
    private int x;
    private int y;
    
    public Point30(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
 
    public int getY() {
        return y;
    }
 
    @Override
    public String toString() {
        return "Point30(" + x + ", " + y + ")";
    }
}
 
public class InnerClassUdemyExample30 {
    public static void main(String [] args) {
        List<Point30> points = new ArrayList<>();
        points.add(new Point30(4, 5));
        points.add(new Point30(6, 7));
        points.add(new Point30(2, 2));
        
        Collections.sort(points, new Comparator<Point30>() {
            public int compare(Point30 o1, Point30 o2) {
                return o2.getX() - o1.getX();
            }
        });
        
        System.out.println(points);
    }
}
