package day38_methods_calling_methods;

public class Palendrome_Practice {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));

    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
