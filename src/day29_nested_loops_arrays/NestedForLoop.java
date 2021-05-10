package day29_nested_loops_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int minutes = 1; minutes <=5; minutes++) {
            System.out.println("\nminutes: " + minutes);
            System.out.println();
            for (int seconds = 1 ; seconds <= 60; seconds++){
                System.out.print(seconds+", ");

            }
        }


        for (int minutes =0; minutes<=4; minutes++) {
            for (int sec = 0; sec <60; sec++) {
                System.out.println(minutes+":"+sec);
               // Thread.sleep(500);
            }
        }








    }
}
