
class Solution {
    static Long reversedBits(Long n) {
        // code here
        long[] bits= new long[32] ;
        for(int i=31; i>=0 ;i--){
            bits[i]=n%2;
            n=n/2;
        }
         for(int i=0; i<16 ;i++){
           // swap(bits[i] , bits[31-i]);
           long a=bits[i];
           long b=bits[31-i];
           
           a=a^b;
           b=a^b;
           a=a^b;
           
        }
        long sum=0;
        for(int i=31; i>=0 ;i--){
            sum += (bits[i])*(Math.pow(2, i));
        }
        
        return sum;
        
    }
    
};