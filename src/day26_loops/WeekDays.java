package day26_loops;

public class WeekDays {
    public static void main(String[] args) {

        // int day = 1;

        for (int i = 0; i <= 10; i++) {

            switch (i) {

                case 1:
                    System.out.println(i + " - Monday");
                    break;
                case 2:
                    System.out.println(i + " - Tuesday");
                    break;
                case 3:
                    System.out.println(i + " - Wednesday");
                    break;
                case 4:
                    System.out.println(i + " - Thursday");
                    break;
                case 5:
                    System.out.println(i + " - Friday");
                    break;
                case 6:
                    System.out.println(i + " - Saturday");
                    break;
                case 7:
                    System.out.println(i + " - Sunday");
                    break;
                default:
                    System.out.println("Invalid day. Today is Java day");


            }
        }




    }


}

