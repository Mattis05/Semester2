package Hashmap;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> liste = new HashMap<>();

        liste.put("Mattis",6532);
        liste.put("Olaf",123456789);
        liste.put("lara",1337);

        System.out.println(liste);
        System.out.println(liste.get("lara"));
        System.out.println(liste.containsKey("Mattis"));
        System.out.println(liste.containsValue(1337));



    }
}
