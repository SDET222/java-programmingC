package day45_oop;

public class Coffee {
    double ammount;

    @Override
    public String toString() {
        return "Coffee{" +
                "ammount=" + ammount +
                ", type='" + type + '\'' +
                '}';
    }

    String type;

    void refill () {
        ammount=100.0;
    }
    void drink (int someAmmount) {
        if(someAmmount<=ammount) {

            ammount-=someAmmount;
        } else {
            System.out.println("Error!");
        }
//        System.out.println("you have drunk "+ someAmmount);
//        System.out.println("now you have "+(ammount-someAmmount)+" %");
    }
    double getAmmount() {
        return ammount;
    }
    void Settype (String coffeType) {
        type=coffeType;
        //System.out.println("Coffe type is " + type);
    }
    String getType () {
        return type;
    }
}
