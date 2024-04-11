

//User function Template for Java

/*The Node structure is defined as
struct Node {
    int data;
    Node *left;
    Node *right;

};
*/
class Solution
{
     int ans=Integer.MAX_VALUE;
     int a=Integer.MAX_VALUE;
     int b=Integer.MAX_VALUE;
    int absolute_diff(Node root)
    {
        //Your code here
        ans=inorder(root);
       return ans;
    }
    
    int inorder(Node root){
        if(root== null){
        //    ans=root.data;
            return 0;
        }
        
        inorder(root.left);
         a= root.data;
        //  if(root.left == null && root.right==null){
        //      b=root.data;
        //  }else{
            
        ans=Math.min(ans ,Math.abs( b-a)); 
        b=a; 
         
        
        inorder(root.right);
        
        return ans;
    }
}