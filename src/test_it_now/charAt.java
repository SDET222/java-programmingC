package test_it_now;

public class charAt {
    public static void main(String[] args) {

        String word = "xjavaX";
        word=word.toLowerCase();

        if (word.charAt(0)=='x' || word.charAt(word.length()-1)=='x'){

            //System.out.println(word.substring(1), word.lastIndexOf("x"));
        } else {
            System.out.println("false");
        }



    }
}
