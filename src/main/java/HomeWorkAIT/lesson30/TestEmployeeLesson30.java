package HomeWorkAIT.lesson30;

public class TestEmployeeLesson30 {
    public static void main(String[] args) {
        Doctor hirurg = new Doctor("Martin",35,3500,"'Hirurg'");
        Doctor terapevt = new Doctor("Marina",45,2800,"'Terapevt'");
        Enginer midl = new Enginer("Alexsey",37,6055,"'online store development'");
        Enginer junior = new Enginer("Vadim",19,2000,"'chat bot development'");
        Teacher mathematician = new Teacher("Valentina",40,2300,"'mathematic'");
        Teacher biologist = new Teacher("Andrey",25,2200,"'Biology'");

        hirurg.doWork();
        terapevt.doWork();
        midl.doWork();
        junior.doWork();
        mathematician.doWork();
        biologist.doWork();
        System.out.println("___________________");
        hirurg.setName("Valentin");
        hirurg.setAge(38);
        hirurg.setSalary(4500);
        hirurg.setSpecialization("Micro-hirurg");
        hirurg.doWork();
        System.out.println("___________________");
        midl.setProjectName("'development of a system that displays the work of various professions'");
        midl.doWork();
        System.out.println("___________________");
        mathematician.setSubject("'Geometry'");
        mathematician.doWork();
    }
}
