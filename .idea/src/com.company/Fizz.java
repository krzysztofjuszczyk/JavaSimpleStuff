package com.company;

public class Fizz {
    public static void main(String[] args) {
        int test = 5;
        System.out.println(fizzBuzz(test));
    }
    //Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
    //For numbers which are multiples of both three and five return 'FizzBuzz'.
    //For numbers that are neither, return the input number.
    public static String fizzBuzz(int i) {
        String result = null;
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result==null) {
            result = Integer.toString(i);
        }
        return result;
    }
}
