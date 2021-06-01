package saim_tasks.Constructors;

public class TesterObject {
    public static void main(String[] args) {


        Tester t1 = new Tester("James Bond",  10005455, "SDET", 114000.1);

        System.out.println("t1.getName() = " + t1.getName());

        System.out.println("t1.getJobTitle() = " + t1.getJobTitle());

        System.out.println(t1);


    }
}
