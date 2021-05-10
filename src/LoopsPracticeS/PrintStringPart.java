package LoopsPracticeS;

public class PrintStringPart {
    public static void main(String[] args) {

        String str = "ramil_aliyev@gmail.com";

        String lastName = str.substring(str.indexOf("_")+1,str.indexOf("@"));
        System.out.println(lastName);








    }
}
