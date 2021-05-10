package day18_conditions_practice_strings_intro;

public class AuthentificationTest {
    public static void main(String[] args) {


        int last4Ssn = 9898;
        int pinCode = 9995;
        int expLast4Ssn = 9898;
        int expPinCode = 9996;

        if (last4Ssn == expLast4Ssn && pinCode == expPinCode) {
            System.out.println("Successful authentication");
        } else {
            System.out.println("Unsuccessful authentication");
            if (last4Ssn != expLast4Ssn) {
                System.out.println("SSN is not matching");

            }  if (pinCode != expPinCode) {
                System.out.println("Pin code is not matching");
            }
        }


    }
}
