package HomeWorkAIT.lesson30;

public class Teacher extends Employee{
    private String subject;

    public Teacher(String name, int age, int salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void doWork() {
        System.out.println(getName() + " uchitel , on(ona) prepodaet: " + getSubject() + ", emu(ej)" + getAge() + ", s zarplatoj v razmere: " + getSalary() + " $");
    }
}
