package mine.algo.company.twitch;

/**
 * Created by pratapn on 4/25/16.
 */
public class PrimeFactors {


 /*
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 

    class Solution {
        public static int IS_PRIME_NUM = 1;
        public static int IS_COMPOSITE_NUM = 0;
        public static int NOT_VALID = -1;

        public static void main(String[] args) {
            isPrime(0);
            isPrime(-1);

        }

  /*
   1 - prime
   0 - not prime
   -1 for composite



        public static int isPrime(int n){


            if(n <= 0) return NOT_VALID;
            if(n == 1) return IS_PRIME_NUM;

            for(int i = 2; i < n; i ++){
                if(n%i == 0) return IS_COMPOSITE_NUM;
            }
            return IS_PRIME_NUM;
        }

  /*
  * 12 => 2, 2, 3
  *

  15 / 3 = 5
  5 / 5 = 0

  3, 5


  //
   2, 3, 5, ... 12
   12/2 = 6
   6/2 = 3
   3



        public static List<Integer> printPrimeFactors(int m){

            List<Integer> result = new ArrayList<>();
            result.add(1);
            int[] primes = getPrimes(m);
            if(primes.length == 0) {
                results.add(m);
                return result;
            }
            int index = 0;
            int mTemp = m;
            while(index < primes.length){
                int curPrime = primes[index];
                float frem = mTemp/curPrime;
                int rem = (int) frem;
                if(rem == frem){
                    result.add(curPrime);
                    if(isPrime(rem)){
                        result.add(rem);
                        break;
                    } else {
                        mTemp = rem;
                        index = 0;
                    }
                } else {
                    index++;
                }
            }
            return result;
        }


        private int [] getPrimes( int n){
        }
    }
      */
}
