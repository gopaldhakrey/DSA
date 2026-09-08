class Solution {
    public int compress(char[] arr) {

         int count = 1;

        StringBuilder sb = new StringBuilder("");

            sb.append(arr[0]);

            for(int i=1;i<arr.length;i++){

                if(arr[i]!=arr[i-1]){
                    if(count>1){
                        sb.append(count+"");    
                    }
                    sb.append(arr[i]);
                    count = 1;

                }
                else{
                    count++;
                }


            } 
             if(count>1){
                        sb.append(count+"");   
                    }

   for(int i=0;i<sb.length();i++){
    char ch = sb.charAt(i);
    arr[i] = ch;

        }
        return sb.length();


       

            
        




       

    


        
    }
}