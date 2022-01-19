package com.test.lambda.demo;

interface Calculator {
    //void switchOn();
    //void sum(int input);
    int subtract(int i1, int i2);
}
public class CalculatorImpl {
    public static void main(String[] args) {

        //Calculator calculator = () -> System.out.println("Switch on");
        //calculator.switchOn();

        //Calculator calculator = (input) -> System.out.println("Sum is: " + input);
        //calculator.sum(25);

        Calculator calculator = (i1, i2) -> i2 - i1;
        System.out.println(calculator.subtract(8,20));
    }

}
