package com.solucionfactible.dev;

import java.util.Arrays;

/**
 * comp checks whether the two arrays have the "same" elements, with the same multiplicities. "Same" means,
 * here, that the elements in b are the elements in a squared, regardless of the order.
 *
 * @author developer
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        boolean ret = true;

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < b.length; ++i) {
            a[i] = a[i] * a[i];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; ++i)
            if (a[i] != b[i])
                return false;

        return ret;
    }

}
