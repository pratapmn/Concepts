/* Twitter Phone round */

package mine.algo.company.twitter;

import java.util.ArrayList;
import java.util.List;

/*

  0  1  2  3  4
0    x
1 x
2             x
3
4    xx


N size.
M coffee lovers.

x = coffee lover
o = coffee shop.

How do we place our coffee shop (o) ? Such that it's at the minimum distance between all our coffee lovers (x).
Distance: Manhattan distance.

Solution 1:
Explore all the matrix and compute the distances to all coffee lovers. Chose the minimum.
Time complexity: O(M * N^2)

Solution 2:
Hill climbing. Chose a point and optimise from that.
Time complexity: O(M * N)

  0  1  2  3  4
0 i
1    i
2       i
3          i
4             xxx

  0  1  2  3  4
0
1
2
3
4             xxx
*/
public class OptimalCoffeeShopLocation {

    public static class Tuple {
        int i;
        int j;

        Tuple(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public String toString(){
            return ""+i+" "+j;
        }
    }

    private int[][] loc;
    List<Tuple> cls;

    public OptimalCoffeeShopLocation(int[][] loc) {
        this.loc = loc;
        this.cls = getCoffeLoverLocations(loc);
    }

    public Tuple findOptimalLocation() {
        if (cls == null || cls.isEmpty()) return null;
        if (loc == null || loc.length == 0) return null;

        int i = 0;
        int j = 0;
        Tuple minIndex = null;
        int gCost = Integer.MAX_VALUE;
        while (true) {
            int[][] nCosts =
                    {
                            {cost(i - 1, j - 1), cost(i - 1, j), cost(i - 1, j + 1)},
                            {cost(i, j - 1), cost(i, j), cost(i, j + 1)},
                            {cost(i + 1, j - 1), cost(i + 1, j), cost(i + 1, j + 1)}
                    };

            Tuple lMinCostIndex = finMin(nCosts);
            minIndex = extraPolate(lMinCostIndex, i, j);
            i = minIndex.i;
            j = minIndex.j;


            int minCost = nCosts[lMinCostIndex.i][lMinCostIndex.j];
            if(gCost > minCost){
                gCost = minCost;
            } else if(gCost == minCost){
                break;
            }
        }
        return minIndex;
    }

    private Tuple extraPolate(Tuple input, int i, int j){
            int xi = i;
            int xj = j;
            if(input.i == 2) xi = xi+1;
            if(input.i == 0) xi = xi-1;
            if(input.j == 2) xj = xj+1;
            if(input.j == 0) xj = xj-1;
            return new Tuple(xi, xj);
    }

    private List<Tuple> getCoffeLoverLocations(int[][] loc) {
        List<Tuple> cls = new ArrayList<>();
        for (int i = 0; i < loc.length; i++) {
            for (int j = 0; j < loc[i].length; j++) {
                if (loc[i][j] != 0) {
                    cls.add(new Tuple(i, j));
                }
            }
        }

        return cls;
    }

    private Tuple finMin(int[][] nCosts) {
        int min = Integer.MAX_VALUE;
        Tuple minIndex = null;
        for (int i = 0; i < nCosts.length; i++) {
            for (int j = 0; j < nCosts.length; j++) {
                if (nCosts[i][j] < min) {
                    min = nCosts[i][j];
                    minIndex = new Tuple(i, j);
                }
            }
        }
        return minIndex;
    }

    private int cost(int i, int j) {
        if (i < 0 || j < 0 || i >= loc.length || j >= loc.length) {
            return Integer.MAX_VALUE;
        }

        int cost = 0;
        for (Tuple cl : cls) {
            cost += Math.abs(cl.i - i) + Math.abs(cl.j - j);
        }
        return cost;
    }
}
