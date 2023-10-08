package HomeWorkAIT.lesson21;

public class Manager extends Employee{
    private int numSubordinates;

    public Manager(String name, int salary, int numSubordinates) {
        super(name, salary);
        this.numSubordinates = numSubordinates;
    }

    public int getNumSubordinates() {
        return numSubordinates;
    }

    public void setNumSubordinates(int numSubordinates) {
        this.numSubordinates = numSubordinates;
    }

    @Override
    public  void work(){
        System.out.println(getName() + " upravlaet komandoj iz: " + getNumSubordinates() + " za: " + getSalary() + " US Dollars");
    }



}
