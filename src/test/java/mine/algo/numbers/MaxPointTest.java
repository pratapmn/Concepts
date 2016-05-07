package mine.algo.numbers;

import org.junit.Test;

/**
 * Created by pratapn on 5/1/16.
 */
public class MaxPointTest {

    @Test
    public void testMaxPoints() throws Exception {
        MaxPoint maxPoint = new MaxPoint();
        int[][] ints = new int[][]{{84,250},{0,0},{1,0},{0,-70},{0,-70},{1,-1},{21,10},{42,90},{-42,-230}};
        int result = maxPoint.maxPoints(getPointArray(ints));
        System.out.println(result);
    }

    Point [] getPointArray(int [][] input){
        Point[] points = new Point[input.length];
        for(int i = 0; i < input.length; i++){
            int x = input[i][0];
            int y = input[i][1];
            Point point = new Point(x, y);
            points[i] = point;
        }
        return points;
    }
}