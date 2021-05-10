package day23_string_manipulations_while_loop;

public class SmsMessage {
    public static void main(String [] args){


        String message = "Sender: [  Nadir] From Number<2223334444> Message:{Hello," +
                "lets code some java}";

            int start = message.indexOf("[")+1;
            int end = message.indexOf("]");
            String sender =  message.substring(start,end);

        System.out.println(sender);

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">") );
        System.out.println("mobile = " + mobile);

        String messageIn = message.substring(message.indexOf("{")+1,message.indexOf("}") );
        System.out.println("messageIn = " + messageIn);
        System.out.println("   Name ".trim());
        sender=sender.trim();

        if (sender.equals("Nadir")){
            System.out.println("Message from NadiR");
        } else {
            System.out.println("Message from someone els");
        }







    }
}
