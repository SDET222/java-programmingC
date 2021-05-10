package LoopsPracticeS;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "ABCDDDFFGGGTTSSD";
        String noDup="";
        for (int i = 0 ; i < str.length(); i++) {

            if (!noDup.contains(str.charAt(i)+"")) {
                noDup+=str.charAt(i);
            }

        }
        System.out.println(noDup);









    }
}
