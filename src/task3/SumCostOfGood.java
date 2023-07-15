package task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SumCostOfGood
{
    public static void main(String[] args)
    {
        int sumGoods = getListOfGoods().stream()
                .map(Good::getCost)
                .reduce(0, Integer::sum);
        System.out.println("Sum of goods = " + sumGoods);
    }

    public static ArrayList<Good> getListOfGoods()
    {
        ArrayList<Good> listOfCharacteristicGoods = new ArrayList<>();
        Collections.addAll(listOfCharacteristicGoods,
                    new Good("Tomato", 50, 5),
                    new Good("Cucumber", 45, 6),
                    new Good("Strawberry", 80, 10),
                    new Good("Cherry", 100, 20),
                    new Good("WaterMelon", 120, 1));
        return listOfCharacteristicGoods;
    }
}