package mine.algo.company.a9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratapn on 4/22/16.
 *
 * Asked at A9 phone screen
 *
 Welcome to MeetingWords!

 This pad text is synchronized as you type, so that everyone viewing this page sees the same text.  This allows you to collaborate seamlessly on documents!

 Test
 can you see me t

 Hello


 You have Quarters, Dimes, Nickels and Pennies.  Write a function that will output **all possible ways** of giving change of a given amount for the coins above.  We have an unlimited supply of each coin.

 void printAllPossible(int numCents);

 printAllPossible(6) :

 "nickels-1;pennies-1 | pennies-6"

 */
public class CoinCombination {


    public void printAllPossible(int numCents){

        if(numCents <= 0) return;
        List<Integer> pickedCoins = new ArrayList<>();
        int []  coins = new int []{1, 5, 10, 25};
        printAllPossibleCoins(coins, pickedCoins, 0, numCents);

    }


    private void printAllPossibleCoins(int coins[], List<Integer> pickedCoins, int recLevel, int sum){
        if(sum < 0) return;
        if(sum == 0){
            for(int i = 0; i < recLevel; i++){
                System.out.print(pickedCoins.get(i) + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < coins.length; i++){
            pickedCoins.add(recLevel, coins[i]);
            int newSum = sum - coins[i];
            printAllPossibleCoins(coins, pickedCoins, ++recLevel, newSum);
        }
    }
}
