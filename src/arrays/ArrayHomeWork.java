package arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayHomeWork {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<String> foodNames = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {   // I set up 5 numbers for te array and I used  for loop
            System.out.println("Enter your number " + i + " favorite food:");

            foodNames.add(s.nextLine()); // I stored the names of food in the array "foodNames"
        }
        System.out.println(foodNames);

        for (int i = 1; i <= 5; i++) {
            Random random = new Random();


        }
    }
}
