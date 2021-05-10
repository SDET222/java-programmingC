package day37_methods_overloading;
import java.util.Arrays;
public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java",3,'|'));
        System.out.println(repeatString("sunnyDay",15,'/'));
    }

    public static String repeatString (String word, int times, char delimiter) {
        String str = "";
        for(int i=0; i<times; i++){
            str+=word+delimiter;

        }

        str=str.substring(0,str.length()-1);
        return str;
    }

}
