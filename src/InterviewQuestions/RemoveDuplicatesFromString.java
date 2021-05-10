package InterviewQuestions;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

        //removeDup("AAABBBCCC")  ==> ABC

        String str = "AAABBBCCC";

        String result  = "";

        for(int i = 0; i<str.length(); i++) {

            if(!result.contains(""+str.charAt(i))) {

                result+=str.charAt(i);

            } // Git hub from 05/10/2021


        }System.out.println(result);






    }
}
