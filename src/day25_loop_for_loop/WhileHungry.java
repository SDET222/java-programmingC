package day25_loop_for_loop;

public class WhileHungry {
    public static void main(String[] args) {


        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;


         while (isHungry) {
             bananas++;
             System.out.println("Eating banana: "+bananas);
             if (bananas==countToFull) {
                 isHungry=false;
             }
         }
        System.out.println("Had enough bananas");






    }
}
