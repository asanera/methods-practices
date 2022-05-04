package com.asanera;

import javax.naming.OperationNotSupportedException;

public class Main {

    public static void main(String[] args) throws OperationNotSupportedException {
	    Ejercice ejercice = new Ejercice();

        //Write a Java method to find the smallest number among three numbers
         int resutl = ejercice.findSmallNumber(25,37,29);
         System.out.println(resutl);

        //Write a Java method to find the smallest number among three numbers
         resutl = ejercice.findEvergeNumber(25,45,65);
         System.out.println(resutl);

         // Write a Java method to count all vowels in a string.
        resutl = ejercice.countVowels("e");
        System.out.println(resutl);

        //Write a Java method to count all words in a string.
        resutl = ejercice.countWord("The quick brown fox jumps over the lazy dog.");
        System.out.println(resutl);

        //Write a Java method to compute the sum of the digits in an integer
        resutl = ejercice.sumDigit(25);
        System.out.println(resutl);

    }


}
