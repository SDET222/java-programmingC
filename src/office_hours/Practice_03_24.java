package office_hours;

public class Practice_03_24 {
    public static void main(String[] args) {


        String accountNumber ="5234567890";

        if (accountNumber.startsWith("2")) { //if accountNumber.charAt(0)=='2'

            if (accountNumber.length()==7) {
                System.out.println("Valid  digit account number");
            } else {
                System.out.println("Not valid 7 digit account num");
            }
        } else if (accountNumber.startsWith("5")) {
            if (accountNumber.length()==10) {
                System.out.println("Valid  digit account number");
            } else {
                System.out.println("Not valid 5 digit account num");
            }

        } else {
            System.out.println("Not valid account number");
        }



    }
}
