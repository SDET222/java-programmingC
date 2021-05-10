package day19_class_vs_object_strings;

public class StringReplace {
    public static void main(String[] args) {


        String sentence = "java strings are fun";

        System.out.println(sentence);
        System.out.println(sentence.replace(" " , "_"));
        System.out.println(sentence.replace("strings" , "conditions"));
        System.out.println(sentence.replace("java " , ""));



    }
}
