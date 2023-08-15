package main.java.com.georgescuconstantin.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapSample {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        addValueAndKey(countries);

        iterateMap(countries);

        System.out.println("--------------------");

        removeKey(countries);

        System.out.println("----------------------");

        System.out.println(countries.values());

        System.out.println("------------------------");

        System.out.println(countries.keySet());


    }

    private static void removeKey(Map<String, String> countries) {
        countries.remove("Germany");
        iterateMap(countries);
    }

    private static void iterateMap(Map<String, String> countries) {
        for(Map.Entry<String, String> item : countries.entrySet()) {
            String key = item.getKey();
            String value = item.getValue();

            System.out.println("Key : " + key + " . value -> " + value);
        }
    }

    private static void addValueAndKey(Map<String, String> countries) {
        countries.put("Romania", "Bucharest");
        countries.put("Spain", "Madrid");
        countries.put("Germany", "Berlin");
    }

}
