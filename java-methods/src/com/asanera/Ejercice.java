package com.asanera;

import javax.naming.OperationNotSupportedException;
import java.util.*;
import java.util.stream.IntStream;

public class Ejercice {

    public int findSmallNumber(int number1, int number2, int number3) throws OperationNotSupportedException {
        Optional<Integer> min = convertArrayInteger(number1, number2, number3).stream().min(Integer::compare);
        if (min.isPresent()) {
            return min.get();
        }
        throw new OperationNotSupportedException("Error");
    }

    public int findEvergeNumber(int number1, int number2, int number3) throws OperationNotSupportedException {

        OptionalDouble average = convertArrayInteger(number1, number2, number3).stream().mapToInt(Integer::intValue).average();
        if (average.isPresent()) {
            return (int) average.getAsDouble();
        }
        throw new OperationNotSupportedException("Error");
    }

    private List<Integer> convertArrayInteger(Integer... numbers) {
        return Arrays.asList(numbers);
    }

    public int countVowels(String text) {
        List<String> vowels = Arrays.asList("a","e", "i","o","u");
        if (null != text && !"".equals(text)){
           return (int) text.chars().filter(c -> vowels.contains(String.valueOf((char)c))).count();
        }
        return 0;
    }

    public int countWord(String text) {
        if(null == text || text.isBlank()){
            return 0;
        }
        return text.split(" ").length;
    }

    public int sumDigit(int num) {
        if(num == 0){
            return num;
        }
        char[] chars = String.valueOf(num).toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += Character.getNumericValue(chars[i]);
        }
        return sum;
    }

    public int calculatePentagonalNumber(int num) {
        return (num*(3*num -1))/2;
    }
}
