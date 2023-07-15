package task5;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialNumber {
    public static void main(String[] args) {
        try (
                Scanner scanner = new Scanner(System.in);
        ) {
            int numberFromConsole = scanner.nextInt();
            BigInteger factorialOfNumber = getFactorial(numberFromConsole);
            System.out.println("Factorial of number " + numberFromConsole + " = " + factorialOfNumber);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    public static BigInteger getFactorial(int number) {
        if (number < 0) {
            throw new NumberFormatException("The factorial of numbers is calculated only by the natural value");
        } else if (number == 0 || number == 1) {
            return BigInteger.ONE;
        } else {
            return IntStream.rangeClosed(2, number).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }
}