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
            long multi = 1;
            for (char t : String.valueOf(num).toCharArray()) {
                multi *= Long.parseLong(String.valueOf(t));
            }
            num = multi;
            result++;
        }
        return result;


    }

}
