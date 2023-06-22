package task4;

public class User {
    private int salary;
    private String name;

    public User(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}