package repl_it.methods;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("jaav"));


    }
    public static int wordCount(String words) {
        int count =1;
        for(int i = 0; i<words.length(); i++){
            if (words.charAt(i)==' ') {
                count++;
            }

        } return count;
    }

}
