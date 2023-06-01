package innerClassExamples;

interface Sellable {
    double getPrice();
}

public class InnerClassUdemyExample27 {
    private static void printPrice(Sellable sellable) {
        System.out.println(sellable.getPrice());
    }
    public static void main(String[] args) {
        /*INSERT*/
    	//printPrice(null);
    	printPrice(new Sellable() {

			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			
		});
    }
}
