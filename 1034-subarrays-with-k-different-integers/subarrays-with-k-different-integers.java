class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int n = nums.length;
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     HashMap<Integer,Integer> map = new HashMap<>();
        //     for(int j=i; j<n; j++){
        //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        //         if(map.size()==k){
        //             count++;
        //         }
        //          else if(map.size()>k) break;
        //     }

           
        // }
        // return count;

        return includeLessthan(nums,k)-includeLessthan(nums,k-1);

       

        }       
   

private int includeLessthan(int nums[],int k){
    int n = nums.length;
     int i = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0; j<n;j++){
             map.put(nums[j],map.getOrDefault(nums[j],0)+1);
              while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }  
                i++;       
        }
        count+=j-i+1;
}
     return count;
}
}