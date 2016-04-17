package mine.algo.strings;

import java.util.*;

/*
Given a string, we can "shift" each of its letter to its successive letter, for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:

"abc" -> "bcd" -> ... -> "xyz"
Given a list of strings which contains only lowercase alphabets, group all strings that belong to the same shifting sequence.

For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"],
Return:

[
  ["abc","bcd","xyz"],
  ["az","ba"],
  ["acef"],
  ["a","z"]
]
 */
public class GroupShiftedStrings {


    public List<List<String>> doGrouping(String[] strings) {
        if (strings == null || strings.length == 0) {
            return Collections.EMPTY_LIST;
        }
        Arrays.sort(strings);
        Map<String, List<String>> container = new HashMap<>();
        for (String item : strings) {
            String hash = getHash(item);
            if (container.containsKey(hash)) container.get(hash).add(item);
            else {
                List<String> groups = new ArrayList<>();
                groups.add(item);
                container.put(hash, groups);
            }
        }

        // convert to output format
        List<List<String>> result = new ArrayList<>();
        for (String key : container.keySet()) {
            result.add(container.get(key));
        }
        return result;
    }

    private String getHash(String input) {
        char[] ic = input.toCharArray();
        String hash = "";
        int offset = ic[0] - 'a';
        for (int i = 0; i < ic.length; i++) {
            char c = (char) (ic[i] - offset);
            if (c < 'a') {
                c += 26;
            }
            hash += c;
        }
        return hash;
    }
}
