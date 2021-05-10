package day22_string_manipulations;

public class DynamicSubstring {
    public static void main(String[] args) {


        String word = "Baku is the best city";

        System.out.println(word.substring(word.indexOf("b")));
        System.out.println(word.substring(word.indexOf("B"),word.indexOf("c")));



        String today ="I learned [python] today";

        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));
        System.out.println(today.substring(today.indexOf ("[")+1, today.indexOf("]")));

        String j = ""+today.substring(today.indexOf ("[")+1, today.indexOf("]"));

        System.out.println(j);


    }
}
