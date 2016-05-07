package mine.algo.numbers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by pratapn on 5/1/16.
 */

class Point {
    int x;
    int y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Point)) return false;
        Point newp = (Point) obj;
        if(this.x == newp.x && this.y == newp.y) return true;
        return false;
    }
}

public class MaxPoint {

    public int maxPoints(Point[] points) {
        if (points == null) return 0;
        if (points.length == 1) return 1;
        Map<Integer, Set<Point>> count = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Point one = points[i];
                Point two = points[j];
                int slope = findSlope(one, two);
                if (count.get(slope) == null) {
                    Set<Point> set = new HashSet<>();
                    set.add(one);
                    set.add(two);
                    count.put(slope, set);
                } else {
                    Set ct = count.get(slope);
                    ct.add(one);
                    ct.add(two);
                }
            }
        }
        Set maxSet = new HashSet();
        for (Integer key : count.keySet()) {
            Set set = count.get(key);
            if (maxSet == null) maxSet = set;
            if (maxSet.size() < set.size()) maxSet = set;
        }
        return maxSet.size();
    }

    private int findSlope(Point one, Point two) {
        int nu = (two.y - one.y);
        int de = (two.x - one.x);
        if (de == 0) return 0;
        return nu / de;
    }
}
