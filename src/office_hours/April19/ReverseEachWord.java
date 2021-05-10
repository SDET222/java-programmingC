package office_hours.April19;

import day38_methods_calling_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It starts snowing in Chicago"));

    }

    public static String reverseEachWord(String str) {

        String reverse = "";
        for (String each : str.split(" ")) {
        String eachReverse ="";
          reverse += StringUtils.reverse(each) + " ";
        }
        return reverse;
    }

}
