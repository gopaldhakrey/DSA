class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        int lo = 0;
        int ub = arr.length-1;
        int ans = 0;
        while(lo<=ub){
            int mid = (lo+ub)/2;
            if(arr[mid]>=arr[mid+1]){
                ans = mid;
                ub = mid-1;
            }
            else{

                lo = mid+1;
            }

        }
        return ans;
      

    }
}