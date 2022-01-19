package com.test.lambda.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        //Consumer<Integer> consumer = t -> System.out.println("Printing : " + t);
        //consumer.accept(10);

        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        lists.stream().forEach(t -> System.out.println("print : " + t));
    }
}
