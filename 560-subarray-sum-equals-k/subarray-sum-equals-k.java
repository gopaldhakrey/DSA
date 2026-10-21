class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // for(int i = 0; i<nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j<nums.length;j++){
        //         sum += nums[j];
        //         if(sum==k) count++;

        //     }
        // }
        // return count;


        int n = nums.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        for(int ele : nums){
             prefixSum += ele;
             int target = prefixSum - k;
             if(map.containsKey(target)){
                count += map.get(target);
             } 

             map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }

        return count;


        
    }
} 