public class Candy {
    public int candy(int[] ratings) {
        if(ratings.length==0){
            return 0;
        }
        int up=0, down=0, peak=0, res=1;
        for(int i=1;i<ratings.length;i++){
            int prev=ratings[i-1];
            int curr=ratings[i];
            if(prev<curr){
                up++;
                down=0;
                peak=up;
                res+=up+1;
            } else if(prev==curr) {
                up=0;
                down=0;
                peak=0;
                res+=1;
            } else {
                up=0;
                down++;
                res+=down+1;
                if(peak>=down){
                    res--;
                }
            }
        }
        return res;
    }
}
