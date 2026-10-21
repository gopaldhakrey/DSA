class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    //     int n = nums.length;
    //     int[] ans = new int[n-k+1];
    //     for(int i=0; i<n-k+1;i++){
    //         int max = nums[i];
    //         for(int j=i; j<i+k;j++){
    //             max = Math.max(max,nums[j]);
    //         }
    //         ans[i] = max;
    //     }

    //     return ans;
    // }

    int n = nums.length;
    Deque<Integer> q = new ArrayDeque<>();
    int[] ans = new int[n-k+1];

    for(int i=0; i<k; i++){
        while(q.size()>0 && nums[q.peekLast()]<=nums[i]){
            q.pollLast();
        }
        q.offerLast(i);
    }
     ans[0] = nums[q.peekFirst()];

    for(int i=k; i<n;i++){
        while(q.size()>0 && q.peekFirst()<=i-k){
            q.pollFirst();
        }

         while(q.size()>0 && nums[q.peekLast()]<=nums[i]){
            q.pollLast();
        }

        q.offerLast(i);
        ans[i - k + 1] = nums[q.peekFirst()];
      
    }

    // ans[ans.length-1] = nums[q.peekFirst()];

    return ans;




   






    }

    










}
