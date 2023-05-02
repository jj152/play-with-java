package innerClassExamples;

class InnerClassUdemyExample09 {
    private int num1 = 100;
 
    class N {
        private int num2 = 200;
    }
    
    public static void main(String[] args) {
    	InnerClassUdemyExample09 outer = new InnerClassUdemyExample09();
    	InnerClassUdemyExample09.N inner = outer.new N();
        System.out.println(outer.num1 + inner.num2);
    }
}
