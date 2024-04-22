class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        int  i=0 ; 
        int j=0 ; 
       while(i< n && j<m){
           
            if(hs.contains(arr1[i])){
               i++;
               continue;
           }
           if(hs.contains(arr2[j])){
               j++;
               continue;
           }
        
              if(arr1[i]< arr2[j]){
              ans.add(arr1[i]);
              hs.add(arr1[i]);
              i++;
          }else if(arr1[i] == arr2[j]){
              ans.add(arr1[i]);
              hs.add(arr1[i]);
                 i++;
                 j++;
          }else{
              ans.add(arr2[j]);
              hs.add(arr2[j]);
              j++;
          }
          
       }
      
       for( ; i<n; i++){
           if(!hs.contains(arr1[i])){
               ans.add(arr1[i]);
                hs.add(arr1[i]);
           }
       }
       
    
         for(  ; j<m; j++){
           if(!hs.contains(arr2[j])){
               ans.add(arr2[j]);
               hs.add(arr2[j]);
           }
       }  
      

        return ans;
        
    }
}