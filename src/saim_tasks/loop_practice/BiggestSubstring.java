package saim_tasks.loop_practice;

public class BiggestSubstring {
    public static void main(String[] args) {


        String str = "aabbbbjjjjjjjjjjjjkff";

        int count = 1;
        int max = 1;
        char maxChar = str.charAt(1);

        for (int i = 1; i < str.length(); i++) { // i should start one so we can check one
            // character before. without error.
            count = (str.charAt(i-1) == str.charAt(i)) ? (count + 1) : 1; //i was one so
            // we check 0 and 1 char first and so on. if they are equal count +1 if not count
            // resets to 1
            if (count > max) { //if count is greater than max
                max = count; // max sets itself to count's value
                maxChar = str.charAt(i); // maxChar gets the last value of i when it
                // came down to if statement. not the latest value.
            }
        }
        System.out.println("\nMost repeating: " + max + " times, for the character: " + maxChar);
        System.out.println(str.lastIndexOf(maxChar));

    }
}
