package mine.algo.numbers;

/**
 * Created by pratapn on 4/6/16.
 */
public class FindTrailingZero {

/*
    This question is pretty straightforward.
    Because all trailing 0 is from factors 5 * 2.
    But sometimes one number may have several 5 factors, for example, 25 have two 5 factors, 125 have three 5 factors.
    In the n! operation, factors 2 is always ample. So we just count how many 5 factors in all number from 1 to n.
 */
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

    /* This solution is O(n) and its slow
    public int trailingZeroes(int n) {
        BigInteger fact = findFactorial(n);
        int zeroCnt = 0;
        while (fact.intValue() > 10) {
            BigInteger mod = fact.mod(BigInteger.valueOf(10));
            if ( mod.equals(0)) {
                zeroCnt++;
                fact = fact.divide(new BigInteger(String.valueOf(10)));
            } else {
                break;
            }
        }
        return zeroCnt;
    }

    private BigInteger findFactorial(int n) {
        if (n == 0) {
            return new BigInteger(String.valueOf(n));
        }
        BigInteger fact = new BigInteger("1");
        for (long i = n; i > 0; i--) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }
        return fact;
    }
    */
}
