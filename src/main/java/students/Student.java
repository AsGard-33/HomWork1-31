package students;

public class Student {
    private String firstName;

    private String lastName;

    private String groupNumber;

    private int age;

    private String male;

    private String email;


    public Student(String firstName, String lastName, String groupNumber, int age,
                   String male, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.age = age;
        this.male = male;
        this.email = email;
    }
}
