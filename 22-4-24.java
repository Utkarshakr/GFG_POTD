
class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int count =0;
        int ans =1;
        int count1 = 1000000;
        for(int i = 0 ; i<n ; i++ ){
            for(int j=0 ; j<m; j++){
                if(a[i][j]==1){
                    count ++;
                }
            }
            if(count1 > count){
                count1 = count;
                ans = i+1;
            }
            count =0;
        }
        
        return ans;
    }
};