public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int curr =0; boolean down=false;
        for(char ch : s.toCharArray()){
            rows[curr].append(ch);
            if(curr==0 || curr==numRows-1){
                down=!down;
            }
            curr += down?1:-1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : rows){
            res.append(sb);
        }
        return res.toString();
    }
}
