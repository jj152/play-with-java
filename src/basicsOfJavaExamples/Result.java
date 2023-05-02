package basicsOfJavaExamples;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

class Result {  
	
	public static LinkedList<Integer> insertNodeAtPosition(LinkedList<Integer> llist, int data, int position) {
		llist.add(position, data);
		return llist;
	 }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        LinkedList<Integer> llist = new LinkedList<Integer>();
        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            llist.add(llistItem);            
        }
        int data = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        llist = insertNodeAtPosition(llist, data, position);
        //bufferedWriter.newLine();
        //bufferedWriter.close();
        System.out.println(llist);
        scanner.close();
    }
}
