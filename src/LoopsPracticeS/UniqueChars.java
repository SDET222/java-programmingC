package LoopsPracticeS;

public class UniqueChars {
    public static void main(String[] args) {
        // AABCC

        String s = "AABCCR";


        for(int i = 0; i<s.length(); i++) {
            int count =0;
            for (int j =0; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)) {
                    count++;

                }
            } if (count==1) {
                System.out.println(s.charAt(i));
            }


        }






    }
}
