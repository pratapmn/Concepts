package mine.algo.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by pratapn on 4/4/16.
 */
public class WordBreak {

    public List<String> wordBreak(String input, Set<String> wordDict) {
        List<String> finalResult = new ArrayList<>();
        doWordBreak(input, new String[input.length()], wordDict, 0, finalResult);
        return finalResult;
    }

    private void doWordBreak(String input, String[] result, Set<String> wordDict, int recurLevel, List<String> finalResult) {
        if (input.isEmpty()) {
            StringBuffer buff = new StringBuffer();
            for (int i = 0; i < result.length; i++) {
                if (result[i] != null) {
                    if (buff.length() == 0) {
                        buff.append(result[i]);
                    } else {
                        buff.append(" ").append(result[i]);
                    }
                }
            }
            finalResult.add(buff.toString());
            return;
        }

        for (int i = 0; i <= input.length(); i++) {
            String temp = input.substring(0, i);
            if (wordDict.contains(temp)) {
                result[recurLevel] = temp;
                doWordBreak(input.substring(i, input.length()), result, wordDict, recurLevel + 1, finalResult);
            }
        }
    }
}
