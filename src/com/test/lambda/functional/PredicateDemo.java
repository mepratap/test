package com.test.lambda.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        //Predicate<Integer> predicate = t -> t % 2 ==0;
        //System.out.println(predicate.test(5));

        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);

        lists.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print even : " + t));
    }
}
