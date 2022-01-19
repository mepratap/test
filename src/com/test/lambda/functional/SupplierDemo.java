package com.test.lambda.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        //Supplier<String> supplier = () -> "Hi Supplier functional Interface";
        //System.out.println(supplier.get());

        List<String> lists = Arrays.asList();
        System.out.println(lists.stream().findAny().orElseGet(() -> "Hi Supplier functional Interface"));
    }
}
