package day50_inheritance.OverridingExample;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog rex = new Dog();
        Cat murka = new Cat();
        Animal animal = new Animal();

        animal.name = "Murodil";
        animal.type = "Pitbull";
        animal.speak();

        rex.speak();

        murka.speak();




    }
}
