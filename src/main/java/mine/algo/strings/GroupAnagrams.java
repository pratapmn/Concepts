package mine.algo.strings;

import java.util.*;

/**
 * Created by pratapn on 4/7/16.
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> lookup = new HashMap<String, List<String>>();
        for (String s : strs) {
            String hash = "" + computeHash(s);
            if (lookup.get(hash) == null) {
                List<String> aList = new ArrayList<>();
                aList.add(s);
                lookup.put(hash, aList);
            } else {
                List<String> aList = lookup.get(hash);
                aList.add(s);
            }
        }

        List<List<String>> finalResult = new ArrayList<>();
        for (String key : lookup.keySet()) {
            finalResult.add(lookup.get(key));
        }

        return doLexicographicOrdering(finalResult);
    }

    private List<List<String>> doLexicographicOrdering(List<List<String>> input) {
        input.forEach(Collections::sort);
        Collections.sort(input, (o1, o2) -> {
            if (o1 == null && o2 == null) {
                return 0;
            }
            long w1 = Long.MAX_VALUE;
            long w2 = Long.MAX_VALUE;
            if (o1 != null && !o1.isEmpty()) w1 = computeHash(o1);
            if (o2 != null && !o2.isEmpty()) w2 = computeHash(o2);
            if (w1 > w2) {
                return 1;
            } else if (w1 < w2) {
                return -1;
            } else {
                return 0;
            }
        });
        return input;
    }

    private long computeHash(List<String> input) {
        long w = 1;
        for (String s : input) {
            w = w * computeHash(s);
        }
        return w;
    }

    private long computeHash(String str) {
        if(str.isEmpty()){
            return Long.MAX_VALUE;
        }
        long sum = 1;
        for (char c : str.toCharArray()) {
            sum = sum * (int) c;
        }
        return sum;
    }
}
