package collectionExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
 
class LinkedListToString {
    public static void main(String[] args)
    {
 
        // creating a linkedlist
        LinkedList<Integer> list = new LinkedList<>();
 
        // adding elements to linkedlist
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
 
        // By using String Class
        String s = "";
 
        // using iterator for traversing a linkedlist
        Iterator<Integer> iterator = list.iterator();
 
        while (iterator.hasNext()) {
            // appending using "+" operator
            s = s + iterator.next() + " ";
        }
 
        // Displaying output
        System.out.println("By using String Class - "+s);
 
        // By using String Buffer
        StringBuffer stringBuffer = new StringBuffer();
 
        // using enhanced for loop for traversing a
        // linkedlist
        for (Integer integer : list) {
           
            // using append method for appending string
            stringBuffer.append(integer).append(" ");
        }
 
        // displaying output
        System.out.println("By using String Buffer - "+stringBuffer);
 
        // By using String Builder
        StringBuilder stringBuilder = new StringBuilder();
 
        // using ListIterator for traversing a linked list
        ListIterator<Integer> listIterator
            = list.listIterator();
 
        while (listIterator.hasNext()) {
           
            // using append method for appending string
            stringBuilder.append(listIterator.next())
                .append(" ");
        }
 
        // displaying output
        System.out.println("By using String Builder - "+stringBuilder);
    }
}
