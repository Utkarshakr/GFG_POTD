

//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
         StringBuilder s = new StringBuilder();
        Set<Character> hs = new HashSet<Character>();
        
        for(int i=0;i<str.length();i++){
            if(!hs.contains(str.charAt(i))){
                hs.add(str.charAt(i));
                s.append(str.charAt(i));
            }
        }
        
        return s.toString();
    }
}