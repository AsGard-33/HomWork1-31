package HomeWorkAIT.lesson21;

public class Engineer extends Employee{

    private String specializacion;

    public Engineer(String name, int salary, String specializacion) {
        super(name, salary);
        this.specializacion = specializacion;
    }

    public String getSpecializacion() {
        return specializacion;
    }

    public void setSpecializacion(String specializacion) {
        this.specializacion = specializacion;
    }

    @Override
    public void work(){
        System.out.println(getName() +" rabotaet na dolgnosti: " + specializacion + " za " + getSalary() + " US Dollars");
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "specializacion='" + specializacion + '\'' +
                '}';
    }
}
