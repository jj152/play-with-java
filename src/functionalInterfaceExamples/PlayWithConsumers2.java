package functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
 
public class PlayWithConsumers2 {
    public static void main(String args[])
    {
        
    	// Creating a list
    	List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        
        System.out.println("-- Initial List -- ");
    	
    	// Consumer to display a number
        Consumer<List<Integer> > displayInitialList = initialDisplayList -> initialDisplayList.stream().forEach(a -> System.out.print(a + " "));
 
        // Implement display using accept()
        displayInitialList.accept(list);
        
        System.out.print("\n");
 
        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer> > modifiedList = initialList ->
        {
            for (int i = 0; i < initialList.size(); i++)
            	initialList.set(i, 2 * initialList.get(i));
        }; // implementing accept(T t) of Consumer interface
        
        // Implement modify using accept()
        modifiedList.accept(list);
        
        System.out.println("-- Modified List -- ");
 
        // Consumer to display a list of numbers
        Consumer<List<Integer> >
        displayModifiedList = modifiedDisplayList -> modifiedDisplayList.stream().forEach(a -> System.out.print(a + " ")); // implementing accept(T t) of Consumer interface 
 
        // Implement dispList using accept()
        displayModifiedList.accept(list);
    }
}
