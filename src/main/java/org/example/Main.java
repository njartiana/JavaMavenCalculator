package org.example;

public class Main {
    public static void main(String[] args) {
        TestCalcule test = new TestCalcule();
        System.out.println("-----------------> Starting test <---------------------- ");
        test.test_add();
        test.test_multiplication();
        test.test_substract();
        test.test_division();
        System.out.println("#################### Test finished ##################");
    }
}
