import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int n=words.length;
        int i=0;
        while(i<n){
            StringBuilder sb=new StringBuilder();
            while(i<n && (sb.length()+words[i].length()<=maxWidth)){
                sb.append(words[i]).append(" ");
                i++;
            }
            String str=sb.toString().trim();
            if(i<n){
                ans.add(addSpaces(str, maxWidth));
            } else {
                while(str.length()!=maxWidth){
                    str+=" ";
                }
                ans.add(str);
            }
        }
        return ans;
    }
    String addSpaces(String str, int maxWidth){
        String[] arr = str.split(" ");
        int count=arr.length-1;
        if(count==0){
            while(str.length()!=maxWidth){
                str+=" ";
            }
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int padding =  maxWidth-str.length();
        int eqSpaces = padding/count;
        int extraSpaces = padding%count;
        String space = " ";
        while(eqSpaces-->0){
            space+= " ";
        }
        String sp = space+" ";
        for(String s : arr){
            if(extraSpaces-->0){
                sb.append(s+sp);
            } else {
                sb.append(s+space);
            }
        }
        return sb.toString().trim();
    }
}
