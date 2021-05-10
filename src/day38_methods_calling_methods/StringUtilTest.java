package day38_methods_calling_methods;
import static day38_methods_calling_methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {
        System.out.println("is anagram = "+isAnagram("self4","4felS"));

        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: Username can not be null or empty");
        }

        System.out.println("civic = "+StringUtils.isPalendrome("civic"));
        System.out.println("isPalendrome(kayak) = "+StringUtils.isPalendrome("kayak"));
        System.out.println("isPalendrome(Cybertek) = "+isPalendrome("Cybertek"));

        System.out.println("================================");
        System.out.println(reverse("Sunnyday"));

        String word = "Baku";
        String revWord = reverse(word);
        System.out.println("revWord = " + revWord);



    }

}
