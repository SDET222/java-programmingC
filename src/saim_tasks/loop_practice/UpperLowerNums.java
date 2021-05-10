package saim_tasks.loop_practice;

public class UpperLowerNums {
    public static void main(String[] args) {

        String w = "ADFGV49450FDTYskdlflv";
        int upperCase = 0;
        int lowerCase = 0;
        int numbers = 0;
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) >= 'A' && w.charAt(i) <= 'Z') {
                upperCase++;

            } else if (w.charAt(i) >= 'a' && w.charAt(i) <= 'z') {
                lowerCase++;

            } else if ((w.charAt(i) >= '0' && w.charAt(i) <= '9'))
                numbers++;
        }

        System.out.println("upperCase letters: " + upperCase);

        System.out.println("lowerCase letter: " + lowerCase);
        System.out.println("Numbers: " + numbers);


    }
}
