class Solution {
    public int maxArea(int[] height) {

        int max_area = Integer.MIN_VALUE;
        int n = height.length;
        int i = 0;
        int j = n-1;

               while(i<j){

                int h = Math.min(height[i],height[j]);
                int w = j-i;
                int area = h*w;
                max_area = Math.max(area,max_area);
                if(height[i]<=height[j]) i++;
                else j--;

            }
              return max_area;
        }
    

        
    
}