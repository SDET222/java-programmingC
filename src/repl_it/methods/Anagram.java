package repl_it.methods;

public class Anagram {
    public static void main(String[] args) {

        //isAnagram("listen", "Silent") ==> true
        System.out.println(isAnagram("Senior", "resion"));

    }

    public static boolean isAnagram(String word1, String word2) {
        int count = 0;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j)) {
                    count++;
                }

            }

        }
        if (count == word1.length()) {
            return true;
        } else {
            return false;
        }

    }

}
