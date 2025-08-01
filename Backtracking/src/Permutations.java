import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(new HashSet<>(), nums, new ArrayList<>());
        return result;
    }

    public void dfs(Set<Integer> set, int[] nums, List<Integer> list){
        if(list.size()==nums.length){
            result.add(list);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }
            List<Integer> temp = new ArrayList<>(list);
            list.add(nums[i]);
            set.add(nums[i]);
            dfs(set,nums, list);
            set.remove(nums[i]);
            list=new ArrayList<>(temp);
        }
    }
}
