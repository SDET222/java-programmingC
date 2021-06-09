package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee dev = new Employee();

        System.out.println("dev.calulateSalary(55.0) = " + dev.calulateSalary(55.0));
        double annualDevSalary = dev.calulateSalary(57.0);

        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

        Contractor sdet = new Contractor();

        System.out.println("sdet.calulateSalary(65) = " + sdet.calulateSalary(65));

        double sdetSalary = sdet.calulateSalary(57);
        System.out.println("sdetSalary = " + sdetSalary);


    }
}
