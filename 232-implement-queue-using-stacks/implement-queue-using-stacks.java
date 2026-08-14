class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public MyQueue() {
        new Stack<>();
  
    }
    
    public void push(int x) {
        while(st.size()!=0){
            st2.push(st.pop());
        }
        st.push(x);
        while(st2.size()!=0){
            st.push(st2.pop());
        }
       
    }
    
    public int pop() { //O(n) 
    //     while(st.size()!=1){
    //         st2.push(st.pop());
    //     }
    //    int x =  st.pop();
    //     while(st2.size()!=0){
    //         st.push(st2.pop());
    //     }
    //     return x;
    return st.pop();
        
    }
    
    public int peek() { //O(n)
    //      while(st.size()!=1){
    //         st2.push(st.pop());
    //     }
    //    int x =  st.peek();
    //     while(st2.size()!=0){
    //         st.push(st2.pop());
    //     }
    //     return x;
    return st.peek();
        
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
         return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */