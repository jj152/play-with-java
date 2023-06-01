package innerClassExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
class Point {
     private int x;
     private int y;
 
     public Point(int x, int y) {
         this.x = x;
         this.y = y;
     }
 
     @Override
     public String toString() {
         return "Point(" + x + ", " + y + ")";
     }
}
 
public class InnerClassUdemyExample28 {
     public static void main(String [] args) {
         List<Point> points = new ArrayList<>();
         points.add(new Point(4, 5));
         points.add(new Point(6, 7));
         points.add(new Point(2, 2));
 
			/*
			  Collections.sort(points, new Comparator<Point>() {
			  
			  @Override public int compare(Point o1, Point o2) { return o1.x - o2.x; } });
			 */
     }
}