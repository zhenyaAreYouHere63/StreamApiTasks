package task1;

public class Student {
    private final String name;
    private final int age;
    private final double averageMark;


    public Student(String name, int age, double averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageMark() {
        return averageMark;
    }
}