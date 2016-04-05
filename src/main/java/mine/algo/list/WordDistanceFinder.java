package mine.algo.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pratap on 4/5/16.
 */
public class WordDistanceFinder {
    Map<String, List<Integer>> wordIndex = new HashMap<>();

    public WordDistanceFinder (List<String> words) {

        for(int i=0; i< words.size(); i++){
            List<Integer> indexs = wordIndex.get(words.get(i));
            if(indexs != null){
                indexs.add(i);
            } else {
                List<Integer> newIndexs = new ArrayList<Integer>();
                newIndexs.add(i);
                wordIndex.put(words.get(i), newIndexs);
            }
        }
    }
    public int distance (String wordOne, String wordTwo) {
        List<Integer> w1 = wordIndex.get(wordOne);
        List<Integer> w2 = wordIndex.get(wordTwo);
        int w1S = 0;
        int w1E = w1.size()-1;
        int w2S = 0;
        int w2E = w2.size()-1;

        if(w1.get(w1E) < w2.get(w2S)){
            return w2.get(w2S) - w1.get(w1E);
        }

        if(w2.get(w2E) < w1.get(w1S)){
            return w1.get(w1S) - w2.get(w2E);
        }

        if(w1.get(w1E) < w2.get(w2E)){
            while(w1E >=0  && w2S < w2.size() && w1.get(w1E) > w2.get(w2S)){
                w1E--;
                w2S++;
            }
            return w1.get(++w1E) - w2.get(--w2S);
        }else {
            while(w2E >=0  && w1S < w1.size() && w2.get(w2E) > w1.get(w1S)){
                w2E--;
                w1S++;
            }
            return w2.get(++w2E) - w1.get(--w1S);
        }
    }
}