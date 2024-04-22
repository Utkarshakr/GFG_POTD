
class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
        int l =0; 
        int n =arr.length;
        int r =n-1;
        
        for(int i=0 ; i<=r ; i++){
            if(arr[i] < a){
                swap(arr , l , i);
                l++;
            }else if(arr[i]> b){
                swap(arr , r , i);
                r--;
                i--;
            }
            
            if(l ==r){
                break;
            }
            
        }
    }
    
    private void swap( int arr[] , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}