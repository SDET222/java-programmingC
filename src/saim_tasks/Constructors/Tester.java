package saim_tasks.Constructors;

public class Tester {

    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;

    public Tester() {

        System.out.println("Constructor no args 1...");
    }

        public Tester(String name, int employeeId, String jobTitle, double salary) {

            setName(name);
            setEmployeeId(employeeId);
            setSalary(salary);
            setJobTitle(jobTitle);


        }

        public void smokeTesting() {
            System.out.println("Smoke test suite");
        }
        public void creatingTicket() {
            System.out.println("Ticket #N created");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
