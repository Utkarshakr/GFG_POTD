

//User function Template for Java


class Solution
{
    public static int[] countElements(int a[], int b[], int n, int query[], int q)
    {
        int[] ans = new int[q];
        
        for(int i=0; i<q ; i++)
        {
            int count =0;
            int x=query[i];
            int y=a[x];
            
            for(int j=0; j<n ; j++)
            {
                if(y>= b[j])
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}