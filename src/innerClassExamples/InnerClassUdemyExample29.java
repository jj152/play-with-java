package innerClassExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
class Point29 {
     private int x;
     private int y;
 
     public Point29(int x, int y) {
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
         return "Point(" + x + ", " + y + ")";
     }
}
 
public class InnerClassUdemyExample29 {
     public static void main(String [] args) {
         List<Point29> points = new ArrayList<>();
         points.add(new Point29(4, 5));
         points.add(new Point29(6, 7));
         points.add(new Point29(2, 2));
 
			/*
			 * Collections.sort(points, new Comparator<Point29>() { public int
			 * compareTo(Point29 o1, Point29 o2) { return o1.getX() - o2.getX(); } });
			 */
 
         System.out.println(points);
     }
}