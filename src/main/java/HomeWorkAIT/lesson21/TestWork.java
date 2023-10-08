package HomeWorkAIT.lesson21;

import java.util.ArrayList;
import java.util.List;

public class TestWork {
    public static void main(String[] args) {
        Employee employee = new Employee("Alex",260000);
        Employee employee1 = new Employee("Igor",260000);
        Manager manager = new Manager("Maxim Kaspersky",160000,150);
        Manager manager1 = new Manager("Anatoliy Kachunin",100000,90);
        Engineer enginer = new Engineer("Ilon Mask",90000,"Razrabotka proektov");
        Engineer enginer1 = new Engineer("Vadim Molotov",80000,"Testirovshik");
        Intern intern = new Intern("Vasilij Morozov",2500,"Hogwarts");
        Intern intern1 = new Intern("Maksim Kotov",2200,"University of Cambridge");


        employee.work();
        employee1.work();
        manager.work();
        manager1.work();
        enginer.work();
        enginer1.work();
        intern.work();
        intern1.work();
        System.out.println("---------------------");
        //Sozdajom spisok sotrudnikov
     List<Employee> listOfEmploees =new ArrayList<>();
     listOfEmploees.add(employee);
     listOfEmploees.add(employee1);
     listOfEmploees.add(manager);
     listOfEmploees.add(manager1);
     listOfEmploees.add(enginer);
     listOfEmploees.add(enginer1);
     listOfEmploees.add(intern);
     listOfEmploees.add(intern1);


     //prohodim ciklom po vsem sotrudnikam i vizivaem metod WORK dlya kagdogo
    for (Employee employee2 : listOfEmploees){

         employee2.work();
    }
    System.out.println("-------------------");
    //Ispolzovanie setterov dlya ustanovki novih znachenij i getterov dlya poluchenija znachenij
    System.out.println("Zamena sotrudnika: " + employee1.getName() + " na- Konstantin");
    employee1.setName("Konstantin");
    System.out.println("Employee1 uspeshno zamenen na: " + employee1.getName());
    System.out.println("-------------------");

    System.out.println("Podnyatie stavki manager1: " + manager1.getName());
    manager1.setSalary(101000);
    System.out.println("Novij oklad uspesno izmenen na: " + manager1.getSalary() + " US Dollars");
    System.out.println("-------------------");

    System.out.println("Izmenenie kollichestva sotrudnikov v podchinenii u manager1: " + manager1.getName());
    manager1.setNumSubordinates(100);
    System.out.println("Kolichestvo sotrudnikov uspeshno izmeneno na: " + manager1.getNumSubordinates());
    System.out.println("-------------------");

    System.out.println("Zamena dolgnosti u enginer1: " + enginer.getName());
    enginer.setSpecializacion("Full Stack developer");
    System.out.println("Uspeshnoe izmenenie dolgnosti na: " + enginer.getSpecializacion());
    System.out.println("-------------------");

    System.out.println("Zamena Univesitat intern: " + intern.getName());
    intern.setUniversity("University of Oxford");
    System.out.println("Uspeshnoe izmenenie Univesitat intern na: " + intern.getUniversity());

    }
}
