package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {

        loginVoid("Abcd", "1235");
        loginVoid("Abcd", "1234");
        System.out.println("===========================================");

        System.out.println(login("Abcd","1234"));
        System.out.println(login("Abcd","12345"));

        if(login("Abcd","1234")){
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed");
        }

        boolean isSuccess = login("Nadir","1234");
        System.out.println("is login success = "+ isSuccess);


    }

    public static void loginVoid(String userName, String password) {
        String sUserName = "Abcd";
        String sPassword = "1234";

        if (sUserName.equals(userName) && sPassword.equals(password)) {
            System.out.println("Sucsessful login");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login (String userName, String password) {
        String sUserName = "Abcd";
        String sPassword = "1234";

            return sUserName.equals(userName) && sPassword.equals(password);


    }

}
