package saim_tasks.ArrayList_Practice;

import java.util.ArrayList;
import java.util.List;

public class GetUpperLowerCaseLambda {

    public static List<Character> getUpLoCase(String str, boolean isUpper) {

        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            upper.add(str.charAt(i));
            lower.add(str.charAt(i));
        }

        upper.removeIf(each -> Character.isLowerCase(each));
        lower.removeIf(each -> Character.isUpperCase(each));

        if (isUpper) return upper;
        return lower;

    }
}
