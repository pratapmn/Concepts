package mine.algo.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratapn on 3/28/16.
 */
public class Combination {

    List<String> combinations = new ArrayList<>();

    public List<String> doCombination(char[] input){
        char[] result = new char[input.length];
        int[] used = new int[input.length];
        for (int i= 0; i < input.length; i++) {
            //used[i] = charCount.get(input[i]);
            used[i] = 1;
        }
        doCombination(input, result, used, 0, 0);
        return combinations;
    }

    public void doCombination(char[] input, char[] result, int[] used, int recurLevel, int pos){
        printOutput(result, recurLevel);

        for(int i = pos; i < input.length; i++){
            if(used[i] == 0){
                continue;
            }
            result[recurLevel] = input[i];
            used[i]--;
            doCombination(input, result, used, recurLevel + 1, i);
            used[i]++;
        }
    }

    private void printOutput(char[] result, int len) {
        combinations.add(new String(result).substring(0, len));
    }
}
