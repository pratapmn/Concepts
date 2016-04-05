package mine.algo.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratapn on 3/28/16.
 */
public class Permutation {
    List<String> permutations = new ArrayList<String>();

    public List<String> doPermutation(char input[]) {
        char[] result = new char[input.length];
        int[] used = new int[input.length];
        for (int i=0; i< input.length; i++){
            used[i] = 1;
        }
        doPermutation(input, result, used, 0);
        return permutations;
    }

    private void doPermutation(char[] input, char[] result, int[] used, int recurLevel){

        if(recurLevel == input.length){
            permutations.add(new String(result));
        }

        for(int i = 0; i < input.length; i++){
            if(used[i] == 0){
                continue;
            }
            result[recurLevel] = input[i];
            used[i]--;
            doPermutation(input, result, used, recurLevel+1);
            used[i]++;
        }
    }
}
