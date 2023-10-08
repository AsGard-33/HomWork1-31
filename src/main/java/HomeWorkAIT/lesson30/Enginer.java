package HomeWorkAIT.lesson30;

public class Enginer extends Employee {
    private String projectName;

    public Enginer(String name, int age, int salary, String projectName) {
        super(name, age, salary);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    void doWork() {
        System.out.println(getName() + " enginer , uchavstvuet v proekte: " + getProjectName() + ", emu(ej)" + getAge() + ", s zarplatoj v razmere: " + getSalary() + " $");
    }
}
