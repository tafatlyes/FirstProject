package arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> listOfCity = new ArrayList<>();

        listOfCity.add("Queens");
        listOfCity.add("Manhattan");
        listOfCity.add("Bronx");

        System.out.println(listOfCity);
        System.out.println(listOfCity.size());

        System.out.println(listOfCity.get(0));

        //2nd
        for (int i=0; i<listOfCity.size(); i++){
            System.out.println(listOfCity.get(i));

            listOfCity.add("VA");
            listOfCity.add("DC");

            //3rd
            Iterator iterator = listOfCity.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
                i++;
            }

            //4th
            ArrayList<Integer> zipCode = new ArrayList<>();
            zipCode.add(245555);
            zipCode.add(245555);
            zipCode.add(245555);

        }
    }
}
