package InterviewQuestions;

public class ReverseStringNoSpec {
    public static void main(String[] args) {

        System.out.println(reverseNoSpec("ab$f@klkjlk*"));


    }
    public static String reverseNoSpec (String str) {
        // "ab$fe@sd!"
        int length = str.length()-1;
        String reversed ="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                for (int j = length; j >=0; j--) {
                    if(Character.isLetter(str.charAt(j))) {
                        reversed+=str.charAt(j);
                        length=j-1;
                        break;
                    }


                }

            } else {
                reversed+=str.charAt(i);
            }

        }

        return reversed;
    }
}
