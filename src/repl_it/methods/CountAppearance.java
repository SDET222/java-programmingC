package repl_it.methods;

import day38_methods_calling_methods.StringUtils;

public class CountAppearance {
    public static void main(String[] args) {

        String arr[] = {"a","foo","bar","foo","bla"};
        System.out.println(StringUtils.countAppearance(arr, "foo"));
    }
}
