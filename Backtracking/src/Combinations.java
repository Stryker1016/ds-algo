import java.util.ArrayList;
import java.util.List;

public class Combinations {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(1,n,k,new ArrayList<>());
        return result;
    }
    public void dfs(int curr, int n, int k, List<Integer> list){
        if(k<=0){
            result.add(list);
            return;
        }
        for(int i=curr;i<=n;i++){
            List<Integer> temp = new ArrayList<>(list);
            list.add(i);
            dfs(i+1,n,k-1,list);
            list=new ArrayList<>(temp);
        }
    }
}
