package mine.algo.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pratapn on 4/4/16.
 */
public class GroupShiftedStrings {


    public List<List<String>> doGrouping(List<String> input) {
        final Map<String, List<String>> hash = new HashMap<>();
        input.forEach(s -> {
            char[] chars = s.toCharArray();

            // Case: One char
            if (chars.length == 1) {
                String key = Integer.toString(0);
                if (hash.get(key) != null) {
                    hash.get(key).add(s);
                } else {
                    List<String> newList = new ArrayList<String>();
                    newList.add(s);
                    hash.put(key, newList);
                }
                return;
            }

            // Case: More than one char
            StringBuffer keyBuff = new StringBuffer();
            for (int i = 0; i < chars.length - 1; i++) {
                int diff = (chars[i] - chars[i + 1] + 26) % 26;
                keyBuff.append(diff);
            }
            String key = keyBuff.toString();
            if (hash.get(key) != null) {
                hash.get(key).add(s);
            } else {
                List<String> newList = new ArrayList<String>();
                newList.add(s);
                hash.put(key, newList);
            }

        });

        List<List<String>> result = new ArrayList<>();
        hash.forEach((key, val) -> {
            result.add(val);
        });
        return result;
    }
}
