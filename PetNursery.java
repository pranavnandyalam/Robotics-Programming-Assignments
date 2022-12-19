package PetNurseryCode;
import java.util.ArrayList;
 
public class PetNursery {
    ArrayList<Animals> animals;
    public PetNursery() {
        animals = new ArrayList<Animals>();
    }
    public void addAnimals(Animals animal) {
        animals.add(animal);
    }
    public void printAnimals() {
    }
    @Override
    public String toString() {
        return animals.toString();}
 
    public static void main(String args[]) {
        PetNursery nursery = new PetNursery();
        Dog d = new Dog("Max", 9, false);
        Cat c = new Cat("Riley", 21, true);
 
        nursery.addAnimals(d);
        nursery.addAnimals(c);
       
        System.out.println(nursery);
 
   }
}
