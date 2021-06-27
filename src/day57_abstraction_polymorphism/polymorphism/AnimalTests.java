package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.makeNoise();
        //polymorphic way
        Animal animal2 = new Dog();
        animal2.makeNoise();

        Animal animal3 = new Horse();
        animal3.makeNoise();

        Animal animal4 = new Cat();
        animal4.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for(Animal each:listOfAnimals) {
            each.makeNoise();
        }











    }
}
