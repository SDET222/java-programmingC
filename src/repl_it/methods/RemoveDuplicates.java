package repl_it.methods;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(uniqueChars("mama"));


    }

    public static String uniqueChars(String str) {
        String nonDup = "";

        for (int i = 0; i < str.length() - 1; i++) {


                if (!nonDup.contains(""+str.charAt(i))) {
                    nonDup += str.charAt(i);

                }


        }return nonDup;


    }
}
//TODO: finish task!