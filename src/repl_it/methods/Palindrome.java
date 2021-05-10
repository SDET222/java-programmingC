package repl_it.methods;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("james"));



    }
    public static boolean isPalindrome(String check) {
        check=check.toLowerCase().replace(" ","");
        boolean isPalendrome = true;
        for (int i = 0; i<check.length()/2; i++){
            if (check.charAt(i)==check.charAt(check.length()-i-1)){
                isPalendrome=true;
            } else {
                isPalendrome=false;
            }
        }  return isPalendrome;


    }


}
