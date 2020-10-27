package arrays;

import java.util.ArrayList;

public class ArrayListPract {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mercedes");
        System.out.println(cars);

        ArrayList<Integer> price = new ArrayList<Integer>();

       price.add(10_000);
        price.add(20_000);
        price.add(30_000);
        System.out.println(price);
    }
}
