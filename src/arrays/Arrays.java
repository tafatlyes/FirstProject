package arrays;

import java.util.InputMismatchException;

public class Arrays {

    public static void main(String[] args) {
        try {
            String[] cars = {"Audi", "Mercedes", "BMW", "Toyota"};
            System.out.println(cars[0]);
            System.out.println(cars[4]);
        }
        catch (Exception e) {
            System.out.println("please review the integer number that you entered ");
        }
    }
}

