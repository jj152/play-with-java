package collectionExamples;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Java Program to sort LinkedHashSet of custom class objects using TreeSet
public class LinkedHashSetSort {

 public static void main(String[] args)
 {
     // creating a LinkedHashSet
     LinkedHashSet<Double> lset0 = new LinkedHashSet<>();

     // adding elements to LinkedHashSet
     lset0.add(1.009);
     lset0.add(1.10);
     lset0.add(1.01);
     lset0.add(1.019);

     // creating a TreeSet
     // and adding LinkedHashSet element to TreeSet
     // using the constructor of the TreeSet
     TreeSet<Double> tset0 = new TreeSet<>(lset0);

     // Displaying the output
     System.out.println("Sorted Set(ascending): "
                        + tset0);

     // creating a LinkedHashSet
     LinkedHashSet<Integer> lset1
         = new LinkedHashSet<>();

     // adding elements to LinkedHashSet
     lset1.add(10);
     lset1.add(7);
     lset1.add(2);
     lset1.add(20);

     // creating TreeSet
     TreeSet<Integer> tset1 = new TreeSet<>();

     // adding LinkedHashSet element to TreeSet
     // using for loop and add() method
     for (Integer i : lset1)
         tset1.add(i);

     // Displaying the output
     System.out.println("Sorted Set(ascending): "
                        + tset1);

     // creating LinkedHashSet
     LinkedHashSet<Character> lset2
         = new LinkedHashSet<>();

     // adding elements to the LinkedHashSet
     lset2.add('s');
     lset2.add('h');
     lset2.add('i');
     lset2.add('n');

     // creating a TreeSet
     TreeSet<Character> tset2 = new TreeSet<>();

     // adding LinkedHashSet element to TreeSet
     // element using addAll() method
     tset2.addAll(lset2);
     System.out.println("Sorted Set(ascending): "
                        + tset2);

     // creating a LinkedHashSet
     LinkedHashSet<String> lset3 = new LinkedHashSet<>();

     // adding elements to the
     // LinkedHashSet
     lset3.add("Sandra");
     lset3.add("Shishya");
     lset3.add("Sarthak");
     lset3.add("Sarah");
     lset3.add("Sagar");
     lset3.add("Sashi");
     lset3.add("Sonika");

     // creating a TreeSet but this time it will
     // sort it in descending order
     // so for sorting in descending order
     // we will use Collections.reverseOrder() in
     // the constructor of TreeSet
     TreeSet<String> tset3
         = new TreeSet<>(Collections.reverseOrder());

     // adding elements of LinkedHashSet to treeSet
     // using addAll() method
     tset3.addAll(lset3);

     // Displaying output
     System.out.println("Sorted Set(descending): "
                        + tset3);
 }
}
