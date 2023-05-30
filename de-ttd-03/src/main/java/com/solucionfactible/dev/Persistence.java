package com.solucionfactible.dev;

/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number
 * of times you must multiply the digits in num until you reach a single digit.
 *
 * @author developer
 */
public class Persistence {

    public static int persistence(long num) {
        int result = 0;
        while (num > 9) {
            long mul = 1;
            String numStr = String.valueOf(num);
            char[] charArray = numStr.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                char t = charArray[i];
                mul *= Long.parseLong(String.valueOf(t));
            }
            num = mul;
            result++;
        }
        return result;


    }

}
