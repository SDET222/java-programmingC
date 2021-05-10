package office_hours.may3;
import java.util.ArrayList;
import java.util.Arrays;
public class HidePassword {
    public static void main(String[] args) {

        String [] password = {"one", "hi", "hold"};

        ArrayList<String> hiddenPassword = new ArrayList<>();

        for(String each:password) {

            hiddenPassword.add(covertToStars(each));

        }
        System.out.println(hiddenPassword);


    }

    public static String covertToStars (String str) {

       String stars = "";

        for (int i = 0; i < str.length(); i++) {

            stars+="*";

        }
        return stars;

    }
}
