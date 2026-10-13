class Solution {
    public int minAddToMakeValid(String s) {

        Stack<Integer> st= new Stack<>();
         int count = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else {
                if(st.isEmpty()){
                    count++;
                }
                else{
                    st.pop();
                }

            }
        }
       return count+st.size();  // st.size() how many opening bracts are still there
        

        
    }
}