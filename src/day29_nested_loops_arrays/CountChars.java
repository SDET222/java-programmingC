package day29_nested_loops_arrays;

public class CountChars {
    public static void main(String[] args) {


        String word = "java";

        for (int i = 0; i <word.length(); i++) {
            char outerChar= word.charAt(i);
            int count =0; // reset count to 0
            for (int j = 0; j <word.length(); j++) {

                char innerChar= word.charAt(j);
                if (outerChar==innerChar){
                    count++;
                }

            }
            System.out.println(outerChar+ ":" + count);
        }










    }
}
