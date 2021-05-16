package InterviewQuestions;

public class FrequencyOfCharacters {

    String str;

    String characters(String s) {
        String s2 = "";
        //("AAABBCDD") ==> A3B2C1D2
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;

                }

            }
            if (!(s2.contains("" + s.charAt(i)))) {
                s2 += s.charAt(i) + "" + count;
            }


        }


        return s2;
    }

    public static void main(String[] args) {
        FrequencyOfCharacters first = new FrequencyOfCharacters();

        System.out.println(first.characters("AAABBCDD"));
    }

}
