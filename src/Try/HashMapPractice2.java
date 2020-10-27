package Try;

import java.util.HashMap;
import java.util.ArrayList;

public class HashMapPractice2 {
    public static void main(String[] args) {

        HashMap<String,Integer> cityAndZipOfUSA = new HashMap<>();
        HashMap<String,Integer> cityAndZipOfCanada = new HashMap<>();

        cityAndZipOfUSA.put("Ney York", 1254);
        cityAndZipOfUSA.put("New Jersey", 7584);
        cityAndZipOfUSA.put("Virginia", 9587);


        cityAndZipOfCanada.put("Toronto", 48579);
        cityAndZipOfCanada.put("Montreal", 8698);
        cityAndZipOfCanada.put("Victoria", 9875);

        HashMap<String, HashMap<String,Integer>>  map = new HashMap<>();
        map.put("USA", cityAndZipOfUSA);
        map.put("Canada", cityAndZipOfCanada);

        System.out.println(map);

    }
}
