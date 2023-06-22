package task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class SumCostOfGoods
{
    public static void main(String[] args)
    {
        Stream <Goods> streamOfListGoods = getListOfGoods().stream();
        int sumGoods = streamOfListGoods.map(Goods::getCost).reduce(0, Integer::sum);
        System.out.println("Sum of goods = " + sumGoods);
    }

    public static ArrayList<Goods> getListOfGoods()
    {
        ArrayList<Goods> listOfCharacteristicGoods = new ArrayList<>();
        Collections.addAll(listOfCharacteristicGoods,
                    new Goods("Tomato", 50, 5),
                    new Goods("Cucumber", 45, 6),
                    new Goods("Strawberry", 80, 10),
                    new Goods("Cherry", 100, 20),
                    new Goods("WaterMelon", 120, 1));
        return listOfCharacteristicGoods;
    }
}