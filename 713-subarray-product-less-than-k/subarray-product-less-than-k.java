class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        // int ans = 0;
        // for(int i = 0; i<n; i++){
        //     int product = 1;
        //     for(int j=i; j>=0; j--){
        //         product *= nums[j];
        //         if(product<k) ans++;
        //         else{
        //             break;
        //         }
        //     }
        // }
        // return ans;

        if(k<=1){
            return 0;
        }
        int i = 0;
        int product = 1;
        int ans = 0;
        for(int j=0; j<n; j++){
            product *= nums[j];
                while(product>=k){
                    product /= nums[i];
                    i++;
                }                 
                  ans += j-i+1; 
        }

        return ans;
        
    }
}