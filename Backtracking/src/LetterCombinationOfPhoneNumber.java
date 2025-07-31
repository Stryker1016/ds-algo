import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationOfPhoneNumber {
    static List<String> result=new ArrayList<>();
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        Map<Integer, String> map=new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        dfs(digits,new StringBuilder(), map);
        return result;
    }
    public static void dfs(String s, StringBuilder str, Map<Integer, String> map){
        if(s.length()==0){
            result.add(str.toString());
            return;
        }
        int val = Integer.parseInt(s.charAt(0)+"");
        String chars = map.get(val);
        for(int i=0;i<chars.length();i++){
            StringBuilder temp = new StringBuilder(str.toString());
            str.append(chars.charAt(i));
            dfs(s.substring(1), str, map);
            str=temp;
        }
    }
}
