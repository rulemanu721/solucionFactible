package com.solucionfactible.dev;

/**
 * diff subtracts one list from another and returns the result.
 * It should remove all values from list a, which are present in list b keeping their order.
 *
 * @author developer
 */
public class ArrayDiff {

    public static int[] diff(int[] a, int[] b) {
        int[] result;
        int size = a.length;
        if (a.length == 0 || b.length == 0) {
            return a;
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        size--;
                        break;
                    }
                }
            }
            result = new int[size];
            int index = 0;
            int countEq = 0;
            for (int i = 0; i < a.length; i++) {
                countEq = 0;
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        countEq++;
                        break;
                    }
                }
                if (countEq == 0) {
                    result[index] = a[i];
                    index++;
                }
            }
        }
        return result;
    }

}
