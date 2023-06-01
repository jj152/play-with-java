package innerClassExamples;

public class InnerAndStaticNestedWithUnrelated {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {    	
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(InnerAndStaticNestedWithUnrelated outer) {
            // Compiler error: Cannot make a static reference to the non-static field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        InnerAndStaticNestedWithUnrelated.InnerClass innerObject = new InnerAndStaticNestedWithUnrelated().new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();        
        staticNestedObject.accessMembers(new InnerAndStaticNestedWithUnrelated());
        
        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        UnrelatedClass topLevelObject = new UnrelatedClass();        
        topLevelObject.accessMembers(new InnerAndStaticNestedWithUnrelated());                
    }
}

class UnrelatedClass {
    void accessMembers(InnerAndStaticNestedWithUnrelated outer) {     
        // Compiler error: Cannot make a static reference to the non-static field OuterClass.outerField
        // System.out.println(OuterClass.outerField);
        System.out.println(outer.outerField);
        System.out.println(InnerAndStaticNestedWithUnrelated.staticOuterField);
    }  
}