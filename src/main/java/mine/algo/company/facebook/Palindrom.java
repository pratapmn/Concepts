package mine.algo.company.facebook;

/**
 * Created by pratapn on 5/6/16.
 */

// Welcome to Facebook!
// Palindrome string
// racecar

// boolean isAlpha(char c)
// 'c' => TRUE

// 'Race_car' => TRUE

public class Palindrom {
    public boolean isPalindrome(String s) {

        if (s == null || s.length() == 0) return false;
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            char atI = s.charAt(i);
            char atJ = s.charAt(j);
            if (!isAlpha(atI)) {
                i++;
                continue;
            }
            if (!isAlpha(atJ)) {
                j--;
                continue;
            }
            atI = s.charAt(i);
            atJ = s.charAt(j);
            if (atI == atJ) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isAlpha(char c){
        return Character.isAlphabetic(c);
    }
}

/*
Test cases

 ""
null
race_car
   ij

abba
ab_ba

abc__ba

*/