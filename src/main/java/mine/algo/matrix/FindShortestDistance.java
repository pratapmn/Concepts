package mine.algo.matrix;

/**
 * Created by pratapn on 4/5/16.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class FindShortestDistance {

    public static void main(String[] args) {

        search();

    }


    // This function search for all permutations of pat[] in txt[]
    public static void search() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int jx = sc.nextInt() - 1;
        int jy = sc.nextInt() - 1;

        Point jerry = new Point(jx, jy, 0);

        Point[][] maze = new Point[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maze[i][j] = new Point(i, j, sc.nextInt());
            }
        }

        maze[0][0].min = 0;
        Queue<Point> queue = new LinkedList<Point>();
        queue.add(maze[0][0]);
        int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            if (cur.x == jerry.x && cur.y == jerry.y) {
                System.out.print(cur.min);
                break;
            }

            for (int k = 0; k < dir.length; k++) {
                int x = cur.x + dir[k][0];
                int y = cur.y + dir[k][1];
                if (x < 0 || x >= row || y < 0 || y >= col) {
                    continue;
                }
                Point next = maze[x][y];
                if (next.block == 1 || next.visited ) continue;
                if (next.min > cur.min + 1) {
                    next.min = cur.min + 1;
                }
                queue.add(next);
            }
        }

    }
}

class Point {
    public int x, y, block, min;
    public boolean visited;

    public Point(int x, int y, int block) {
        this.x = x;
        this.y = y;
        this.block = block;
        this.min = Integer.MAX_VALUE;
    }

}