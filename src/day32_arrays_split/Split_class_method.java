package day32_arrays_split;

import java.util.Arrays;

public class Split_class_method {
    public static void main(String[] args) {

        String words = "java; python; ruby";
        String[] arrayWords = words.split(";"); // assign to String ARRAY

        System.out.println(Arrays.toString(arrayWords));
        System.out.println("length of Array - "+arrayWords.length);

        for(String each:arrayWords) {
            System.out.println(each);
        }

        String words2 = "java is fun";

        String [] sentenceArray = words2.split(" ");

        for (String each:sentenceArray) {

            System.out.println(each);
        }
        System.out.println("Words in Sentence = "+arrayWords.length);
        System.out.println("1st word "+arrayWords[0]);
        System.out.println("2nd word "+arrayWords[1]);
        System.out.println("3rd word "+arrayWords[2]);





        System.out.println(Arrays.toString(words2.split(" ")));

        String words3 = "bengal cat baku cat persian cat russian cat";

        System.out.println(Arrays.toString(words3.split(" cat ")));


        String googleResult = "About 1,810,000 results (0.68 seconds)";

        String [] arrayR = googleResult.split(" ");

        System.out.println("Count = "+arrayR[1]);
        System.out.println("Seconds = " + arrayR[arrayR.length-2].replace("(",""));



    }
}
