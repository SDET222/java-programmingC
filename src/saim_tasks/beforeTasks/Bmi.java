package saim_tasks.beforeTasks;

public class Bmi {
    public static void main(String[] args) {
        double mass = 75.5;
        double height  = 1.71;
        double bmi = mass/(height*height);

        if (bmi < 18.5) {
            System.out.println("Underweight");

        } else if (bmi >=18.5 && bmi<25) {
            System.out.println("Normal weight");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("Overweight");
        } else  {
            System.out.println("Obese");
        }





    }
}
