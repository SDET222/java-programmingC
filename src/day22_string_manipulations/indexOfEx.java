package day22_string_manipulations;

public class indexOfEx {
    public static void main(String[] args) {

        String technologies = "java, html, css, selenium, testng, " +
                "maven, cucumber";

        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.indexOf("n,")+1);
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");

        System.out.println("java is at "+indexOfJava);

        int indexOfCss = technologies.indexOf("css");

        System.out.println("css is at " + indexOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");

        System.out.println("cucumber is at " + indexOfCucumber);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        } else {
            System.out.println("maven is not present");
        }
        if (technologies.indexOf("maven") >=0) {
            System.out.println("It is ok");
        } else {
            System.out.println("not found");
        }

    }
}
