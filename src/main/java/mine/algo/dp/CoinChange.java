package mine.algo.dp;

/**
 * Created by pratapn on 4/22/16.
 */
public class CoinChange {

    public int changeCount(int [] coins, int len, int sum){
        if( sum == 0 || sum < 0){
            return 0;
        }

        if(len <= 0 && sum >= 1) return 0;
        return changeCount(coins, len - 1, sum) + changeCount(coins, len, sum - coins[len -1]);
    }

}
