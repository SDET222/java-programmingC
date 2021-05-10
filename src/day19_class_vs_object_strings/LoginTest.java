package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {

//        userName is not case sensitive
//        password is case sensitive
//
//        WHEN expUserName equals userName AND expPassword equals password
//    -> "Pass - user successfully logged in"
//
//        OTHERWISE:
//        WHEN expUserName NOT equals userName
//                -> "Incorrect Username"
//        OTHERWISE:
//        -> "Incorrect password"

        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String userName = "cybertek";
        String password = "Abc1234";

        if (userName.equalsIgnoreCase(expUserName) && password.equals(expPassword)) {
            System.out.println("Pass - user successfully logged in " + Instant.now());

        } else if (!userName.equalsIgnoreCase(expUserName) && !password.equals(expPassword)) {
            System.out.println("Incorrect user name and password");
        }
        else if (!userName.equalsIgnoreCase(expUserName)) {
            System.out.println("Incorrect Username");
        } else   {
            System.out.println("Incorrect password");
        }



    }
}
