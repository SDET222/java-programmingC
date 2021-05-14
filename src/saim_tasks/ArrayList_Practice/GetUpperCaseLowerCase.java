package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.List;

public class GetUpperCaseLowerCase {
    public static void main(String[] args) {
        System.out.println(getUpperLowerCase("Ferrari", true));

        System.out.println(GetUpperLowerCaseLambda.getUpLoCase("SDETbaku",false));


    }
    public static List<String> getUpperLowerCase (String str, boolean isUpeerCase) {

        List<String> letters = new ArrayList<>();


            for (int i = 0; i < str.length(); i++) {
                if (isUpeerCase) {
                    if (Character.isUpperCase(str.charAt(i))) {
                        letters.add(""+str.charAt(i));
                    }

                } else if (Character.isLowerCase(str.charAt(i))){
                    letters.add(""+str.charAt(i));
                }
            }




        return letters;
    }


}
