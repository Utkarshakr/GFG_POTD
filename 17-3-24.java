
class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        // add your code here
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> head1Iterator = head1.iterator();
        Iterator<Integer> head2Iterator = head2.iterator();
        int i=0;
        while (head1Iterator.hasNext()) {
            //  Moving cursor to next element
            int j=head1Iterator.next();
           map.put(j, i);
           i++;
        }
         while (head2Iterator.hasNext()) {
            //  Moving cursor to next element
            int k=head2Iterator.next();
          if(map.containsKey(x-k)){
              count++;
          }
        }
        return count;
    }
}
