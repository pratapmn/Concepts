package mine.algo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratapn on 4/6/16.
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        int[] result = new int[nums.length];
        int[] visited = new int[nums.length];
        for(int i=0; i<visited.length; i++){
            visited[i] = 1;
        }
        List<List<Integer>> fullSol = new ArrayList<>();
        return findSubsets(nums, visited, result, 0, fullSol, 0);
    }

    private List<List<Integer>> findSubsets( int[] nums, int[] visited, int[]result, int level, List<List<Integer>> fullSol, int pos){

        // Add to final result
        List<Integer> resultList = new ArrayList<Integer>();
        for(int j = 0; j<level; j++){
            resultList.add(result[j]);
        }
        resultList.sort((o1, o2) -> {
            if(o1 > o2) return 1;
            if(o1 == o2) return 0;
            else return -1;
        });
        fullSol.add(resultList);

        // Find combinations using recursion
        for(int i = pos; i < nums.length ; i++){
            if(visited[i] == 0) {
                continue;
            }
            visited[i]--;
            result[level] = nums[i];
            findSubsets(nums, visited, result, level+1, fullSol, i);
            visited[i]++;
        }
        return fullSol;
    }
}
