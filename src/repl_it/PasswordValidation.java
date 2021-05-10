package repl_it;

public class PasswordValidation {
    public static void main(String[] args) {

        System.out.println(passwordValidation("Abc33422dDf$"));

    }
    public static boolean passwordValidation (String str) {


        return str.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*");
    }

}
