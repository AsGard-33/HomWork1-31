package HomeWorkAIT.lesson21;

public class Intern extends Employee{
    private String university;

    public Intern(String name, int salary, String university) {
        super(name, salary);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void work(){
        System.out.println(getName() + " rabotaet za: " + getSalary() + " US Dollars" + " i uchitsya v: " + university );
    }
}
