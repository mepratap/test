package com.test.lambda.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pratap");
        list.add("Prakash");
        list.add("Sulabh");
        list.add("Palle");

        for (String s:list) {
            System.out.println(s);
        }

        list.stream().forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key,value) -> System.out.println(key+": "+value));
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
    }
}
