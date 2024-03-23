
class Solution {

    int[] Series(int n) {
        // code here
        int[] a= new int[n+1];
       int m=1000000007;
        a[0]=0;
        a[1]=1;
        int b=1;
        for(int i=2;i<=n ;i++){
           a[i]=(a[i-1]+a[i-2])%(m);
           
        //   if(a[i]>=Integer.MAX_VALUE){
        //       a[i]=a[i]%(109+7);
        //   }
         }
         
         return a;
    }
}