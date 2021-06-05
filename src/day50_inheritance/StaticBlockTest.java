package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {


        StaticBlockPractice class1 = new StaticBlockPractice();

        StaticBlockPractice class2 = new StaticBlockPractice(); // runs only once

        StaticBlockPractice class3 = new StaticBlockPractice();

        System.out.println(StaticBlockPractice.num);

        System.out.println(StaticBlockPractice.carModels);

        StaticBlockPractice class4 = new StaticBlockPractice(50);

        System.out.println(StaticBlockPractice.num);





    }

}
