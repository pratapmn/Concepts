package mine.algo.company.apple;

/**
 * Created by pratapn on 5/9/16.
 */

/**
 * You are given an array a, with n elements, and some positive integer k.
 * You may assume array elements are between 0 and 127, inclusive.
 * You may also assume that k is less than 65536.  Here is the
 * mathematical formulation of the checksum you are to compute:
 * Let b = (a0 + a1 + ... + a{n-1}) mod k.
 * Let c =
 * ((a0) +
 * (a0 + a1) +
 * (a0 + a1 + a2) +
 * ... +
 * (a0 + a1 + ... + a{n-1})) mod k
 * Write code that outputs 70000 * b + c.
 */

public class Checksum {

    public int genChecksum(char[] input, int k) {

        int[] bsum = new int[input.length];
        int[] b = new int[input.length];
        bsum[0] = 0;
        b[0] = 0;
        for (int i = 1; i < input.length; i++) {
            bsum[i] = bsum[i - 1] + input[i];
            b[i] = (bsum[i - 1] + input[i]) % k;
        }

        int c = 0;
        for (int i = 1; i < input.length; i++) {
            c += bsum[i];
        }
        c = c % k;

        return 70000 * b[input.length - 1] + c;
    }

  /*
    1, 2, 3
    k = 2

    bsum[0, 1, 3, 6]
    b[ 0, 1%k, 1, 0]
  */


}