
class Solution{
    public int sumOfLongRootToLeafPath(Node root)
    {
        //code here
        NodeSum rootNodeSum = height(root);
        return rootNodeSum.Sum;
    }
    public NodeSum height(Node node){
        if(node==null){
            return new NodeSum(0,0);
        } 
        NodeSum nsl = height(node.left);
        NodeSum nsr = height(node.right);

        if(nsl.height == nsr.height) {
            nsl.Sum = Math.max( nsl.Sum , nsr.Sum ) + node.data;
            nsl.height = ( 1+nsl.height );
            return nsl;
        }
        if(nsl.height > nsr.height){
           nsl.height = 1 + nsl.height ;
           nsl.Sum = nsl .Sum + node.data;
           return nsl;
        } else{
            nsr.height = 1 + nsr.height ;
            nsr.Sum = nsr .Sum + node.data;
           return nsr;
        }
    } 
}
class NodeSum {
    int height;
    int Sum;
    public NodeSum( int Sum , int height ){
        this.height = height;
        this.Sum = Sum;
    }
}