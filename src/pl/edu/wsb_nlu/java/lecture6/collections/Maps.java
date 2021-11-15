package pl.edu.wsb_nlu.java.lecture6.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "John");
        map1.put(1, "Andy");
        map1.put(3, "Elisabeth");
        for (Map.Entry<Integer, String> element: map1.entrySet()){
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        System.out.println("---------------");
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(2, "John");
        map2.put(1, "Andy");
        map2.put(3, "Elisabeth");
        for (Map.Entry<Integer, String> element: map2.entrySet()){
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        System.out.println("---------------");
        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(2, "John");
        map3.put(1, "Andy");
        map3.put(3, "Elisabeth");
        for (Map.Entry<Integer, String> element: map3.entrySet()){
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }
}
