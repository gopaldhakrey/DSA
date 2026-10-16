class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max_Count = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                max_Count = Math.max(count,max_Count);
                count = 0;
            }
        }

        return Math.max(max_Count,count);
       
    
                
           

    }
} 