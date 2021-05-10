package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countryCode = "USa";

        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("countryCode = " + countryCode);
        } else {
            System.out.println("Not UpperCase");
        }


    }
}
