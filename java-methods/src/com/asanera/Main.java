package com.asanera;

import org.jetbrains.annotations.NotNull;

import javax.naming.OperationNotSupportedException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws OperationNotSupportedException {
	    Ejercice ejercice = new Ejercice();

        //Write a Java method to find the smallest number among three numbers
         int result = ejercice.findSmallNumber(25,37,29);
         System.out.println(result);

        //Write a Java method to find the smallest number among three numbers
         result = ejercice.findEvergeNumber(25,45,65);
         System.out.println(result);

         // Write a Java method to count all vowels in a string.
        result = ejercice.countVowels("e");
        System.out.println(result);

        //Write a Java method to count all words in a string.
        result = ejercice.countWord("The quick brown fox jumps over the lazy dog.");
        System.out.println(result);

        //Write a Java method to compute the sum of the digits in an integer
        result = ejercice.sumDigit(25);
        System.out.println(result);

        //Write a Java method to display the first 50 pentagonal numbers
        for (int num = 1; num <=50; num++){
            System.out.print(ejercice.calculatePentagonalNumber(num) + (num % 10 == 0 ? "\n" : " "));
        }

        //Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
        int amount = prontValue("Input the investment amount");
        final int rate = prontValue("Input the rate of interest");
        int year = prontValue("Input number of years");


        for (int i = 1;year > 0; year--, i++) {
            amount = ejercice.calculateAnualInterest(amount, rate);
            System.out.println(i + " " + amount);
        }



    }

    @NotNull
    private static int prontValue(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text+ " ");
        final int value = sc.nextInt();
        return value;
    }


}
