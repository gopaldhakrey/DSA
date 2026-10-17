class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
    //     int count = 0;
    //     for(int i=0; i<n;i++){
    //         int sum = 0;
    //         for(int j=i; j<n; j++){
    //             sum += nums[j];
    //             if(sum>=target){
    //              count = j-i+1;
    //              ans =  Math.min(count,ans);
    //              break;
    //             }    
    //         }   
    //     }
    //    if(ans==Integer.MAX_VALUE){
    //     return 0;
    //    }
    //    return ans;

     int sum = 0;
     int i = 0;
     for(int j=0; j<n; j++){
        sum += nums[j];
        while(sum>=target){
            int length = j-i+1;
            ans = Math.min(length,ans);
            sum -= nums[i];
            i++;
        }
     }
    
       return ans == Integer.MAX_VALUE ? 0 : ans;
        
    }
}