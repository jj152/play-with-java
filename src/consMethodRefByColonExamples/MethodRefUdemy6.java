package consMethodRefByColonExamples;

interface Creator2<T> {
    T create();
}
 
enum AnimalType {
     MAMMAL, BIRD, REPTILE;
}
 
abstract class Animal {
     private AnimalType type;
 
     public Animal(AnimalType type) {
         this.type = type;
     }
 
     public AnimalType getType() {
         return type;
     }
}
 
class Dog1 extends Animal {
     public Dog1(AnimalType type) {
         super(AnimalType.MAMMAL);
     }
}
 
public class MethodRefUdemy6 {
     public static void main(String[] args) {
         //Creator2<Dog1> obj = Dog1::new;
         //Dog1 d = obj.create();
         //System.out.println(d.getType());
     }
}
