class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        // int ans = 0;

        // for(int i=0; i<n;i++){
        //     int count0 = 0;
        //     for(int j= i; j<n; j++){
        //         if(nums[j]==0){
        //             count0++;
        //         }
        //         if(count0>k){
        //             int len = j-i;
        //             ans = Math.max(len,ans);
        //             break;
        //         }

        //     }

        // }
        // return ans;

        int i = 0;
        int count0 = 0;

        for(int j = 0; j<n; j++){

            if(nums[j]==0) count0++;

            if(count0>k){
                if(nums[i]==0){
                    count0--;
                }
                i++;
            } 

        }

        return n-i;

        
    }
} 