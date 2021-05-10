package day20_string_manipulation_methods;

public class StringIsEmpty {
    public static void main(String[] args) {


        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("\"JT\" is missing, please resend");
        } else {
            System.out.println("Job title looks good");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.toUpperCase());

        String veggie ="carrots";

        if (!veggie.isEmpty()) {
            System.out.println("We have "+veggie);
        }

        String word2;
        //System.out.println(word2.isEmpty());   ERROR


    }
}
