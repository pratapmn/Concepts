package mine.algo.dp;

import junit.framework.TestCase;

/**
 * Created by pratapn on 4/22/16.
 */
public class CoinChangeTest extends TestCase {

    public void testChangeCount() throws Exception {
        CoinChange coinChange = new CoinChange();
        int [] coins = new int[] {1, 2, 5};
        int result = coinChange.changeCount(coins, coins.length, 5);
        System.out.println(result);
    }
}