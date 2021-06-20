package day55_abstraction_interface.exercise_example;

public class AtTheGym {

    public static void main(String[] args) {
     //can not create object/instantiate abstract class

      Exercise exercise = new Running(); //polymorphism
      Running running = new Running();
      Swimming swimming = new Swimming();
      FreeWeight freeWeight = new FreeWeight();

      exercise.start();
      exercise.perform();
      System.out.println("exercise.getCalories(30) = " + exercise.getCalories(30));

      running.start();
      running.perform();
        System.out.println("running.getCalories(25) = " + running.getCalories(25));


        swimming.start();
        swimming.perform();
        System.out.println("swimming.getCalories(40) = " + swimming.getCalories(40));


    }
}
