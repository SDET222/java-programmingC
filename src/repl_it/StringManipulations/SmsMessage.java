package repl_it.StringManipulations;
import java.util.Scanner;
public class SmsMessage {
    public static void main(String[] args) {
//        Given a String message in the following format:
//         Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem
//         solving}
//         assign the value of the sender, phoneNumber, and messageBody variables and print them.

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender= message.substring(message.indexOf("<")+1 , message.indexOf(">"));
        String phoneNumber= message.substring(message.indexOf("[")+1 , message.indexOf("]"));
        String messageBody= message.substring(message.indexOf("{")+1 , message.indexOf("}"));
        System.out.println();
        System.out.println("Sender: " + sender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);





    }
}
