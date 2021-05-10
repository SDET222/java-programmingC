package repl_it.methods;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(uniqueChars("mama"));


    }

    public static String uniqueChars(String str) {
        String nonDup = "";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    count++;



                }

            } if (count==2){
                nonDup += "" + str.charAt(i);
            }

        }return nonDup;


    }
}
//TODO: finish task!