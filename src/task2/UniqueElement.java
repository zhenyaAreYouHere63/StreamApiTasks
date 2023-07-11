package task2;

import java.util.Arrays;

public class UniqueElement {
    public static void main(String[] args) {
        int[] count = Arrays.stream(getArrayNumbers())
                .flatMapToInt(Arrays::stream)
                .distinct()
                .toArray();
        System.out.println("List of unique elements: ");
        for (int j : count) {
            System.out.println(j);
        }
    }

    public static int[][] getArrayNumbers() {
        int[][] arrayOfNumber = new int[2][3];
        for (int[] number : arrayOfNumber) {
            Arrays.fill(number, 0, 2, 5);
        }
        arrayOfNumber[0][2] = 6;
        arrayOfNumber[1][2] = 7;
        return arrayOfNumber;
    }
}