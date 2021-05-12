package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

    Animal a = new Animal();

    a.type = "lion";
    a.eat();
    a.speak();
    a.eat("antilopa");

    //create object cheetahObj

        Animal cheetahObj = new Animal();

        cheetahObj.type = "Cheetah";

        System.out.println(cheetahObj.type);
        cheetahObj.eat("fresh meat");



    }
}
