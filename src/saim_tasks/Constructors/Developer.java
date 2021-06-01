package saim_tasks.Constructors;

public class Developer {

    private String name;
    private int employeeId;
    private String jobTitle;
    private double salary;
    private boolean hasCodingSkills;


    public Developer (String name, int employeeId, String jobTitle, double salary, boolean hasCodingSkills) {

        setName(name);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
        setHasCodingSkills(hasCodingSkills);


    }

    public void coding() {
        System.out.println("Coding Java");
    }

    public void fixingBugs() {
        System.out.println("Bug fixing loading..........");
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

    public boolean isHasCodingSkills() {
        return hasCodingSkills;
    }

    public void setHasCodingSkills(boolean hasCodingSkills) {
        this.hasCodingSkills = hasCodingSkills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasCodingSkills=" + hasCodingSkills +
                '}';
    }
}
