package HomeWorkAIT.lesson30;

public class Doctor extends Employee{
    private String specialization;

    public Doctor(String name, int age, int salary, String specialization) {
        super(name, age, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    void doWork() {
        System.out.println(getName() + " lechit ludej , on(ona): " + getSpecialization() + ", emu(ej)" + getAge() + ", s zarplatoj v razmere: " + getSalary() + " $");
    }
}
