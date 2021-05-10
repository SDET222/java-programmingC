package LoopsPracticeS;

public class PrintA {
    public static void main(String[] args) {

        //input: String a="a2b5c7a9f0dafa2s6a8d5a";
        //            output==> aaaaaa2b5c79f0df2s68d5

        String s = "a2b5c7a9f0dafa2s6a8d5a";
        String a ="";
        String rest = "";

        for (int i = 0; i<s.length(); i++) {

            if (s.charAt(i)=='a') {
                a+=s.charAt(i);
            } else {
                rest+=s.charAt(i);
            }


        }
        System.out.println(a+rest);













    }
}
