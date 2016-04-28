package mine.algo.company.twitter;

import junit.framework.TestCase;

/**
 * Created by pratapn on 4/15/16.
 */
public class OptimalCoffeeShopLocationTest extends TestCase {

    public void testFindOptimalLocation() throws Exception {
        int[][] loc = {
                {1, 1, 0},
                {1, 0, 0},
                {0, 1, 1},
                {0, 1, 1}
        };
        OptimalCoffeeShopLocation optimalCoffeeShopLocation = new OptimalCoffeeShopLocation(loc);
        OptimalCoffeeShopLocation.Tuple result = optimalCoffeeShopLocation.findOptimalLocation();
        loc[result.i][result.j] = -1;
        for(int i = 0; i < loc.length; i++){
            for(int j =0; j < loc[i].length; j++){
                System.out.print(loc[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}