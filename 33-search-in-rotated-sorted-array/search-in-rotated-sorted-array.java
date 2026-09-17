class Solution {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0,ub = n-1;
        while(lo<=ub){
            int mid = (lo+ub)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(arr[mid]<=arr[n-1]){ // right part is sorted
               if(target>arr[mid]&&target<=arr[n-1]){
                 lo = mid+1;
                 }
                    else{
                        ub = mid-1;
                    }
            }
            else{ // left part is sorted
                if(target>=arr[lo]&&target<arr[mid]){
                    ub = mid-1;
                }
                else{
                    lo = mid+1;
                }



            }
           
        }
        return -1;
    }

}