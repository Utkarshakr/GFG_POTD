
class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
    //Your code here
    long b=1000000007;
    int n=s.length();
    long[] a= new long[n+1];
    long sum =0;
    a[0]=0;
    for(int i=0; i<n ; i++)
    {
        int x=s.charAt(i)-'0';
        
            a[i+1]=(x*(i+1)+ (10*(a[i]))%b )%b;
        
        sum =( sum + a[i+1])%b;
        
    }

     return sum;
    }
}