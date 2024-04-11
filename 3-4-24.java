



// User function Template for Java
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public int kthCommonAncestor(Node root, int k, int x, int y) {
        // code here
        fn(root,x,y);
    // System.out.println()
        int n = ans.size();
        int count = 0;
        for(int i=n-1;i>= 0;i--){
            count++;
            if(count==k) return ans.get(i);
        }
        return -1;
    }
    public void fn(Node root, int x , int y){
        if(root==null) return;
        if(root.data == x ) {
            ans.add(x);
            return;
        } 
        if( root.data == y) {
             ans.add(y);
            return;
        }
        ans.add(root.data);
        if(root.data < x && root.data < y){
             fn(root.right,x,y);
        } else if( root.data > x && root.data > y  ){
           
            fn(root.left,x,y);
        } else {
            return;
        }
    }
}