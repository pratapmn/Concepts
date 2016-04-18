package mine.algo.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pratap on 4/5/16.
 */
public class WordDistance {

    Map<String, List<Integer>> indexs = new HashMap<>();
    public WordDistance(String[] words) {
        for(int i = 0; i < words.length; i++){
            List wIndex = indexs.get(words[i]);
            if(wIndex == null){
                List index = new ArrayList<Integer>();
                index.add(i);
                indexs.put(words[i], index);
            } else {
                wIndex.add(i);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> w1 = indexs.get(word1);
        List<Integer> w2 = indexs.get(word2);
        int distance = Integer.MAX_VALUE;
        for(int i = 0, j = 0; i < w1.size() && j < w2.size();){
            if(w1.get(i) > w2.get(j)){
                distance = Math.min( distance, w1.get(i) - w2.get(j));
                j++;
            } else {
                distance = Math.min( distance, w2.get(j) - w1.get(i));
                i++;
            }
        }
        return distance;
    }
}
