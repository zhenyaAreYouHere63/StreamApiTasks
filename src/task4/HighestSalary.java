package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HighestSalary {
    public static void main(String[] args) {
        User maxSalaryOfUser = getListOfUsers().stream()
                .max(Comparator.comparingInt(User::getSalary))
                .get();
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