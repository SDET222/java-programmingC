package day59_polymorphism_exeptions.exeption_handling;

import java.text.spi.DateFormatProvider;

public class SwallowingException {
    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(5/0);
        } catch(Exception ignore) { }


        System.out.println("Ferrari");
        System.out.println("We just suppresed/swallowed the Runtime Exception");
        System.out.println("Error is not reported, we just IGNORED IT");



    }
}
