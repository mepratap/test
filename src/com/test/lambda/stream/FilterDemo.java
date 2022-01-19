package com.test.lambda.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pratap");
        list.add("Pramod");
        list.add("Sulabh");
        list.add("Bikash");

        for (String s:list) {
            if (s.startsWith("P")) {
                System.out.println(s);
            }
        }

        list.stream().filter(t -> t.startsWith("P")).forEach(t -> System.out.println(t));
    }

}
