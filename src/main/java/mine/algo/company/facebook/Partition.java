package mine.algo.company.facebook;

/**
 * Created by pratapn on 5/6/16.
 */
// Welcome to Facebook!
public class Partition {

// int getCategory(int n);
// 0; 1; 2

// 0: <100
// 1: 100<= <200
// 2: >= 200

// array(23 156 90 234 101 456)
// array(23 90 156 101 234 456)

// p1 p2

    public int[] categorizeArray(int[] input) {
        if (input == null || input.length == 0) return input;

        // case for 1st partition
        int i = partition(0, input.length - 1, input, 0);

        // case for 2st partition
        partition(i, input.length - 1, input, 1);

        return input;
    }


    private int partition(int i, int j, int[] input, int cat) {
        while (i < j) {
            int catI = getCategory(input[i]);
            int catJ = getCategory(input[j]);
            if (catI == cat) {
                i++;
                continue;
            }
            if (catJ != cat) {
                j--;
                continue;
            }
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
        return i;
    }

    private int getCategory(int i) {
        if (i < 100) return 0;
        if (i >= 100 && i < 200) return 1;
        else return 2;
    }
}

/*
Test Cases and run through

// array(23 156 90 234 101 456)
23 90 | 156 234 101 456

156 234 101 456
156 101 | 234 456

// array(23 90 156 101 234 456)

*/

