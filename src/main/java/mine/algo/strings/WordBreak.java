package mine.algo.strings;

import java.util.*;

/**
 * Created by pratapn on 4/4/16.
 */
public class WordBreak {

    public Set<String> wordBreak(String input, Set<String> wordDict) {
        Set<String> finalResult = new LinkedHashSet<>();
        char [] result = new char[input.length()];
        char [] inputArry = input.toCharArray();
        int [] used = new int [inputArry.length];
        doWordBreak(inputArry, used, result, 0, 0, finalResult, wordDict);
        return finalResult;
    }

    private void doWordBreak(char[] input, int [] used, char[] result, int recurLevel, int pos, Set<String> finalResult, Set<String> wordDict) {
        StringBuffer buf = new StringBuffer();
        for(int i =0; i < recurLevel; i++){
            buf.append(result[i]);
        }
        if(wordDict.contains(buf.toString())){
            finalResult.add(buf.toString());
        }

        for(int i = pos; i < input.length; i++){
            if(used[i] != 0){
                continue;
            }
            used[i]++;
            result[recurLevel] = input[i];
            doWordBreak(input, used, result, recurLevel+1, i, finalResult, wordDict);
            used[i]--;
        }
    }
}
