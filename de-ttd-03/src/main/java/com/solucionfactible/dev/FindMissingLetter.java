package com.solucionfactible.dev;

import java.util.stream.IntStream;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing.
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 *
 * @author developer
 */
public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {

        int[] num = new String(array).chars().sorted().toArray();
        int pos = -1;
        for (int i = 1; i < num.length; i++) {
            if (num[i] - num[i - 1] != 1) {
                pos = i;
                break;
            }
        }
        return (char) (num[pos] - 1);
    }

}
