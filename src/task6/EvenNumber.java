package task6;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

public class EvenNumber {
    private static final String answerYes = "Yes";
    private static final String answerNo = "No";

    public static void main(String[] args) {
        Stream<Integer> streamOfListNumbers = getListOfNumbers().stream();
        boolean checkOfEven = streamOfListNumbers.anyMatch(x -> x % 2 == 0);
        String answerToEven = checkOfEven ? answerYes : answerNo;
        System.out.println("There is an even number in the list? " + answerToEven);
    }

    private static ArrayList<Integer> getListOfNumbers() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        try (
                Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                if (scanner.hasNextInt()) {
                    listOfNumbers.add(scanner.nextInt());
                } else {
                    System.out.println("The list should contain only numbers");
                    throw new NumberFormatException();
                }
            }

        } catch (NoSuchElementException e) {
            System.err.println(e.getMessage());
        }
        return listOfNumbers;
    }
}