package day15_Logical_Operators_ops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {


        String city = "Tampa";

        if (city.equals("Tampa") || city.equals("Rome")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering " + city);
        }
        System.out.println("");

        String teacher = "Nadir";
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It is a Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skills class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }
        System.out.println("");
        String company = "Ntech";
        double salary = 100_000.0;
        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("I would accept this offer from "+company);
        } else {
            System.out.println("I'm not considering offer from "+company);
        }


    }


}
