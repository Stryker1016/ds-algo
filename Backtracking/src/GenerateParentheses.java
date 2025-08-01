import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    List<String> result= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(0,0,0,n,"");
        return result;
    }
    public void dfs(int t, int o, int c, int n, String str) {
        if(t==2*n){
            result.add(str);
            return;
        }
        if(o<n){
            dfs(t+1,o+1,c,n,str+"(");
        }
        if(c<o){
            dfs(t+1,o,c+1,n,str+")");
        }
    }
}
