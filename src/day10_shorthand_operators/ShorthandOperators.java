package day10_shorthand_operators;

public class ShorthandOperators {
    public static void main (String [] args) {

        int cars = 10;
        System.out.println("cars = " + cars);
        cars +=4;
        System.out.println("cars = " + cars);
        cars -= 2;
        System.out.println("cars = " + cars);
        System.out.println("cars = " + ++cars);
        System.out.println("cars = " + cars);
        cars -= 1;
        System.out.println("cars = " + cars);
        System.out.println("************************");

        int eV = 13;
        //cars = cars + eV;
        cars +=eV;
        System.out.println("cars in parking lot = " + cars);
        System.out.println("*************************************");

        String word = "Java";
        System.out.println("word = " + word);
        word = word + " programming";
        System.out.println("word = " + word);
        word+= " is fun";
        System.out.println("word = " + word);

        String selenium = " but selenium is more fun!";
        word += selenium;
        System.out.println("word = " + word);
        word += 12345;
        System.out.println("word = " + word);
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter +=3;
        System.out.println("letter = " + letter);
        letter +=1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking fee = $" + parkingFee);
        parkingFee /=2;
        System.out.println("Early bird parking fee = $" + parkingFee);
        parkingFee -=parkingFee;
        System.out.println("Weekend parking fee = $" + parkingFee);






    }





}
