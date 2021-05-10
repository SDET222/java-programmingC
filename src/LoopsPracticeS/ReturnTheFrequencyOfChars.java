package LoopsPracticeS;

public class ReturnTheFrequencyOfChars {
    public static void main(String[] args) {

        String s = "AABCBCA";
        int count =0;
        String nonDup = "";
        for (int i = 0 ; i <s.length(); i++) {
          count=0;

          for (int j = 0; j < s.length(); j++) {
              if (s.charAt(i)==s.charAt(j)) {
                  count++;
              }
          } if (count==1) {
              nonDup+=s.charAt(i);
            }

        }










    }
}
