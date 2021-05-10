package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        if(weather.equals("sunny")) {
            System.out.println(weather+" :Lets go to park, hiking and enjoy");
        } else if (weather.equals("rainy")) {
            System.out.println(weather+" :Stay home and code Java");
        } else if (weather.equals("snowy")) {
            System.out.println(weather+" :Make snowman, drink hot chocolate, code Java");
        } else if (weather.equals("windy")) {
            System.out.println(weather+" :Get ready for power loss, fly a kite, and code Java");
        } else {
            System.out.println("Just keep coding Java");
        }






    }
}
