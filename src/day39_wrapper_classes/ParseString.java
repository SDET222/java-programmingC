package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {


        String total = "345";
        int n = Integer.parseInt(total);
        System.out.println("Converted total = " + n);

        String strPrice = "12.99";
        double price = Double.parseDouble(strPrice);
        System.out.println("Converted price = " + price);

        String sentence = "I wrote 300 lines of code";
        String[] arr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println(linesOfCode);


    }
}
