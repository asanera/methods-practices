package com.asanera;

import javax.naming.OperationNotSupportedException;

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



    }


}
