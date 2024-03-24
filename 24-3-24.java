class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
         Stack<Integer> stack = new Stack<Integer>();
         
         while(!st.isEmpty()){
             int y= st.pop();
             stack.push(y);
         }
         
         st.push(x);
         
          while(!stack.isEmpty()){
             int z= stack.pop();
             st.push(z);
         }
         return st;
    }
}