package mine.algo.company.lendingclub;

/* Company Lending Club: https://coderpad.io/FGZGCTFW

input = {1,0,1,0,5,3,12}

output = {1,1,5,3,12,0,0}

- do it in-place
- try to minimize number of swaps/shifts
- preserve original order of non-zero numbers

EX:
0,1 -> 1, 0
1,0,0,2 -> 1, 2, 0, 0
^     ^
0 1, 2, 3
Swap(1, 3)

1 0 2 0
swap(1,2) -> 1 2 0 0

x = -1, swap(y, x+1)
0 0 0 0 0 0 0 0 0 1


*/


class MoveZeroToEnd {


    public static void moveZeros(int[] nums) {
        if (nums.length == 0) {
            return;
        }

        int i = -1;
        int j = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i + 1] == 0) {
                j = i + 1;
                if (j >= nums.length) break;
                boolean flag = true;
                while (j < nums.length && nums[j] == 0) {
                    j++;
                }
                if (j < nums.length) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = temp;
                }
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 0, 1, 0, 0, 1, 0};
        MoveZeroToEnd.moveZeros(input);
        for (int i : input) {
            System.out.print("," + i);
        }
    }
}
