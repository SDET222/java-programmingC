package saim_tasks.nested_loops;

public class ReverseSecondWord {
    public static void main(String[] args) {

        /**Given a String with three words separated by spaces. Reverse only the
         second word and return the modified String
         I love java */

        String word = "I love java";
        String reverse ="";

        String second = word.substring(word.indexOf(" ")+1,word.lastIndexOf(" "));

        for (int i = second.length()-1; i>=0; i--){
             reverse += second.charAt(i);
        }
        System.out.println(word.replace(second,reverse));












        }
    }

