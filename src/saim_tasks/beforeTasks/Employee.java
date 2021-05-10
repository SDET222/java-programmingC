package saim_tasks.beforeTasks;

public class Employee {
    public static void main (String [] args) {
/*first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

    Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ $company name .com)
        - Salary after 3 years (base salary + start month * 10000)
            Ex: base: 100000
                start day: 2
                after 3 year: (100000 + (2 * 1000)) = 102000

 */

        String firstName = "Jeff";
        String lastName = " Bezos";
        String companyName = "Amazon";
        int salary = 250000;
        byte startDay = 5;
        String startMonth = "January ";
        String startYear = ",2021";
        boolean areFullTime = true;
        String jobTitle = "CEO";
        String officeAddress = "1 Main Ave. Palo Alto, CA";
        String fullName = firstName + lastName;
        String startDate = startMonth + startDay + startYear;
        String email = firstName + startDay +"@"+ companyName + ".com";
        double salaryAfter3Years = salary + startDay * 10000;

        System.out.println("*****  Amazon New Hire Information  *****");
        System.out.println("");
        System.out.println(firstName + ", welcome to Amazon!");
        System.out.println("Your start date as a CEO will be on "+startDate);
        System.out.println("You are full time: " + areFullTime + " and will be making "
        + salary + "$ per year." );
        System.out.println("The office is located at: " + "\n" + officeAddress);
        System.out.println("");
        System.out.println("\t\tOfficial information:");
        System.out.println("New hire name: " + fullName);
        System.out.println("Starts on:      " + startDate);
        System.out.println("Email generated: " + email);
        System.out.println("Your expected salary after 3 years: $" + salaryAfter3Years);







    }



}
