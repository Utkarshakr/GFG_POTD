
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0 ; i<b.length ; i++ ){
            hs.add(b[i]);
        }
        
        for(int j=0 ; j<a.length ; j++){
            if(!hs.contains(a[j])){
                ans.add(a[j]);
            }
        }
        
        return ans;
    }
}
