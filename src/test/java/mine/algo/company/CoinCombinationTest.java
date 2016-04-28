package mine.algo.company;

import junit.framework.TestCase;
import mine.algo.company.a9.CoinCombination;

/**
 * Created by pratapn on 4/22/16.
 */
public class CoinCombinationTest extends TestCase {

    public void testPrintAllPossible() throws Exception {
        CoinCombination coinCombination = new CoinCombination();
        coinCombination.printAllPossible(10);
    }
}