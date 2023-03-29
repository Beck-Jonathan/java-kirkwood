package en.codegym.task.task01.pro.pro.task06.task0610;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {

        return firstName;
    }

    String getLastName() {

        return lastName;
    }

    public String getFullName() {
        // return String.foramt(%s %S, firstName, lastName);
        return firstName + " " + lastName;
    }
}
