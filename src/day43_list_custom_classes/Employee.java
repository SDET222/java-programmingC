package day43_list_custom_classes;

public class Employee {

    String name;
    String jobTitle;

    public void work () {
        System.out.println("Hard working employee ==> " + name + " works as " + jobTitle);
    }



} class SDET {
    public static void main(String[] args) {

        Employee sdet = new Employee();
        Employee sdet2 = new Employee();
        Employee sdet3 = new Employee();

        sdet.name = "Donald";
        sdet.jobTitle = "SDET";

        System.out.println(sdet.name);
        System.out.println(sdet.jobTitle);

        sdet.work();
        System.out.println("================================");

        sdet2.name= "John";
        sdet2.jobTitle = "QA tester";
        System.out.println(sdet2.name);
        System.out.println(sdet2.jobTitle);

        sdet2.work();

        System.out.println("===============================");

        sdet3.name = "Kamran";
        sdet3.jobTitle = "SDET-Lead";

        System.out.println(sdet3.name);
        System.out.println(sdet3.jobTitle);

        sdet3.work();
        System.out.println("===========================");

        sdet.work();
        sdet2.work();
        sdet3.work();

    }
}
