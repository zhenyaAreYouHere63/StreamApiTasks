package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ListOfStudent {
    public static void main(String[] args) {
        Stream<Student> streamOfListStudents = getListOfStudents().stream();
        List<Student> filterOfStudents = streamOfListStudents.filter(x -> x.getAge() > 18 && x.getAverageMark() == 90).toList();
        System.out.println("List of filtered name: ");
        for (Student filterOfStudent : filterOfStudents) {
            System.out.println(filterOfStudent.getName() + " ");
        }
    }


    public static ArrayList<Student> getListOfStudents() {
        ArrayList<Student> listOfStudents = new ArrayList<>();
        Collections.addAll(listOfStudents,
                new Student("Eugene", 21, 65),
                new Student("Alice", 25, 90),
                new Student("Mark", 17, 97),
                new Student("Nazar", 15, 84),
                new Student("Peter", 19, 90));
        return listOfStudents;
    }
}