package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class HighestSalary {
    public static void main(String[] args) {
        Stream<User> streamOfListUsers = getListOfUsers().stream();
        User maxSalaryOfUser = streamOfListUsers.max(Comparator.comparingInt(User::getSalary)).get();
        System.out.printf("The highest salary of the user %s is " + maxSalaryOfUser.getSalary(), maxSalaryOfUser.getName());
    }

    public static ArrayList<User> getListOfUsers() {
        ArrayList<User> listOfUsers = new ArrayList<>();
        Collections.addAll(listOfUsers,
                new User("Igor", 6_000),
                new User("Svetlana", 8_000),
                new User("Artem", 15_000),
                new User("Sasha", 19_000),
                new User("Stepan", 10_000));
        return listOfUsers;
    }
}