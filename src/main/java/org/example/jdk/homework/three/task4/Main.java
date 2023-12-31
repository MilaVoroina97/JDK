package org.example.jdk.homework.three.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String key1 = "key 1";
        Integer value1 = 1;
        Pair<String, Integer> pair1 = new Pair<>(key1, value1);

        Map<String, Integer> key2 = new HashMap<>();
        key2.put("key 2", 2);
        Double value2 = 2.0;
        Pair<Map<String, Integer>, Double> pair2 = new Pair<>(key2, value2);

        System.out.println(pair1);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println();

        System.out.println(pair2);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
