package InterviewQuestions;

public class FindUniqueFromString {
    public static void main(String[] args) {

        System.out.println("unique characters = " + uniqueChars("AAABBBCCCDEF"));
        System.out.println("unique characters from array = " + uniqueFromArray("AAABBBCCCDEFJ"));


    }

    public static String uniqueChars(String s) {
        //unique("AAABBBCCCDEF")  ==>  "DEF";

        int count = 0;
        String uniqueCharacters = "";

        for (int i = 0; i < s.length(); i++) {
            count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;

                }

            }
            if (count == 1) {
                uniqueCharacters += s.charAt(i);
            }

        }


        return uniqueCharacters;
    }

    public static String uniqueFromArray(String str) {
        //unique("AAABBBCCCDEFJ")  ==>  "DEFJ";

        String[] arr1 = str.split("");
        String unique2 = "";
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {

            counter = 0;

            for (int j = 0; j < arr1.length; j++) {

                if (arr1[i].equals(arr1[j])) {
                    counter++;
                }

            }
            if (counter == 1) {
                unique2 += arr1[i];
            }

        }
        return unique2;
    }
}
