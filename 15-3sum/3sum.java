class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> ans= new HashSet<>();
        int n = arr.length;
        Arrays.sort(arr);
        for( int i=0 ; i<n-2; i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                 int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    ans.add(list);
                    j++;
                    k--;
                }  
               else if(sum>0){
                k--;
               }
                else{
                    j++;
                }

            }

        } 
        return new ArrayList(ans);

      
    

       

     


        



        
    }
}