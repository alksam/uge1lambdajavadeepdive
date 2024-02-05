package org.example;

import java.util.Arrays;

public class Main {
    interface ArithmeticOperation {
        int perform(int a, int b);

    }

    interface MyTransformingType {
        int transform(int a);

    }

    interface  MyValidatingType {
        boolean validate(int a);
    }

    static  int operate(int a, int b, ArithmeticOperation op) {
        return op.perform(a, b);
    }

    static int[] operate(int[] a, int[] b, ArithmeticOperation op) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = op.perform(a[i], b[i]);
        }
        return result;
    }

    static int[] map(int[] a, MyTransformingType op) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = op.transform(a[i]);
        }
        return result;
    }

    static int[] filter(int[] a, MyValidatingType op) {
        int[] result = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (op.validate(a[i])) {
                result[j] = a[i];
                j++;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        ArithmeticOperation addition = (a, b) -> a + b;
        ArithmeticOperation subtraction = (a, b) -> a - b;
        ArithmeticOperation multiplication = (a, b) -> a * b;
        ArithmeticOperation division = (a, b) -> a / b;
        ArithmeticOperation modulus = (a, b) -> a % b;
        ArithmeticOperation power = (a, b) -> (int) Math.pow(a, b);


        System.out.println("Addition: " + addition.perform(10, 5));
        System.out.println("Subtraction: " + subtraction.perform(10, 5));
        System.out.println("Multiplication: " + multiplication.perform(10, 5));
        System.out.println("Division: " + division.perform(10, 5));
        System.out.println("Modulus: " + modulus.perform(10, 5));
        System.out.println("Power: " + power.perform(10, 5));

        int result = operate(10, 5, addition);
        int result2 = operate(10, 5, subtraction);
        int result3 = operate(10, 5, multiplication);
        int result4 = operate(10, 5, division);
        int result5 = operate(10, 5, modulus);
        int result6 = operate(10, 5, power);

        System.out.println("Addition: " + result);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
        System.out.println("Modulus: " + result5);
        System.out.println("Power: " + result6);

        MyTransformingType square = (a) -> a * a;
        MyTransformingType cube = (a) -> a * a * a;
        MyTransformingType squareRoot = (a) -> (int) Math.sqrt(a);

        System.out.println("Square: " + square.transform(10));
        System.out.println("Cube: " + cube.transform(10));
        System.out.println("Square Root: " + squareRoot.transform(10));



        MyValidatingType isEven = (a) -> a % 2 == 0;

        System.out.println("isEven: " + isEven.validate(10));
        System.out.println("isEven: " + isEven.validate(5));


            int[] myArray = {1, 2, 3, 4, 5};

            // Example of using map to double all values
            int[] mappedArray = map(myArray, x -> x * 2);
            System.out.println("Mapped Array: " + Arrays.toString(mappedArray));

            // Example of using filter to keep only even values
            int[] filteredArray = filter(myArray, x -> x % 2 == 0);
            System.out.println("Filtered Array: " + Arrays.toString(filteredArray));





    }










}


